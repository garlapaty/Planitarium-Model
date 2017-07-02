
public class EarthDay {
public double eday;
public EarthDay convertToEarthDays()
{
	EarthDay e=new EarthDay(eday);
	return e;
}
public 	EarthDay(double eday)
{
	this.eday=eday;
	
	}
public static String retedunits()
{
	return "EARTH_DAY";
}

}




