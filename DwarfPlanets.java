
public class DwarfPlanets extends Planet {
protected boolean hasIrregularShape;

public DwarfPlanets(String commonName, AstronomicalUnits distanceFromTheSun, EarthDay siderealDay, 
		EarthDay orbitalPeriod, int numberOfSatellites,
		String[] largeSatellites, boolean hasRings, boolean hasIrregularShape,Micro_Sun relativeMass,Earth_Mass rltvMass) 
{
	super(commonName,distanceFromTheSun, siderealDay, orbitalPeriod, numberOfSatellites, largeSatellites, hasRings,relativeMass,rltvMass);
	this.hasIrregularShape = hasIrregularShape;
}

@Override
public String getCelestialClassification() {
	return "DwarfPlanets";
}


}
