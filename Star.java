
public abstract class Star extends AstroEntity 
{
protected String constellationDesignation;
public enum SpectralType {O,B,A,F,G,K,M};
protected double apparentMagnitude;
protected double absoluteMagnitude;
protected LightYears  distanceFromSun;
protected SpectralType stype;
protected String[] planets;
protected Solar_Mass rMass;
public String returnPlanet() {
	String totalPlanets = "";
	for (int i=0;i < this.planets.length;i++){
		totalPlanets = totalPlanets +"\t"+ planets[i] + "";		
	}
	return totalPlanets;
}
public Star(String commonName,String constellationDesignation, double apparentMagnitude, double absoluteMagnitude, LightYears  distanceFromSun,
		SpectralType stype, String[] planets,Solar_Mass rMass) {
	super(commonName);
	this.constellationDesignation = constellationDesignation;
	this.apparentMagnitude = apparentMagnitude;
	this.absoluteMagnitude = absoluteMagnitude;
	this.distanceFromSun = distanceFromSun;
	this.stype = stype;
	this.planets = planets;
	this.rMass=rMass;
}
public String getFactualSummary() {
	return  "" +System.lineSeparator()+"constellationDesignation : " + constellationDesignation + "" +System.lineSeparator()+" stype: "+stype + "" +System.lineSeparator()+"apparentMagnitude : " + apparentMagnitude + "" +System.lineSeparator()+ "abosoluteMagnitude :" + absoluteMagnitude  
			+ "" +System.lineSeparator()+"distanceFromSun : " + distanceFromSun .lightYears+ LightYears.retLy() +System.lineSeparator()+ "planets: " + returnPlanet()+System.lineSeparator()+"rMass:"+rMass.solar_Mass;
}
	}

	
