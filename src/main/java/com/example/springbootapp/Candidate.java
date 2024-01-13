package com.example.springbootapp;

public class Candidate {
 private String name;//candidate name  
 private int voteCount; // number  of vote to count 

 public Candidate(String name) { 
     this.name = name; //set name 
     this.voteCount = 0; //initialize count zero 
 }

 public String getName() {
     return name; //get name and return
 }

 public int getVoteCount() {
     return voteCount; //get vote count and return
 }

 public void incrementVoteCount() {
     this.voteCount++; //post-increment number of  vote  
 }
}

