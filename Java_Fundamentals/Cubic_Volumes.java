import java.util.*;
class Earth_V
{
    public static void main(String args[])
    {
	double radius_km=6378.0;
	double c_kilo=(4/3)*Math.PI*Math.pow(radius_km,3);
	double radius_mile=0.62137*radius_km;
	double c_miles=(4/3)*Math.PI*Math.pow(radius_mile,3);
	
	System.out.print("The Volume of Earth in cubic Kilometer is "+c_kilo+" and cubic miles is "+c_miles);
    }
}