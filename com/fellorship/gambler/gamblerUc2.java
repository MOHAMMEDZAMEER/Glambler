package com.fellorship.gambler;

public class gamblerUc2 {

		public static void main(String[] args) {
			int dailyStake=100;//initializing dailyStake value
		
			int BET_PER_GAME =1;//initializing value for BET_PER_GAME
			System.out.println("daily GLAMBER stimulation");
			
			int dies= (int)(Math.random()*2);//using Random method for player win or lose
			
			//if else condition was used for printing values
			
			
			if (dies == 1) {
				System.out.println("player win");
				
				dailyStake = dailyStake+BET_PER_GAME;	//increasing dailyStake by 1 
			}
			else {
				System.out.println("player lose");
				dailyStake= dailyStake-BET_PER_GAME;   //decreasing dailyStake by 1 
			}
				System.out.println("dailyStake :"+dailyStake);
				
		}
}
