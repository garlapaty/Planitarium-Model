
public abstract class Planet extends AstroEntity {

	protected AstronomicalUnits distanceFromTheSun;
	protected EarthDay siderealDay;
	protected EarthDay orbitalPeriod;
	protected int numberOfSatellites;
	protected String[]largeSatellites;
	protected boolean hasRings;
	protected Micro_Sun relativeMass;
	protected Earth_Mass rltvMass;
	public String returnSatelliteNames()
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
	public Planet(String commonName,AstronomicalUnits distanceFromTheSun, EarthDay siderealDay, EarthDay orbitalPeriod, int numberOfSatellites,
			String[] largeSatellites, boolean hasRings,Micro_Sun relativeMass,Earth_Mass rltvMass)
	{
		super(commonName);
		this.distanceFromTheSun = distanceFromTheSun;
		this.siderealDay = siderealDay;
		this.orbitalPeriod = orbitalPeriod;
		this.numberOfSatellites = numberOfSatellites;
		this.largeSatellites = largeSatellites;
		this.hasRings = hasRings;
		this.relativeMass= relativeMass;
		this.rltvMass= rltvMass;
		}
	
	@Override
	public  String getFactualSummary() {
		return "commonName: " + this.commonName 
				+ "" +System.lineSeparator()+ "distanceFromSun:" + distanceFromTheSun.astronomicalUnits +AstronomicalUnits.retAu()+ System.lineSeparator()+ "siderealDay: " + siderealDay.eday +" = "+EarthDay.retedunits()+System.lineSeparator()+ "orbitalPeriod: "
				+ orbitalPeriod.eday + "  = " +EarthDay.retedunits()+System.lineSeparator()+ "has rings: " + hasRings + "" +System.lineSeparator()+ "NumberOfSatellites: " + numberOfSatellites+ "" +System.lineSeparator()
				+ "SatelliteNames: " + this.returnSatelliteNames()+System.lineSeparator()+"relativeMass:" +relativeMass.micro__sun+System.lineSeparator()+ "rltvMass:"+ rltvMass.earth_Mass;
	}	

}
