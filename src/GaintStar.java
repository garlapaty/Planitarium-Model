
public class GaintStar extends Star{
	public enum Gaintness {super_gaint,gaint,sub_gaint};
	private Gaintness gaintness;
   
    public GaintStar(String commonName, String constellationDesignation,SpectralType stype,double apparentMagnitude, 
    		double absoluteMagnitude,double distanceFromSun,String[] planets,Gaintness gaintness)
    {
        super(commonName,constellationDesignation, apparentMagnitude, absoluteMagnitude, distanceFromSun, stype, planets);

        this.commonName = commonName;
        this.gaintness = gaintness;
    }

    public String getFactualSummary() {
        return "Common Name: "+commonName+ super.getFactualSummary() + "\n Gaintness : " + gaintness + "\n";
    }//

	@Override
	public String getCelestialClassification() {
		// TODO Auto-generated method stub
		return "GaintStar";
	}
}