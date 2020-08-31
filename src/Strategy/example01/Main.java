package Strategy.example01;

import Strategy.example01.controller.Scoreboard;
import Strategy.example01.model.Ballon;
import Strategy.example01.model.Clown;
import Strategy.example01.model.SquareBallon;


public class Main {

	public static void main(String[] args) {
		
		Scoreboard scoreBoard = new Scoreboard();
		
		System.out.print("Ballon Tap Score : ");
		scoreBoard.scoreboarsBase = new Ballon();
		scoreBoard.showScore(100, 5);
		scoreBoard.showName("Class", "B");
		
		System.out.print("Clown Tap Score : ");
		scoreBoard.scoreboarsBase = new Clown();
		scoreBoard.showScore(100, 5);
		scoreBoard.showName("Class", "C");
		
		System.out.print("SquareBallon Tap Score : ");
		scoreBoard.scoreboarsBase = new SquareBallon();
		scoreBoard.showScore(100, 5);
		scoreBoard.showName("Class", "SB");
	}
}
