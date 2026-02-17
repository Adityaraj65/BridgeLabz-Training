package employeewagecomputation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/*
 * JUnit 5 test cases for Employee Wage Computation
 */
public class EmpWageBuilderTest {

    @Test
    void givenValidCompany_whenWageComputed_shouldReturnPositiveWage() {

        EmpWageBuilder builder = new EmpWageBuilder();
        builder.addCompanyEmpWage("Amazon", 30, 20, 100);

        builder.computeEmpWage();

        int wage = builder.getTotalWage("Amazon");
        assertTrue(wage > 0);
    }

    @Test
    void givenInvalidCompanyName_shouldThrowException() {

        EmpWageBuilder builder = new EmpWageBuilder();

        assertThrows(IllegalArgumentException.class, () ->
                builder.addCompanyEmpWage("amazon", 20, 20, 100)
        );
    }

    @Test
    void givenZeroWage_shouldThrowException() {

        EmpWageBuilder builder = new EmpWageBuilder();

        assertThrows(IllegalArgumentException.class, () ->
                builder.addCompanyEmpWage("Google", 0, 20, 100)
        );
    }

    @Test
    void givenNegativeWorkingDays_shouldThrowException() {

        EmpWageBuilder builder = new EmpWageBuilder();

        assertThrows(IllegalArgumentException.class, () ->
                builder.addCompanyEmpWage("Microsoft", 25, -5, 100)
        );
    }

    @Test
    void givenUnknownCompany_whenQueried_shouldReturnZero() {

        EmpWageBuilder builder = new EmpWageBuilder();
        builder.addCompanyEmpWage("Netflix", 40, 20, 100);

        builder.computeEmpWage();

        int wage = builder.getTotalWage("Apple");
        assertEquals(0, wage);
    }
}
