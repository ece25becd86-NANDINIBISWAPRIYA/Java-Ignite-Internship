package JavaIgniteDay6;

public class Flight_Details {
	String passengerName;
	String passengerId;
	String Destination;
	int age;
	int hours_journey;
	
	 Flight_Details(String pn,String pId,String d,int a,int h)
	{
	passengerName = pn;
	passengerId = pId;
	Destination = d;
	age = a;
	hours_journey = h;
	}
	void display()
	{
		System.out.println("Passenger Name: " +passengerName);
		System.out.println("Passenger Id: " +passengerId);
		System.out.println("Destination: " +Destination);
		System.out.println("Age: " +age);
		System.out.println("Hours of Journey: " +hours_journey);
		System.out.println("------------------------------");
		
	}
	public static void main(String[] args) {
		Flight_Details p1 = new Flight_Details("Nandini Biswapriya","25becd86","Paris",19,8);
		Flight_Details p2 = new Flight_Details("Ayush Samanta","25bevd38","Paris",20,8);
		Flight_Details p3 = new Flight_Details("Sikha Agarwal","34bvgf45","Dehradun",32,2);
		Flight_Details p4 = new Flight_Details("Sanjeeb Dash","25becs50","Vizag",19,2);
		Flight_Details p5 = new Flight_Details("Akshat Patel","35begf98","New York",25,7);
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
	}
}