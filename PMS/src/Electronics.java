
public class Electronics implements ProductTemplate {

	@Override
	public int calculateProductPrice(int p1Price, int p2Price) {
		
		System.out.println("Electronics Calculation");
		return p1Price-p2Price;
	}
	
	public void printProductTagLine()
	{
		System.out.println("We deliver electronics");
	}

}
