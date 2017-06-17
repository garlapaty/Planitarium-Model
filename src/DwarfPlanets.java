
public class DwarfPlanets extends Planet {
protected boolean hasIrregularShape;

public DwarfPlanets(String commonName, double distanceFromTheSun, double sideRealDay, 
		double orbitalPeriod, int numberOfSatellites,
		String[] largeSatellites, boolean hasRings, boolean hasIrregularShape) 
{
	super(commonName,distanceFromTheSun, sideRealDay, orbitalPeriod, numberOfSatellites, largeSatellites, hasRings);
	this.hasIrregularShape = hasIrregularShape;
}

@Override
public String getCelestialClassification() {
	// TODO Auto-generated method stub
	return "DwarfPlanets";
}


}
