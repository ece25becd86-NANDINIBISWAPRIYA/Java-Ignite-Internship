package JavaIgniteDay5;
import java.util.Scanner;

public class Battle_Arena {
	String result(int score1,int score2)
	{
		if(score1>score2)
		{
			return "Player 1";
		}
		else if(score1<score2)
		{
			return "Player 2";
		}
		else
		{
			return "none for match is draw!";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Battle_Arena score = new Battle_Arena();
		System.out.println("Enter player 1 score:");
		int score1 = sc.nextInt();
		System.out.println("Enter player 2 score:");
		int score2 = sc.nextInt();
		System.out.println("The winner of the game is: "+score.result(score1,score2));
		sc.close();
	}

}

