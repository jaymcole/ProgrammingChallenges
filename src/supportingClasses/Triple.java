package supportingClasses;

public class Triple <v1, v2, v3> {
	public v1 value1;
	public v2 value2;
	public v3 value3;
	
	
	public Triple(v1 value1, v2 value2, v3 value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}
	
	@Override
	public String toString() {
		return value1.toString() + ", " + value2.toString() + ", " + value3.toString();
	}
}
