class Shape
{
    void area(float x)
    {
        System.out.println("the area of the square is "+x*x+" sq cm");
    }
    void area(int x, int y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq cm");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq cm");
    }
    void area(double b,double h)
	{
		System.out.println("the area of the Triangle is  "+0.5*b*h);
	}
}
class Overload1 
{
     public static void main(String args[]) 
	{
	   Shape ob = new Shape();
	   ob.area(4);
	   ob.area(7,11);
	   ob.area(3.6);
       ob.area(5.0,4.0);
        }
}