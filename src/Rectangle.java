public class Rectangle extends Shape
{
    private int length;
    private int width;
    
    public Rectangle(String shapeName, String color, int length, int width)
    {
        super(shapeName, color); 
        this.length = length;
        this.width = width;
    }
    
    @Override
    public float getArea()
    {
        return (length * width);
    }
    
    @Override
    public String toString()
    {
        return super.toString() + ", Length: " + length + ", Width: " + width;
    }
    
}