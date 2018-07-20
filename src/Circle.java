public class Circle extends Shape
{
    public int radius;

    public Circle(String shapeName, String color, int radius)
    {
        super(shapeName, color);
        this.radius = radius;
    }

    @Override
    public float getArea()
    {
        return (radius * radius * 3.14f);
    }
    
    @Override
    public String toString()
    {
        return super.toString() + ", Radius: " + radius;
    }
    
}
