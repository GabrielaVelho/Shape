public abstract class Shape
{
	private String shapeName;
    private String color;
    public abstract float getArea();
    
    public Shape(String shapeName, String color)
    {
    	this.shapeName = shapeName;
        this.color = color;
    }
    
    public String toString()
    {
        return "Color: " + color + ", Shape: " + shapeName;
    }
    
}