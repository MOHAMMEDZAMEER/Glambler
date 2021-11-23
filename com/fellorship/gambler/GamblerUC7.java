package com.fellorship.gambler;

public class GamblerUC7 {

	double amount =100d; //amount off gambler start with
	final double Betting_Amount=1d;//betting amount is fixed to 1
	final double Betting_Range_Win=150d;//to reach upper limit stop betting
	final double Betting_Range_lose=50d;//to reach lower limit betting stop
	double winnings=0;
	

	
	int wins = 0;
	int winMax = 0;
	int loss = 0;
	int lossMax = 0;
	
	int luckyDay = 0;
	int worstDay = 0;
	
	//The gamble function allows the user to win
	public void round() {
		int win = (int)(Math.random() * 2); // We are setting a gamble variable that is randomly set to 0 or 1
		
		// If win is equal to 1 it means he has won the gamble
		if (win == 1) {
			amount += Betting_Amount;
			wins++;
//			System.out.println(" Player won this round");
		}
		// If win is equal to 0 it means he has lost the gamble
		else {
			amount -= Betting_Amount;
			loss++;
//			System.out.println(" Player lost this round");
		}		
	}
	
	public void gamble() {
		
		// Gambler stops if the amount is increased or decreased by 50%
		while (amount > Betting_Range_lose && amount < Betting_Range_Win) {
			round();
		}
		
		// Update total winning amount for this day
		if(amount == 150) {
			winnings += 50;
			System.out.println(" Gambler won 50$ today");
		}
		else {
			winnings -= 50;
			System.out.println(" Gambler lost 50$ today");
		}
	}
	
	public void gambleForMonth() {
		
		//We gamble for 30 days
		for (int days = 0; days < 30; days++) {
			System.out.println("\n DAY " + days);
			gamble();			
			// We set the new luckiest day
			if(wins > winMax) {
				winMax = wins;
				luckyDay = days + 1;
			}
			
			// We set the new unluckiest day
			if(loss > lossMax) {
				lossMax = loss;
				worstDay = days + 1;
			}
			
			wins = 0;
			loss = 0;
			
			// Display total winnings so far
			if (winnings >= 0) 
				System.out.println(" The gambler has won " + winnings + " so far");
			else
				System.out.println(" The gambler has lost " + (-winnings) + " so far");
			amount = 100d;
		}
		
		// Display the luckiest and unluckiest day 
		System.out.println(" The luckiest day you had was day " + luckyDay + " with winnings of " + winMax);
		System.out.println(" The worst day you had was day " + worstDay + " with losses of " + lossMax);
	}
	
	

}
