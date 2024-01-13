package com.example.springbootapp;//Package
import java.util.ArrayList;  // Import ArrayList
import java.util.List;       // Import List

public class VoteService {   // Declare VoteService class
    private static final List<Candidate> candidates = new ArrayList<>();  // Initialize candidates list

    public static void enterCandidate(String name) {  // Method to enter candidate
        Candidate candidate = new Candidate(name);    // Create candidate object
        candidates.add(candidate);                    // Add to list
    }

    public static int countVote(String name) {        // Method to count votes
        Candidate candidate = findCandidateByName(name);  // Find candidate
        return (candidate != null) ? candidate.getVoteCount() : -1;  // Return vote count or -1 if invalid candidate
    }

    private static Candidate findCandidateByName(String name) {  // Helper method to find candidate by name
        return candidates.stream().filter(candidate -> candidate.getName().equals(name)).findFirst().orElse(null);  // Return candidate or null if not found
    }
}

