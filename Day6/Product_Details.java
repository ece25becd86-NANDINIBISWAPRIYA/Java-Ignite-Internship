package JavaIgniteDay6;

public class Product_Details {
	String productName;
	String productId;
	String productCategory;
	int price;
	int stock;
	
	 Product_Details(String pn,String pId,String pc,int p,int s)
	{
	productName = pn;
	productId = pId;
	productCategory = pc;
	price = p;
	stock = s;
	}
	void display()
	{
		System.out.println("Product Name: " +productName);
		System.out.println("Product Id: " +productId);
		System.out.println("Product Category: " +productCategory);
		System.out.println("price: " +price);
		System.out.println("stock: " +stock);
		System.out.println("------------------------------");
		
	}
	public static void main(String[] args) {
		Product_Details p1 = new Product_Details("MacBook","25BIo8","Electronics",150000,500);
		Product_Details p2 = new Product_Details("IPhone","17 pro","Electronics",134000,140);
		Product_Details p3 = new Product_Details("Dress","36Bce","Textile",1200,200);
		Product_Details p4 = new Product_Details("Chocolate","25we8","Edibles",115,1500);
		Product_Details p5 = new Product_Details("Jewellery","25BIo8","Ornameents",250000,60);
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
	}
}

