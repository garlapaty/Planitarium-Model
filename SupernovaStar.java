import java.util.Date;

public class SupernovaStar extends Star{
	public enum SupernovaTypes{I,II, III, IV,V};
	private Date peakBrillianceDate;
	public SupernovaTypes supernovaType;
	
	

	public SupernovaStar(String commonName, String constellationDesignation,SpectralType stype, double apparentMagnitude, double absoluteMagnitude,
			LightYears  distanceFromSun, String[] planets, SupernovaTypes supernovaType, String peakBrillianceDate,Solar_Mass rMass)
	{
		super(commonName,constellationDesignation, apparentMagnitude, absoluteMagnitude, distanceFromSun, stype,  planets, rMass);
	}
	
	public String getFactualSummary() {
		return "commonName: " +commonName+ super.getFactualSummary() + "" +System.lineSeparator()+ "Supernova Type " + supernovaType;
	}
	@Override
	public String getCelestialClassification() {
		return "Supernova Star";
	}

	public Date getPeakBrillianceDate() {
		return peakBrillianceDate;
	}

	public void setPeakBrillianceDate(Date peakBrillianceDate) {
		this.peakBrillianceDate = peakBrillianceDate;
	}
	}
