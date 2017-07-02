public class MainSequenceStar extends Star{
protected double mass;
	public MainSequenceStar(String commonName, String constellationDesignation,SpectralType stype,double apparentMagnitude, 
			double absoluteMagnitude,LightYears  distanceFromSun,String[] planets,double mass,Solar_Mass rMass){
        super(commonName,constellationDesignation, apparentMagnitude, absoluteMagnitude, distanceFromSun, stype, planets,rMass);
        this.commonName = commonName;
        this.mass = mass;
    }
	public String getFactualSummary() {
		return "commonName: " +commonName+ super.getFactualSummary()+"\n mass : " + mass;
		
	}
	@Override
	public String getCelestialClassification() {
		return "MainSequenceStar";
	}
}
	