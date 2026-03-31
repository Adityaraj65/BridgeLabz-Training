package OnlineVotingSystem;

public class Main {
    public static void main(String[] args) {

        ElectionService election = new ElectionServiceImpl();

        // Create voters
        Voter aditya = new Voter(1, "Aditya");
        Voter rahul = new Voter(2, "Rahul");

        // Create candidates
        Candidate c1 = new Candidate(101, "Candidate A");
        Candidate c2 = new Candidate(102, "Candidate B");

        // Register voters
        election.registerVoter(aditya);
        election.registerVoter(rahul);

        // Add candidates
        election.addCandidate(c1);
        election.addCandidate(c2);

        try {
            // Cast votes
            election.castVote(aditya, c1);
            election.castVote(rahul, c2);

            // Duplicate vote (will throw exception)
            election.castVote(aditya, c2);

        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }

        // Declare result
        election.declareResult();
    }
}

