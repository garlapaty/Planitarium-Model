
public class GasGaints extends Planet{
protected boolean hasCloudBelts;

public GasGaints(String commonName, double distanceFromTheSun, double sideRealDay, double orbitalPeriod, int numberOfSatellites,
		String[] largeSatellites, boolean hasRings, boolean hasCloudBelts) {
	super(commonName,distanceFromTheSun, sideRealDay, orbitalPeriod, numberOfSatellites, largeSatellites, hasRings);
	this.hasCloudBelts = hasCloudBelts;
}

@Override
public String getCelestialClassification() {
	// TODO Auto-generated method stub
	return "GasGaints";
}

	
}
