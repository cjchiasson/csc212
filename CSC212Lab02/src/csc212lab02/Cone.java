package csc212lab02;

public class Cone {
	
	int radius;
	
	int height;
	
	double volume;

	public Cone (int r, int h) {
		
		radius = r;
		
		height = h;
	
		
	}
	public double getVolume() {
		
		volume = Math.PI * Math.pow(radius, 2)* height / 3;

		return volume;
	}
	
}
