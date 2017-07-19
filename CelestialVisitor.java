import java.util.Date;

public interface CelestialVisitor
{
public static String lastAppeared= "Jan 1,1986";
public static String nextAppeared= "Jan 1,1986";
public static  boolean isPredictable=true;
public Date lastAppearedOn();
public Date nextAppearsOn();
public boolean isPredictable();
}
