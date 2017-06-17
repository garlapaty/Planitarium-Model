
public abstract class Star extends AstroEntity 
{
protected String constellationDesignation;
public enum SpectralType {O,B,A,F,G,K,M};
protected double apparentMagnitude;
protected double absoluteMagnitude;
protected double distanceFromSun;
protected SpectralType stype;
protected String[] planets;
public String returnPlanet() {
	String totalPlanets = "";
	for (int i=0;i < this.planets.length;i++){
		totalPlanets = totalPlanets +"\t"+ planets[i] + "";		
	}
	return totalPlanets;
}
public Star(String commonName,String constellationDesignation, double apparentMagnitude, double absoluteMagnitude, double distanceFromSun,
		SpectralType stype, String[] planets) {
	super(commonName);
	this.constellationDesignation = constellationDesignation;
	this.apparentMagnitude = apparentMagnitude;
	this.absoluteMagnitude = absoluteMagnitude;
	this.distanceFromSun = distanceFromSun;
	this.stype = stype;
	this.planets = planets;
}
public String getFactualSummary() {
	return "\nconstellationDesignation : " + constellationDesignation +"\n stype: "+stype +"\napparentMagnitude : " + apparentMagnitude + "\nabosoluteMagnitude :" + absoluteMagnitude + 
			"\ndistanceFromSun : " + distanceFromSun +" lightYears"+ "\nplanets: " + returnPlanet();
}
	}

	
