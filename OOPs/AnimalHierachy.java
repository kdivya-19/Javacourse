package OOPs;

class Animal{
	
	private String name;
	private String habitat;
	
	public Animal(String name,String habitat) {
		this.name=name;
		this.habitat=habitat;
		
	}
	
	public void displayHabitat() {
		System.out.println("Displaying "+name+"Info: ");
		System.out.println("Habitat: "+habitat);
	}
}

class Mammal extends Animal{
	private boolean isWarmBlooded;
	public Mammal(String name,String habitat,boolean isWarmBlooded) {
		super(name,habitat);
		this.isWarmBlooded=isWarmBlooded;
	}
	
	public void displayMammalInfo() {
		super.displayHabitat();
		System.out.println("Is warm blooded: "+isWarmBlooded);
	}
	
}

class Bird extends Animal{
	private boolean canFly;
	public Bird(String name,String habitat,boolean canFly) {
		super(name,habitat);
		this.canFly=canFly;
	}
	
	public void displayBirdInfo() {
		System.out.println("Can Fly: "+canFly);
	}
	
}

class Reptile extends Animal{
	private boolean isColdblooded;
	public Reptile(String name,String habitat,boolean isColdblooded) {
		super(name,habitat);
		this.isColdblooded=isColdblooded;
	}
	
	public void displayReptileInfo() {
		System.out.println("Is cold blooded: "+isColdblooded);
	}
	
}

public class AnimalHierachy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal m=new Mammal("Lion ","Savannah",true);
		m.displayMammalInfo();
		System.out.println();
		
		Animal a=new Bird("Eagle ","Forest",true);
		a.displayHabitat();
		Bird b=(Bird)a;
		b.displayBirdInfo();
		System.out.println();
		
		Animal r=new Reptile("Eagle ","Forest",true);
		r.displayHabitat();
		Reptile r2=(Reptile)r;
		r2.displayReptileInfo();
		System.out.println();

	}

}
