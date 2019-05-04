package com.xperianworld.probability;

public class TeamProbableInput {
	private int numberOfBatsmen, numberOfBowlers, numberOfAllRounders;

	public TeamProbableInput(int numberOfBatsmen, int numberOfBowlers, int numberOfAllRounders) {
		super();
		this.numberOfBatsmen = numberOfBatsmen;
		this.numberOfBowlers = numberOfBowlers;
		this.numberOfAllRounders = numberOfAllRounders;
	}

	public int getNumberOfBatsmen() {
		return numberOfBatsmen;
	}

	public int getNumberOfBowlers() {
		return numberOfBowlers;
	}

	public int getNumberOfAllRounders() {
		return numberOfAllRounders;
	}

}
