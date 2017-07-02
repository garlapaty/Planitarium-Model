import java.text.ParseException;
import java.util.Date;



public class Planetarium {

	public static void main(String[] args) throws ParseException {
		String[] A={""};
		TerrestrialPlanets Mercury = new TerrestrialPlanets("Mercury", 0.39, 58.65, 87.97, 0, A, false, false);
		TerrestrialPlanets Venus = new TerrestrialPlanets("Venus", 0.72, 243.1, 224.7, 0, A, false,false);
		String[] current = { "Moon" };
		TerrestrialPlanets Earth = new TerrestrialPlanets("Earth", 1.0, 1.0, 365.256, 1, current, false, true);
		String[] current1 = { "phobos", "Deimos" };
		TerrestrialPlanets Mars = new TerrestrialPlanets("Mars", 1.524, 1.026, 687.0, 2, current1, false, true);
		// GasGaints Jupiter = new
				// GasGaints("Jupiter",5.203,0.41,4332.71,true,67,3, {}, true);
				String sat[] = {"Ganymede", "Callisto", "Io" };
				GasGaints Jupiter = new GasGaints("Jupiter", 5.203, 0.41, 4332.71, 67, sat, true, true);
				System.out.println(Jupiter.getFactualSummary());
				String sat1[] = {"Titan", "Rhea", "Iapetus" };
				GasGaints Saturn = new GasGaints("Saturn",9.54, 0.426, 10759.5, 62, sat1, true, true);
				System.out.println(Saturn.getFactualSummary());
				String sat2[] = {"Titania", "Oberon", "Umbriel"};
				GasGaints Uranus = new GasGaints("Uranus",19.9, 0.717, 30685.0, 27, sat2, true, false);
				System.out.println(Uranus.getFactualSummary());
				String sat3[] = {"Triton", "Proteus", "Nereid"};
				GasGaints Neptune = new GasGaints("Neptune",30.06, 0.671, 60190.0, 14, sat3, true, false);
				System.out.println(Neptune.getFactualSummary());
				System.out.println(Mercury.getFactualSummary());
				System.out.println(Earth.getFactualSummary());
				System.out.println(Mars.getFactualSummary());
				System.out.println(Venus.getFactualSummary());
				String sat4[] = {"Charon", "Nix", "Hydra"};
				DwarfPlanets Pluto = new DwarfPlanets("Pluto",39.53,6.386,90800.0, 5, sat4, false, false);
				System.out.println(Pluto.getFactualSummary());
				String sp[]= {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};				
				MainSequenceStar sun = new MainSequenceStar("Sun", "Our Sun", Star.SpectralType.G,-26.75,4.82,0.0,sp,1.0);
				System.out.println(sun.getFactualSummary());
				String[] arcturusPlanets = {};
				GaintStar arcturus = new GaintStar("Arcturus", "Alpha Bootis",Star.SpectralType.K,-0.04,-0.3,37,arcturusPlanets,GaintStar.Gaintness.gaint);
				System.out.println(arcturus.getFactualSummary());
				String[] sanduleakPlanets = {};
				SupernovaStar sanduleak = new SupernovaStar("Sanduleak", "Supernova 1987A",Star.SpectralType.B,2.9,-15.6,163000.0,sanduleakPlanets,SupernovaStar.SupernovaTypes.II,"05/20/1987");
				System.out.println(sanduleak.getFactualSummary());
				CelestialVisitors Halleycommet = new CelestialVisitors("Halley's commet", "01/01/1986", "01/01/2061", true);
				System.out.println(Halleycommet.getFactualSummary());
				CelestialVisitors Geminids = new CelestialVisitors("Geminids", "12/13/2016", "12/13/2017", true);
				System.out.println(Geminids.getFactualSummary());
	}
}		
				

				
				
				