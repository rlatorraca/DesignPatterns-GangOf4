package Strategy.example01.model;

import Strategy.example01.controller.ScoreboardStrategyBase;

public class Ballon extends ScoreboardStrategyBase{

	@Override
	public int calculateScore(int taps, int multiplier) {
		
		return (taps * multiplier) - 20;
	}

	@Override
	public String printNameUser(String firstName, String lastName) {
		
		return firstName + " " + lastName + " - Ballon";
	}

	
}
