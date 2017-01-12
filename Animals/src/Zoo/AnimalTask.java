package Zoo;

import java.util.ArrayList;

public class AnimalTask {

	public static void main(String[] args) {
		
		ArrayList<Animal>animals = new ArrayList<Animal>();
		
		Goose garry = new Goose();
		Pidgeon perry = new Pidgeon();
		Dog dave = new Dog();
		Cat cath = new Cat();
		Bird billy = new Bird();
		Mammel manny = new Mammel();
		Animal annie = new Animal();
		
		animals.add(garry);
		animals.add(perry);
		animals.add(dave);
		animals.add(cath);
		animals.add(billy);
		animals.add(manny);
		animals.add(annie);
		
		for( Animal a : animals){
			
	
			
			if (a instanceof Goose){
				((Goose)a).speaks();
			}
			
			
			//a.speak();
			
		}
		}
	}


