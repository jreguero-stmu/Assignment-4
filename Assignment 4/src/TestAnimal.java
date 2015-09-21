
public class TestAnimal {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		cat.setAge(3);
		cat.setBreed("Persian");
		cat.setName("Tom");
		cat.setNoise("Meow");
		cat.setFood("Tuna");
		
		Dog dog = new Dog();
		
		dog.setAge(10);
		dog.setBreed("Corgi");
		dog.setName("Buddy");
		dog.setFood("Dog food");
		dog.setNoise("Bark");
		
		System.out.println(cat.toString() + "\n" + dog.toString());
	}

}
