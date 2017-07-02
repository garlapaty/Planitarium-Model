
public class GaintStar extends Star{
	public enum Gaintness {super_gaint,gaint,sub_gaint};
	private Gaintness gaintness;
   
    public GaintStar(String commonName, String constellationDesignation,SpectralType stype,double apparentMagnitude, 
    		double absoluteMagnitude,LightYears  distanceFromSun,String[] planets,Gaintness gaintness,Solar_Mass rMass)
    {
        super(commonName,constellationDesignation, apparentMagnitude, absoluteMagnitude, distanceFromSun, stype, planets, rMass);

        this.commonName = commonName;
        this.gaintness = gaintness;
    }

    public String getFactualSummary() {
        return "Common Name: "+commonName+ super.getFactualSummary() +System.lineSeparator()+" Gaintness : " + gaintness +System.lineSeparator();
    }

	@Override
	public String getCelestialClassification() {
		return "GaintStar";
	}
}