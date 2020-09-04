package supportingClasses;

public class Pair<v1, v2> {
	public v1 value1;
	public v2 value2;
	
	public Pair(v1 value1, v2 value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	@Override
	public String toString() {
		return value1.toString() + ", " + value2.toString();
	}
}
