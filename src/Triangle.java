public class Triangle extends Shape
{
    private int base;
    private int height;
    
    public Triangle(String shapeName, String color, int base, int height)
    {
        super(shapeName, color); //construtor da classe pai
        this.base = base; //atributos da classe
        this.height = height;
    }

    @Override
    public float getArea()
    {
        return (base * height / 2.0f);
    }
    
    @Override
    public String toString()
    {
        return super.toString() + ", Base: " + base + ", Height: " + height; //toString da classe pai + os atributos dessa classe
    } 
}