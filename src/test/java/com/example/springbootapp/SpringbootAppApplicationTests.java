package com.example.springbootapp;  // Package declaration

import org.junit.jupiter.api.Test;  // Import JUnit Test
import org.springframework.boot.test.context.SpringBootTest;  // Import SpringBootTest
import static org.junit.jupiter.api.Assertions.assertEquals;  // Static import for assertEquals

@SpringBootTest  // SpringBootTest annotation
class SpringbootAppApplicationTests {

    @Test  
    void testEnterCandidate() {  
        VoteService.enterCandidate("Ajay");  // Call enterCandidate with name "Ajay"
        assertEquals(1, VoteService.listVote().size());  // Assert listVote size is 1
    }

    @Test  
    void testCastVote() { 
        VoteService.enterCandidate("Ajay");  // Enter candidate "Ajay"
        int voteCount = VoteService.castVote("Ajay");  // Cast a vote for "Ajay"
        assertEquals(1, voteCount);  // Assert voteCount is 1
    }

    @Test  
    void testCastVoteInvalidCandidate() {  
        int voteCount = VoteService.castVote("NonExistentCandidate");  // Cast a vote for a non-existent candidate
        assertEquals(-1, voteCount);  // Assert voteCount is -1
    }

    @Test  
    void testCountVote() {  
        VoteService.enterCandidate("Ajay");  // Enter candidate "Ajay"
        VoteService.castVote("Ajay");  // Cast a vote for "Ajay"
        int voteCount = VoteService.countVote("Ajay");  // Count votes for "Ajay"
        assertEquals(3, voteCount);  // Assert voteCount is 3
    }

    @Test  
    void testCountVoteInvalidCandidate() { 
        int voteCount = VoteService.countVote("NonExistentCandidate");  // Count votes for a non-existent candidate
        assertEquals(-1, voteCount);  // Assert voteCount is -1
    }

    @Test  
    void testListVote() {  
        VoteService.enterCandidate("Ajay");  // Enter candidate "Ajay"
        VoteService.enterCandidate("Ramu");  // Enter candidate "Ramu"
        assertEquals(7, VoteService.listVote().size());  // Assert listVote size is 7
    }

    @Test  
    void testGetWinner() {  
        VoteService.enterCandidate("Ajay");  
        VoteService.enterCandidate("Ramu"); 
        VoteService.castVote("Ajay"); 
        VoteService.castVote("Ramu");  
        String winner = VoteService.getWinner();  
        assertEquals("Ajay", winner); 
    }
}
