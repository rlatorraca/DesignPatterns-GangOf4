package Strategy.example01.controller;

public class Scoreboard {

	public ScoreboardStrategyBase scoreboarsBase;
	
	public void showScore(int taps, int multiplier) {
		System.out.println(scoreboarsBase.calculateScore(taps, multiplier));
	}
	
	public void showName(String firstName, String lastName) {
		System.out.println(scoreboarsBase.printNameUser(firstName, lastName));		
	}
}
