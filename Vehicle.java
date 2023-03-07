
public class Vehicle{
//	private PetrolEngine pE;
	public static void main(String[] args) {
		
		//System.out.println("Hello");
		PetrolEngine pE=new PetrolEngine();
		pE.start();
		pE.stop();
		
		DieselEngine dE=new DieselEngine();
		dE.start();
		dE.stop();
	}
}