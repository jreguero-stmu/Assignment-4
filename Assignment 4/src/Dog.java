
public class Dog extends Animal{
	
	private String noise;
	private String food;

	public Dog(){}
	
	
	
	public String getFood() {
		return food;
	}



	public void setFood(String food) {
		this.food = food;
	}



	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public String makeNoise(String noise){
		return getNoise();
	}
	
	
	
	public String eat(String food){
		return getFood();
	}



	@Override
	public String toString() {
		return "Dog [noise=" + noise + ", food=" + food + ", getFood()=" + getFood() + ", getNoise()=" + getNoise()
				+ ", getName()=" + getName() + ", getBreed()=" + getBreed() + ", getAge()=" + getAge() + "]";
	}

}
