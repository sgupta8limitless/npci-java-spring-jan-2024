public interface ProductTemplate {
	
	int calculateProductPrice(int p1Price,int p2Price);
	
	
	
	default void printProductTagLine()
	{
		System.out.println("We are Amazon!! We Provide Everything");
	}
	
	
	static void proTempFun()
	{
		System.out.println("this is a static method");
	}

}
