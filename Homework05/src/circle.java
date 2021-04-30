
public class circle extends shap{
	private int radius;
	
	public circle(int r)
	{
		this.radius = r;
		calcArea();
		setType("circle");
	}
	
	public String toString()
	{
		return "Circle Radius: "+this.radius+" Area: "+ getArea();
	}
	
	public void calcArea()
	{
		setArea(Math.PI * Math.pow(radius,2));
	}

}
