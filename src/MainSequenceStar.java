import java.util.Date;
public class MainSequenceStar extends Star{
protected double mass;
	public MainSequenceStar(String commonName, String constellationDesignation,SpectralType stype,double apparentMagnitude, 
			double absoluteMagnitude,double distanceFromSun,String[] planets,double mass){
        super(commonName,constellationDesignation, apparentMagnitude, absoluteMagnitude, distanceFromSun, stype, planets);
        this.commonName = commonName;
        this.mass = mass;
    }
	public String getFactualSummary() {
		return "commonName: " +commonName+ super.getFactualSummary()+"\n mass : " + mass;
		
	}
	@Override
	public String getCelestialClassification() {
		// TODO Auto-generated method stub
		return "MainSequenceStar";
	}
}
	