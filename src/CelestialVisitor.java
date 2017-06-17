import java.util.Date;

public interface CelestialVisitor
{
public static final String lastAppeared= "Jan 1,1986";
public static final String nextAppeared= "Jan 1,1986";
public static final boolean isPredictable=true;
public Date lastAppearedOn();
public Date nextAppearsOn();
public boolean isPredictable();
}
