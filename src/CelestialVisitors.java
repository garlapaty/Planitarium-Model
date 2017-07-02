import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class CelestialVisitors extends AstroEntity implements CelestialVisitor {
Date lastAppeared;
Date nextAppeared;
boolean isPredictable;
	@Override
	public Date lastAppearedOn() {
		// TODO Auto-generated method stub
		
		return lastAppeared;
	}

	@Override
	public Date nextAppearsOn() {
		// TODO Auto-generated method stub
		return nextAppeared;
	}

	@Override
	public String getCelestialClassification() {
		// TODO Auto-generated method stub
		return "CelestialVisitor";
	}

	@Override
	public boolean isPredictable() {
		// TODO Auto-generated method stub
		return isPredictable;
	}

	public String getFactualSummary() {
		SimpleDateFormat s3 = new SimpleDateFormat("dd/MM/yyyy");
		
		return super.getFactualSummary() + "\n Last appered on;" + s3.format(lastAppearedOn()) + "\n Next appears on: "
				+ s3.format(nextAppearsOn()) + "\n Is Predictable:" + isPredictable();

	}

	public CelestialVisitors(String name, String LastAppearedOn, String NextAppearsOn, boolean IsPredictable) throws ParseException {
		super(name);
		this.commonName = name;
		SimpleDateFormat s3 = new SimpleDateFormat("dd/MM/yyyy");
		Date date3 = s3.parse(LastAppearedOn);
		this.lastAppeared = date3;
		
		date3 = s3.parse(NextAppearsOn);
		this.nextAppeared = date3;
		this.isPredictable = IsPredictable;

	}

}

