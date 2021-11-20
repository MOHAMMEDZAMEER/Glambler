package com.fellorship.gambler;

public class gamblerUC3 {
		double amount = 100d; // Amount gambler starts off with
		final double BETTING_AMOUNT = 1d; // The betting amount is always fixed to 1
		final double BETTING_RANGE_WIN = 150d; // The upper limit of the amount 
		final double BETTING_RANGE_LOSE = 50d; // The lower limit of the amount

		//The gamble function allows the user to win
		public void round() {
			int win = (int)(Math.random() * 2); // We are setting a gamble variable that is randomly set to 0 or 1

			// If win is equal to 1 it means he has won the gamble
			if (win == 1) {
				amount += BETTING_AMOUNT;
				System.out.println(" Player won ");
			}
			// If win is equal to 0 it means he has lost the gamble
			else {
				amount -= BETTING_AMOUNT;
				System.out.println(" Player lose");
			}

		}

		public void gamble() {

			// Gambler stops if the amount is increased or decreased by 50%
			while (amount > BETTING_RANGE_LOSE && amount < BETTING_RANGE_WIN) {
				round();
				System.out.println(" The amount after a round: " + amount);
			}
		}

	}
