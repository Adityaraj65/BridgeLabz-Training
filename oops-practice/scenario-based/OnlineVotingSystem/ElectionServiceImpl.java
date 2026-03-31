package OnlineVotingSystem;

import java.util.ArrayList;
import java.util.List;

public class ElectionServiceImpl extends ElectionService {

    List<Voter> voters = new ArrayList<>();
    List<Candidate> candidates = new ArrayList<>();
    List<Vote> votes = new ArrayList<>();

    @Override
    public void registerVoter(Voter voter) {
        voters.add(voter);
        System.out.println("Voter registered: " + voter.name);
    }

    @Override
    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
        System.out.println("Candidate added: " + candidate.name);
    }

    @Override
    public void castVote(Voter voter, Candidate candidate)
            throws DuplicateVoteException {

        // Check if voter already voted
        if (voter.hasVoted) {
            throw new DuplicateVoteException("Voter has already voted!");
        }

        voter.hasVoted = true;
        candidate.voteCount++;

        votes.add(new Vote(voter, candidate));

        System.out.println(voter.name + " voted for " + candidate.name);
    }

    @Override
    public void declareResult() {
        System.out.println("\n--- Election Result ---");

        for (Candidate c : candidates) {
            System.out.println(c.name + " : " + c.voteCount + " votes");
        }
    }
}

