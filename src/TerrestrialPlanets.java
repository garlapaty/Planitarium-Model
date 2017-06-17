
public class TerrestrialPlanets extends Planet 
{
protected boolean hasIceCaps;
public String getCelestialClassification(){
	return ("TerestrialPlanets");
}
public TerrestrialPlanets(String commonName,double distanceFromTheSun, double sideRealDay, double orbitalPeriod, int numberOfSatellites,
		String[] largeSatellites, boolean hasRings, boolean hasIceCaps) {
	super(commonName,distanceFromTheSun, sideRealDay, orbitalPeriod, numberOfSatellites, largeSatellites, hasRings);
	this.hasIceCaps = hasIceCaps;
	this.commonName = commonName;
}
public String getFactualSummary() {
	return super.getFactualSummary() + "hasIceCaps:" + hasIceCaps + "\n";
}

}





