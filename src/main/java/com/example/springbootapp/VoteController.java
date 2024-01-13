package com.example.springbootapp;

//VoteController.java
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController   
public class VoteController {

 @PostMapping("/entercandidate") // Handle POST request for entering a candidate
 public void enterCandidate(@RequestParam String name) {
     VoteService.enterCandidate(name);//entercandidate   method invoked
 }

 @PostMapping("/castvote") // Handle POST request for casting a vote
 public int castVote(@RequestParam String name) {
     return VoteService.castVote(name); //castvote method invkoed return vote count
 }

 @GetMapping("/countvote")  // Handle GET request for counting votes
 public int countVote(@RequestParam String name) {
     return VoteService.countVote(name);//count vote method invoked 
 }

 @GetMapping("/listvote") // Handle GET request for list vote 
 public List<Candidate> listVote() {  // Define method to list votes
     return VoteService.listVote(); //list vote method invoked
 }

 @GetMapping("/getwinner") // Handle Get request for find out winner 
 public String getWinner() {
     return VoteService.getWinner();//getwinner method is invoked to find out winner 
 }
}
