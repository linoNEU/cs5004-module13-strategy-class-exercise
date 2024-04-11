# Connect Four Game Using Strategies

This repository contains a Java implementation of the classic game Connect Four. The project is designed as an exercise for Module 13 of the CS 5004 Object-Oriented Design course. The main goal of this exercise is to illustrate the use of the Strategy Design Pattern.

## Project Structure

The project is structured into two main parts:

1. `ConnectFourModel`: This is the model for the Connect Four game. It includes methods for making a move, checking if the game is over, resetting the board, getting the current state of the board, and setting the game strategy.

2. `GameStrategy`: This is an interface that defines the strategy for the game. Two strategies have been implemented: `RandomGameStrategy` and `DefensiveGameStrategy`.

## Strategy Pattern

The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm at runtime. In the context of this project, it allows us to switch between different game strategies (random and defensive) at runtime.

## Usage

To illustrate the Strategy Pattern, a driver class `Main` has been created. This class initializes a game of Connect Four and demonstrates the use of both the random and defensive strategies.

## Testing

Students can test their understanding of the Strategy Pattern by modifying the driver class to switch between different game strategies and observing the results.
