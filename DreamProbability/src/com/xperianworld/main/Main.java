package com.xperianworld.main;

import java.util.Scanner;

import com.xperianworld.probability.FactorialN;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first team name: ");
		String team1 = scn.nextLine();

		System.out.println("Enter the second team name: ");
		String team2 = scn.nextLine();

		System.out.println("Enter " + team1 + " batsmen number: ");
		int teamOneBatsmen = scn.nextInt();

		System.out.println("Enter " + team2 + " batsmen number: ");
		int teamtwoBatsmen = scn.nextInt();

		System.out.println("Enter " + team1 + " bowlers number: ");
		int teamOneBowlers = scn.nextInt();

		System.out.println("Enter " + team2 + " bowlers number: ");
		int teamtwoBowlers = scn.nextInt();

		System.out.println("Enter " + team1 + " all rounders number: ");
		int teamOneAllRounders = scn.nextInt();

		System.out.println("Enter " + team2 + " all rounders number: ");
		int teamtwoAllRounders = scn.nextInt();

		scn.close();

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
