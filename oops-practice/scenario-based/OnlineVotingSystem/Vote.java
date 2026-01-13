package OnlineVotingSystem;

// Represents a single vote
public class Vote {
    Voter voter;
    Candidate candidate;

    public Vote(Voter voter, Candidate candidate) {
        this.voter = voter;
        this.candidate = candidate;
    }
}
