# DICE_GAME

Dice Game is a Java application that implements a classic dice game. Players roll two dice, and if the sum is 7, they win; otherwise, they lose. The game keeps track of each player's rolls, success rate, and provides various functionalities such as registration, viewing roll history, and statistics.

## Features
Registration: Users can register with a unique name or choose to remain anonymous.
Rolling Dice: Players can roll the dice to play the game.
Roll History: Each player can view their roll history, including the value of each die and the outcome of the game (win or lose).
Success Rate: Players can see their success rate, calculated based on all their rolls.
Player Management: Players can update their names and delete their roll history.
Leaderboard: The software provides functionalities to list all players, their success rates, and the average success rate of all players in the system.
Design Patterns
The software follows the principles of various design patterns to ensure scalability, maintainability, and extensibility.


## Implementation Phases
Phase 1: Persistence with MySQL
Utilizes MySQL as the backend database for data storage.

Phase 2: Migration to MongoDB
Changes the persistence mechanism to MongoDB for data storage.

Phase 3: Security Enhancement with JWT
Adds JWT authentication to secure access to all endpoints of the microservice.

## Notes
Players can register anonymously if they prefer.
Players can update their names but cannot delete specific rolls; they can only delete their entire roll history.
The application ensures compliance with the provided URL endpoints and implements security measures as per Phase 3 requirements.
Enjoy playing and may the odds be in your favor!
