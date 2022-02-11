//Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.
public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla luca = new Gorilla();
		
		//have it throw three things
		luca.throwSomething();
		luca.throwSomething();
		luca.throwSomething();
		
		//eat bananas twice
		luca.eatBanana();
		luca.eatBanana();
		
		//and climb once
		luca.climb();
		
		//Print energy level
		System.out.println("Gorilla's energy level is currently: ");
		luca.displayEnergy();
	}

}
