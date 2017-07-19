
public class TerrestrialPlanets extends Planet 
{
protected boolean hasIceCaps;
public String getCelestialClassification(){
	return ("TerestrialPlanets");
}
public TerrestrialPlanets(String commonName,AstronomicalUnits distanceFromTheSun, EarthDay siderealDay, EarthDay orbitalPeriod, int numberOfSatellites,
		String[] largeSatellites, boolean hasRings, boolean hasIceCaps,Micro_Sun relativeMass,Earth_Mass rltvMass) {
	super(commonName,distanceFromTheSun, siderealDay, orbitalPeriod, numberOfSatellites, largeSatellites, hasRings,relativeMass,rltvMass);
	this.hasIceCaps = hasIceCaps;
	this.commonName = commonName;
}
public String getFactualSummary() {
	return super.getFactualSummary() + "hasIceCaps:" + hasIceCaps +System.lineSeparator();
}

}





