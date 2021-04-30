
public class rTriangle extends shap{
	private int base;
	private int height;
	
	public rTriangle(int b, int h)
	{
		this.base = b;
		this.height = h;

		calcArea();
		setType("circle");
	}
	
	public String toString()
	{
		return "Right Triangle Side 1:"+this.base +" Side 2"+ this.height+ " Area: "+getArea();
	}
	public void calcArea()
	{
		setArea(0.5*(this.base*this.height));
	}

}
