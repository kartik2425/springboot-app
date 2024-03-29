package com.example.springbootapp;//Package
import java.util.ArrayList;  // Import ArrayList
import java.util.List;       // Import List

public class VoteService {   // Declare VoteService class
    private static final List<Candidate> candidates = new ArrayList<>();  // Initialize candidates list

    public static void enterCandidate(String name) {  // Method to enter candidate
        Candidate candidate = new Candidate(name);    // Create candidate object
        candidates.add(candidate);                    // Add to list
    }

    public static int castVote(String name) {         // Method to cast vote
        Candidate candidate = findCandidateByName(name);  // Find candidate
        if (candidate != null) {                       // Check if valid
            candidate.incrementVoteCount();           // Increment votes
            return candidate.getVoteCount();           // Return vote count
        }
        return -1;  // Invalid candidate
    }
    public static int countVote(String name) {        // Method to count votes
        Candidate candidate = findCandidateByName(name);  // Find candidate
        return (candidate != null) ? candidate.getVoteCount() : -1;  // Return vote count or -1 if invalid candidate
    }

    public static List<Candidate> listVote() {         // Method to list votes
        return candidates;  // Return candidate list
    }

    public static String getWinner() {                 // Method to get winner
        Candidate winner = candidates.stream().max((c1, c2) -> Integer.compare(c1.getVoteCount(), c2.getVoteCount())).orElse(null);  // Find winner
        return (winner != null) ? winner.getName() : "No winner yet";  // Return winner's name or 'No winner yet'
    }

    private static Candidate findCandidateByName(String name) {  // Helper method to find candidate by name
        return candidates.stream().filter(candidate -> candidate.getName().equals(name)).findFirst().orElse(null);  // Return candidate or null if not found
    }
}

