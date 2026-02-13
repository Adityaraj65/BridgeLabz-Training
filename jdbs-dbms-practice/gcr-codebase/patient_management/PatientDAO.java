package patient_management;

import java.sql.*;

public class PatientDAO {

    // We check phone/email to avoid duplicate patient registration
    public boolean isPatientExists(String phone, String email) throws SQLException {

        String sql = "SELECT 1 FROM patients WHERE phone = ? OR email = ?";

        // try-with-resources ensures connection is closed automatically
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            // Setting values safely to prevent SQL Injection
            ps.setString(1, phone);
            ps.setString(2, email);

            ResultSet rs = ps.executeQuery();

            // If at least one record is found → patient exists
            return rs.next();
        }
    }
//UC1.1
    public int registerPatient(Patient patient) throws SQLException {

        String sql = "INSERT INTO patients " +
                "(name, dob, phone, email, address, blood_group) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps =
                     con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            // Mapping Java object values to SQL columns
            ps.setString(1, patient.getName());
            ps.setDate(2, Date.valueOf(patient.getDob()));
            ps.setString(3, patient.getPhone());
            ps.setString(4, patient.getEmail());
            ps.setString(5, patient.getAddress());
            ps.setString(6, patient.getBloodGroup());

            // executeUpdate is used for INSERT / UPDATE / DELETE
            ps.executeUpdate();

            // Fetch auto-generated patient_id
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        }
        return -1; // registration failed
    }
    //UC1.2
    public boolean updatePatient(int patientId, String address, String phone)
            throws SQLException {

        String sql = "UPDATE patients SET address = ?, phone = ? " +
                "WHERE patient_id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, address);
            ps.setString(2, phone);
            ps.setInt(3, patientId);

            // If rows affected > 0 → update successful
            return ps.executeUpdate() > 0;
        }
    }
    //UC1.3
    public void searchPatientByName(String name) throws SQLException {

        String sql = "SELECT patient_id, name, phone FROM patients " +
                "WHERE name LIKE ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            // % allows partial name search
            ps.setString(1, "%" + name + "%");

            ResultSet rs = ps.executeQuery();

            // Iterating ResultSet row by row
            while (rs.next()) {
                System.out.println(
                        rs.getInt("patient_id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("phone")
                );
            }
        }
    }
}




