
public class Vehicle{
//	private PetrolEngine pE;
	public static void main(String[] args) {
		
		//System.out.println("Hello");
		PetrolEngine pE=new PetrolEngine();
		pE.start();
		
		DieselEngine dE=new DieselEngine();
		dE.start();
	}
}