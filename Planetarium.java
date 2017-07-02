import java.text.ParseException;
import java.util.Date;

public class Planetarium {

	private static final Micro_Sun MS2 = null;

	public static void main(String[] args) throws ParseException {
		String[] Bodies={""};
		AstronomicalUnits AU = new AstronomicalUnits(0.39);
		EarthDay ED = new EarthDay( 58.65);
		EarthDay ED1 = new EarthDay( 87.97);
		Micro_Sun MS = new Micro_Sun(0.06);
		Earth_Mass EM = new Earth_Mass(0.166);
		TerrestrialPlanets Mercury = new TerrestrialPlanets("Mercury", AU,ED,ED1, 0, Bodies, false, false,MS,EM);
		AstronomicalUnits AU1 = new AstronomicalUnits(0.72);
		EarthDay ED2 = new EarthDay( 243.1);
		EarthDay ED3 = new EarthDay( 224.7);
		Micro_Sun MS1 = new Micro_Sun(0.82);
		Earth_Mass EM1 = new Earth_Mass(2.447);
		TerrestrialPlanets Venus = new TerrestrialPlanets("Venus", AU1, ED2, ED3, 0, Bodies, false,false,MS1,EM1);
		String[] current = { "Moon" };
		AstronomicalUnits AU2 = new AstronomicalUnits(1.0);
		EarthDay ED4 = new EarthDay( 1.0);
		EarthDay ED5 = new EarthDay(  365.256);
		Micro_Sun MS2 = new Micro_Sun(1);
		Earth_Mass EM2 = new Earth_Mass(3.003);
	TerrestrialPlanets Earth = new TerrestrialPlanets("Earth", AU2, ED4, ED5, 1, current, false, true,MS2,EM2);
		String[] current1 = { "phobos", "Deimos" };
		AstronomicalUnits AU3 = new AstronomicalUnits(1.524);
		EarthDay ED6 = new EarthDay(1.026);
		EarthDay ED7 = new EarthDay(  687.0);
		Micro_Sun MS3 = new Micro_Sun(0.11);
		Earth_Mass EM3 = new Earth_Mass(0.3227);
		TerrestrialPlanets Mars = new TerrestrialPlanets("Mars", AU3,ED6 ,ED7 , 2, current1, false, true,MS3,EM3);
				String sat[] = {"Ganymede", "Callisto", "Io" };
				AstronomicalUnits AU4 = new AstronomicalUnits(5.203);
				EarthDay ED8 = new EarthDay( 0.41);
				EarthDay ED9 = new EarthDay(  4332.71);
				Micro_Sun MS4 = new Micro_Sun(317.8);
				Earth_Mass EM4 = new Earth_Mass(954.792);
				GasGaints Jupiter = new GasGaints("Jupiter", AU4, ED8, ED9, 67, sat, true, true,MS4,EM4);
				System.out.println(Jupiter.getFactualSummary());
				String sat1[] = {"Titan", "Rhea", "Iapetus" };
				AstronomicalUnits AU5 = new AstronomicalUnits(9.54);
				EarthDay ED10 = new EarthDay(0.426);
				EarthDay ED11 = new EarthDay( 10759.5);
				Micro_Sun MS5 = new Micro_Sun(95.2);
				Earth_Mass EM5 = new Earth_Mass(285.866);
				GasGaints Saturn = new GasGaints("Saturn",AU5,ED10 ,ED11 , 62, sat1, true, true,MS5,EM5);
				System.out.println(Saturn.getFactualSummary());
				String sat2[] = {"Titania", "Oberon", "Umbriel"};
				AstronomicalUnits AU6 = new AstronomicalUnits(19.9);
				EarthDay ED12 = new EarthDay( 0.717);
				EarthDay ED13 = new EarthDay(  30685.0);
				Micro_Sun MS6 = new Micro_Sun(14.6);
				Earth_Mass EM6 = new Earth_Mass(43.662);
				GasGaints Uranus = new GasGaints("Uranus",AU6,ED12 ,ED13 , 27, sat2, true, false,MS6,EM6);
				System.out.println(Uranus.getFactualSummary());
				String sat3[] = {"Triton", "Proteus", "Nereid"};
				AstronomicalUnits AU7 = new AstronomicalUnits(30.06);
				EarthDay ED14 = new EarthDay( 0.671);
				EarthDay ED15 = new EarthDay(  60190.0);
				Micro_Sun MS7 = new Micro_Sun(17.2);
				Earth_Mass EM7 = new Earth_Mass(51.514);
				GasGaints Neptune = new GasGaints("Neptune",AU7,ED14 ,ED15 , 14, sat3, true, false,MS7,EM7);
				System.out.println(Neptune.getFactualSummary());
				System.out.println(Mercury.getFactualSummary());
				System.out.println(Earth.getFactualSummary());
				System.out.println(Mars.getFactualSummary());
			System.out.println(Venus.getFactualSummary());
				String sat4[] = {"Charon", "Nix", "Hydra"};
				AstronomicalUnits AU8 = new AstronomicalUnits(39.53);
				EarthDay ED16 = new EarthDay( 6.386);
				EarthDay ED17= new EarthDay(  90800.0);
				Micro_Sun MS8 = new Micro_Sun(0.22);
				Earth_Mass EM8 = new Earth_Mass(0.00740);
				DwarfPlanets Pluto = new DwarfPlanets("Pluto",AU8,ED16,ED17, 5, sat4, false, false,MS8,EM8);
				System.out.println(Pluto.getFactualSummary());
				String sp[]= {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};				
				LightYears LY= new LightYears (0.0);
				Solar_Mass mass =new Solar_Mass(1); 
				MainSequenceStar sun = new MainSequenceStar("Sun", "Our Sun", Star.SpectralType.G,-26.75,4.82,LY,sp,1.0,mass);
				System.out.println(sun.getFactualSummary());
				String[] arcturusPlanets = {};
				LightYears LY1 = new LightYears (37.0);
				Solar_Mass mass1 =new Solar_Mass(1.1); 
				GaintStar arcturus = new GaintStar("Arcturus", "Alpha Bootis",Star.SpectralType.K,-0.04,-0.3,LY1,arcturusPlanets,GaintStar.Gaintness.gaint,mass1);
				System.out.println(arcturus.getFactualSummary());
				String[] sanduleakPlanets = {};
				LightYears LY2 = new LightYears (163000.0);
				Solar_Mass mass2 =new Solar_Mass(20); 
 				SupernovaStar sanduleak = new SupernovaStar("Sanduleak", "Supernova 1987A",Star.SpectralType.B,2.9,-15.6,LY2,sanduleakPlanets,SupernovaStar.SupernovaTypes.II,"05/20/1987",mass2);
				System.out.println(sanduleak.getFactualSummary());
				CelestialVisitors Halleycommet = new CelestialVisitors("Halley's commet", "01/01/1986", "01/01/2061", true);
				System.out.println(Halleycommet.getFactualSummary());
				CelestialVisitors Geminids = new CelestialVisitors("Geminids", "12/13/2016", "12/13/2017", true);
				System.out.println(Geminids.getFactualSummary());
	}
}		
				

				
				
				