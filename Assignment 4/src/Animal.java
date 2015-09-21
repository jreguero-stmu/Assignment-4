
public abstract class Animal {

	private String name;
	private String breed;
	private int age;
	
	
	public Animal(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public abstract String makeNoise(String noise);
	
	public abstract String eat(String food);
	
}
