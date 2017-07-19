import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class CelestialVisitors extends AstroEntity implements CelestialVisitor {
Date lastAppeared;
Date nextAppeared;
boolean isPredictable;
	@Override
	public Date lastAppearedOn() {
		
		return lastAppeared;
	}

	@Override
	public Date nextAppearsOn() {
		return nextAppeared;
	}

	@Override
	public String getCelestialClassification() {
		return "CelestialVisitor";
	}

	@Override
	public boolean isPredictable() {
		return isPredictable;
	}

	public String getFactualSummary() {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
		
		return super.getFactualSummary() + "" +System.lineSeparator()+" Last appered on;" + dateFormatter.format(lastAppearedOn()) + "" +System.lineSeparator()+ " Next appears on: "
				+ dateFormatter.format(nextAppearsOn()) + "" +System.lineSeparator()+ " Is Predictable:" + isPredictable();

	}

	public CelestialVisitors(String name, String lastAppearedOn, String nextAppearsOn, boolean isPredictable) throws ParseException {
		super(name);
		this.commonName = name;
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date3 = dateFormatter.parse(lastAppearedOn);
		this.lastAppeared = date3;
		
		date3 = dateFormatter.parse(nextAppearsOn);
		this.nextAppeared = date3;
		this.isPredictable = isPredictable;

	}

}

