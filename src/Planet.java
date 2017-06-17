
public abstract class Planet extends AstroEntity {

	protected double distanceFromTheSun;
	protected double sideRealDay;
	protected double orbitalPeriod;
	protected int numberOfSatellites;
	protected String[]largeSatellites;
	protected boolean hasRings;
	public String ReturnSatelliteNames()
	{
		String satellites = "";
		if (this.numberOfSatellites > 0)
		{
			for (int i = 0; i < largeSatellites.length; i++) 
			{
				satellites = satellites + largeSatellites[i] + " ";
			}
		}
		else
		{
			satellites="none";
		}
		return satellites;
	}
	public Planet(String commonName,double distanceFromTheSun, double sideRealDay, double orbitalPeriod, int numberOfSatellites,
			String[] largeSatellites, boolean hasRings)
	{
		super(commonName);
		this.distanceFromTheSun = distanceFromTheSun;
		this.sideRealDay = sideRealDay;
		this.orbitalPeriod = orbitalPeriod;
		this.numberOfSatellites = numberOfSatellites;
		this.largeSatellites = largeSatellites;
		this.hasRings = hasRings;
	}
	@Override
	public  String getFactualSummary() {
		return "commonName: " + this.commonName 
				+ "\ndistanceFromSun:" + distanceFromTheSun + "\nsideRealDay: " + sideRealDay + "\norbitalPeriod: "
				+ orbitalPeriod + "\nhas rings: " + hasRings + "\nNumberOfSatellites: " + numberOfSatellites
				+ "\nSatelliteNames: " + this.ReturnSatelliteNames() + "\n";
	}	

}
