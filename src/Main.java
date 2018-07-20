public class Main
{
    public static void main(String[] args)
    {
        Triangle t = new Triangle("Triangle", "Black", 3, 6);
        Rectangle r = new Rectangle("Rectangle", "Pink", 4, 5);
        Circle c = new Circle ("Circle", "Yellow", 87);
        
        System.out.println(t.toString());
        System.out.println(r.toString());
        System.out.println(c.toString());
        
        
        
    }
    
}