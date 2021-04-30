//Written by Mia Dia
public class shap implements Comparable<shap>
{
	private String type;
	private double area;
// Variables / / / / / / / / / / / / / / / / / / / 
	

// Constructors / / / / / / / / / / / / / / / / /
	public shap()
	{
		this.type = "circle";
		this.area = 1;
	}

	public shap(double aW, String aT)
	{
		this.type = "circle";
		this.area = 1;
	}

// Methods / / / / / / / / / / / / / / / / / / / /
	
//Sets, Gets, and toString
	
	public String toString()
	{
		return this.type +" "+ this.area;
	}
	public void setType(String aT)
	{
			this.type = aT;
	}
	
	public String getType()
	{
		return this.type;
	}
	public double getArea()
	{
		return this.area;
	}
	
	public void setArea(double a)
	{
		this.area = a;
	}
	
	public boolean greaterThanVal(int val)
	{
		if(this.area > val)
		{
			return true;
		}
		return false;
	}
	
//Compare To
	
	public int compareTo(shap aShap)
	{
		if(aShap == null)
			return -1;
		if(this.area < aShap.getArea())
			return -1;
		else if(this.area > aShap.getArea())
			return 1;
		else
			return this.type.compareTo(aShap.getType());
	}
	
	
}
