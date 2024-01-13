# Vote Application

## Overview
This Java Spring Boot application implements a basic voting system with REST APIs to enter candidates, cast votes, count votes, list votes, and determine the winner.

## Project Structure
- **Candidate.java:** Defines the Candidate class.
- **VoteService.java:** Implements vote-related logic using local variables.
- **VoteController.java:** Exposes REST APIs for vote operations.
- **Application.java:** Spring Boot application entry point.

## Usage Guide
1. Build and run the application.
2. Use the following endpoints:
   - `POST /entercandidate?name={candidateName}`: Enter a new candidate.
   - `POST /castvote?name={candidateName}`: Cast a vote for a candidate.
   - `GET /countvote?name={candidateName}`: Count votes for a candidate.
   - `GET /listvote`: List all candidates and their vote counts.
   - `GET /getwinner`: Get the winner's name.

## Unit Testing
Unit tests can be added using JUnit to validate the functionality of VoteService methods.

## Author
Kartik
