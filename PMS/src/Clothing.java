
public class Clothing implements ProductTemplate {

	@Override
	public int calculateProductPrice(int p1Price, int p2Price) {
		
		System.out.println("Clothing calculation");
		return p1Price+p2Price;
	}

}
