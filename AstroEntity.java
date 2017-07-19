
public abstract class AstroEntity {
	public String commonName;
	public String getFactualSummary()
	{
		return commonName;

	}
	public abstract String getCelestialClassification();
	public AstroEntity(String commonName){
		this.commonName=commonName;
	}
}
