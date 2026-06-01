package JavaIgniteDay6;

public class Batsman {
	String playerName;
    int runs;
    int balls;
    double strikeRate;

    Batsman(String pn, int r, int b)
    {
        playerName = pn;
        runs = r;
        balls = b;
        if (balls > 0) 
        {
            strikeRate = (double) (runs * 100) / balls;
        } else
        {
            strikeRate = 0;
        }
    }
    void display() {
        System.out.println("Strike Rate = " + (int) strikeRate);
    }

    public static void main(String[] args) {
        Batsman player1 = new Batsman("Gill", 75, 50);
        player1.display();
    }
}
