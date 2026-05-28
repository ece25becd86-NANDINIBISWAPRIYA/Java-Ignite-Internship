package JavaIgniteDay3;

public class NestedIf_Demo {
	public static void main(String[] args) {
		int i = 15;
		if(i == 15)
		{
			if(i < 16)
			{
				System.out.println("i is smaller than 16");
				if(i < 11)
				{
					System.out.println("i is smaller than 11 too");
				}
				else
				{
					System.out.println("i is greater");
				}
			}
		}
	}

}
