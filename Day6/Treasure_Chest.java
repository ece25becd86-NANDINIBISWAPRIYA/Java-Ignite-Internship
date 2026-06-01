package JavaIgniteDay6;

public class Treasure_Chest {
	String PlayerName;
    int CoinsCollected;
    String RewardRequirement;

    public Treasure_Chest(String name, int coins) 
    {
        PlayerName = name;
        CoinsCollected = coins;
        
        if(CoinsCollected >= 1000) 
        {
            RewardRequirement = "Diamond Sword";
        } 
        else if (CoinsCollected > 500)
        {
            RewardRequirement = "Gold Sword";
        } 
        else if (CoinsCollected >= 100) 
        {
            RewardRequirement = "Iron Sword";
        } 
        else 
        {
            RewardRequirement = "Wooden Sword";
        }
    }
    
    public void displayStatus() {
    	System.out.println("Player: " + PlayerName);
        System.out.println("Coins: " + CoinsCollected);
        System.out.println("Unlocked: " + RewardRequirement);
        System.out.println("---------------------------");
    }
    
    public static void main(String[] args) {
        Treasure_Chest player1 = new Treasure_Chest("Nandini", 1500);
        Treasure_Chest player2 = new Treasure_Chest("Komal", 650);
        Treasure_Chest player3 = new Treasure_Chest("Ayush", 1850);
        Treasure_Chest player4 = new Treasure_Chest("Akash", 60);
        Treasure_Chest player5 = new Treasure_Chest("Krishna", 350);
        

        player1.displayStatus();
        player2.displayStatus();
        player3.displayStatus();
        player4.displayStatus();
        player5.displayStatus();
    }
}
