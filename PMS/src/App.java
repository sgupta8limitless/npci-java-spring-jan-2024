import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public interface App {

		public static void main(String args[])
		{
				
//			ProductTemplate productTemplate = (p1Price,p2Price)-> p1Price+p2Price;
//				
//			int total = productTemplate.calculateProductPrice(23,45);
//			
//			System.out.println(total);
			
//			Electronics electronics = new Electronics();
//			
//			electronics.calculateProductPrice(23, 12);
//			
//			electronics.printProductTagLine();
//			
//			Clothing clothing = new Clothing();
//			
//			clothing.calculateProductPrice(23, 21);
//			
//			clothing.printProductTagLine();
			
//			ProductTemplate.proTempFun();
			
			
			Scanner scanner = new Scanner(System.in);
			
			ArrayList<Product> products = new ArrayList();
			
			products.add(new Product("Marker", 25, "Stationary", 145));
			products.add(new Product("Bucket", 78, "Appliance", 200));
			products.add(new Product("Mixer", 670, "Appliance", 23));
			products.add(new Product("Pen", 25, "Stationary", 12));
			products.add(new Product("Mobile", 25000, "Electronics", 14));
			
//			for(int i = 1;i<=3;i++)
//			{
//				System.out.println("Enter Name");
//				String name = scanner.next();
//				System.out.println("Enter Price");
//				int price = scanner.nextInt();
//				System.out.println("Enter Category");
//				String category = scanner.next();
//				System.out.println("Enter Quantity");
//				int quantity = scanner.nextInt();
//				
//				products.add(new Product(name,price,category,quantity));
//			}
			
			
//			[11,12,12,23]
//			[{name,price},{name,price},{name,price},{name,price}]
			
			Stream<Product> productStream = products.stream();
			
//			System.out.println("Enter a category");
//			String category = scanner.next();
			
			productStream
//			.filter((prod)->prod.getCategory().equalsIgnoreCase(category))
			.sorted((p1,p2)->p2.getPrice()-p1.getPrice())
			.forEach((prod)->System.out.println(prod));
			
			
			
			
				
			
		}
	
}
