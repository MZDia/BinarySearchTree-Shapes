
public class rectangle extends shap{
	private int side1;
	private int side2;
	
	public rectangle(int s1, int s2)
	{
		this.side1 = s1;
		this.side2 = s2;

		calcArea();
		setType("Rectangle");
	}
	
	public String toString()
	{
		return "Rectangle Side 1:"+this.side1 +" Side 2"+ this.side2+ " Area "+getArea();
	}
	public void calcArea()
	{
		setArea(this.side1 * this.side2 + 0.0);
	}

}
