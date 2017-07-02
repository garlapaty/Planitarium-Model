import java.util.Date;

public class SupernovaStar extends Star{
	protected enum SupernovaTypes{I,II, III, IV,V};
	private Date peakBrillianceDate;
	private SupernovaTypes supernovaType;
	
	

	public SupernovaStar(String commonName, String constellationDesignation,SpectralType stype, double apparentMagnitude, double absoluteMagnitude,
			double distanceFromSun, String[] planets, SupernovaTypes supernovaType, String peakBrillianceDate)
	{
		super(commonName,constellationDesignation, apparentMagnitude, absoluteMagnitude, distanceFromSun, stype,  planets);
		// TODO Auto-generated constructor stub
	}
	
	public String getFactualSummary() {
		return "commonName: " +commonName+ super.getFactualSummary() + "\nSupernova Type " + supernovaType;
	}
	@Override
	public String getCelestialClassification() {
		// TODO Auto-generated method stub
		return "Supernova Star";
	}
	}
