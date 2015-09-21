
public class Cat extends Animal{
	
	private String noise;
	private String food;
	
	
	
	public String getNoise() {
		return noise;
	}
	public void setNoise(String noise) {
		this.noise = noise;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	
	public String makeNoise(String noise){
		return getNoise();
	}
	
	public String eat(String food){
		return getFood();
	}
	@Override
	public String toString() {
		return "Cat [noise=" + noise + ", food=" + food + ", getNoise()=" + getNoise() + ", getFood()=" + getFood()
				+ ", getName()=" + getName() + ", getBreed()=" + getBreed() + ", getAge()=" + getAge() + "]";
	}
	
	

}
