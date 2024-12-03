package skillbuilder;

public class Circle1 {

	double radius;
	private static double PI = 3.14;
	
	
	
	public Circle1() 
	{
		radius = 1;
	}
	
	//Constructor method
	public Circle1(double r) 
	{
		radius = r;	
		
	}
	
	public void setRadius(double r)
	{
		radius = r;
		
	}
	
	public double getRadius()
	{
		return radius;
		
	}
	
	public double area()
	{
		double circArea;
		
		circArea = PI * radius * radius;
		
		return circArea;
		
	}
	
	public double circumference()
	{
		double circ;
		
		circ = 2 * PI * radius;
		
		return circ;
	}
	
	public boolean equals(Object c)
	{
		Circle1 testObj = (Circle1)c;
		
		if(testObj.getRadius() == radius)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	public String toString()
	{
		String circ;
		
		circ = "Circle has radius "+ radius;
		
		return(circ);
	}
	

}