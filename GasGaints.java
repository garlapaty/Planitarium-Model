
public class GasGaints extends Planet{
protected boolean hasCloudBelts;

public GasGaints(String commonName, AstronomicalUnits distanceFromTheSun, EarthDay siderealDay, EarthDay orbitalPeriod, int numberOfSatellites,
		String[] largeSatellites, boolean hasRings, boolean hasCloudBelts,Micro_Sun relativeMass,Earth_Mass rltvMass) {
	super(commonName,distanceFromTheSun, siderealDay, orbitalPeriod, numberOfSatellites, largeSatellites, hasRings,relativeMass,rltvMass);
	this.hasCloudBelts = hasCloudBelts;
}

@Override
public String getCelestialClassification() {
	return "GasGaints";
}

	
}
