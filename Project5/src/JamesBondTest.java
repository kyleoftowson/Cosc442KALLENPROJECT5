import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JamesBondTest {
	JamesBond j;
	@Before
	public void setUp() throws Exception {
	j=new JamesBond();
	}

	@After
	public void tearDown() throws Exception {
	j=null;
	}
	public boolean bondRegex(String s){
		return j.bondRegex(s);
	}
	@Test
	public void testCase0(){
	String str="((";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase1(){
	String str="((007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase2(){
	String str="((07";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase3(){
	String str="((7";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase4(){
	String str="(";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase5(){
	String str="()";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase6(){
	String str="()007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase7(){
	String str="()07";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase8(){
	String str="()7";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase9(){
	String str="(0(";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase10(){
	String str="(0(007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase11(){
	String str="(0(07";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase12(){
	String str="(0(7";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase13(){
	String str="(0";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase14(){
	String str="(0)";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase15(){
	String str="(0)007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase16(){
	String str="(0)07";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase17(){
	String str="(0)7";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase18(){
	String str="(00(";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase19(){
	String str="(00(007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase20(){
	String str="(00(07";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase21(){
	String str="(00(7";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase22(){
	String str="(00";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase23(){
	String str="(00)";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase24(){
	String str="(00)007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase25(){
	String str="(00)07";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase26(){
	String str="(00)7";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase27(){
	String str="(000";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase28(){
	String str="(000007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase29(){
	String str="(00007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase30(){
	String str="(0007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase31(){
	String str="(001";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase32(){
	String str="(001007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase33(){
	String str="(00107";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase34(){
	String str="(0017";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase35(){
	String str="(002";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase36(){
	String str="(002007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase37(){
	String str="(00207";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase38(){
	String str="(0027";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase39(){
	String str="(003";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase40(){
	String str="(003007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase41(){
	String str="(00307";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase42(){
	String str="(0037";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase43(){
	String str="(004";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase44(){
	String str="(004007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase45(){
	String str="(00407";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase46(){
	String str="(0047";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase47(){
	String str="(005";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase48(){
	String str="(005007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase49(){
	String str="(00507";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase50(){
	String str="(0057";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase51(){
	String str="(006";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase52(){
	String str="(006007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase53(){
	String str="(00607";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase54(){
	String str="(0067";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase55(){
	String str="(007(";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase56(){
	String str="(007(007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase57(){
	String str="(007(07";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase58(){
	String str="(007(7";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase59(){
	String str="(007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase60(){
	String str="(007)(";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase61(){
	String str="(007)(007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase62(){
	String str="(007)(07";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase63(){
	String str="(007)(7";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase64(){
	String str="(007)";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase65(){
	String str="(007))";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase66(){
	String str="(007))007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase67(){
	String str="(007))07";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase68(){
	String str="(007))7";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase69(){
	String str="(007)0";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase70(){
	String str="(007)0007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase71(){
	String str="(007)007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase72(){
	String str="(007)07";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase73(){
	String str="(007)1";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase74(){
	String str="(007)1007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase75(){
	String str="(007)107";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase76(){
	String str="(007)17";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase77(){
	String str="(007)2";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase78(){
	String str="(007)2007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase79(){
	String str="(007)207";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase80(){
	String str="(007)27";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase81(){
	String str="(007)3";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase82(){
	String str="(007)3007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase83(){
	String str="(007)307";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase84(){
	String str="(007)37";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase85(){
	String str="(007)4";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase86(){
	String str="(007)4007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase87(){
	String str="(007)407";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase88(){
	String str="(007)47";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase89(){
	String str="(007)5";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase90(){
	String str="(007)5007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase91(){
	String str="(007)507";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase92(){
	String str="(007)57";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase93(){
	String str="(007)6";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase94(){
	String str="(007)6007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase95(){
	String str="(007)607";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase96(){
	String str="(007)67";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase97(){
	String str="(007)7";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase98(){
	String str="(007)7007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase99(){
	String str="(007)707";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase100(){
	String str="(007)77";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase101(){
	String str="(007)8";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase102(){
	String str="(007)8007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase103(){
	String str="(007)807";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase104(){
	String str="(007)87";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase105(){
	String str="(007)9";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase106(){
	String str="(007)9007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase107(){
	String str="(007)907";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase108(){
	String str="(007)97";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase109(){
	String str="(0070";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase110(){
	String str="(0070007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase111(){
	String str="(007007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase112(){
	String str="(00707";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase113(){
	String str="(0071";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase114(){
	String str="(0071007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase115(){
	String str="(007107";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase116(){
	String str="(00717";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase117(){
	String str="(0072";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase118(){
	String str="(0072007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase119(){
	String str="(007207";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase120(){
	String str="(00727";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase121(){
	String str="(0073";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase122(){
	String str="(0073007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase123(){
	String str="(007307";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase124(){
	String str="(00737";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase125(){
	String str="(0074";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase126(){
	String str="(0074007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase127(){
	String str="(007407";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase128(){
	String str="(00747";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase129(){
	String str="(0075";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase130(){
	String str="(0075007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase131(){
	String str="(007507";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase132(){
	String str="(00757";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase133(){
	String str="(0076";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase134(){
	String str="(0076007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase135(){
	String str="(007607";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase136(){
	String str="(00767";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase137(){
	String str="(0077";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase138(){
	String str="(0077007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase139(){
	String str="(007707";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase140(){
	String str="(00777";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase141(){
	String str="(0078";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase142(){
	String str="(0078007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase143(){
	String str="(007807";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase144(){
	String str="(00787";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase145(){
	String str="(0079";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase146(){
	String str="(0079007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase147(){
	String str="(007907";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase148(){
	String str="(00797";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase149(){
	String str="(008";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase150(){
	String str="(008007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase151(){
	String str="(00807";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase152(){
	String str="(0087";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase153(){
	String str="(009";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase154(){
	String str="(009007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase155(){
	String str="(00907";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase156(){
	String str="(0097";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase157(){
	String str="(01";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase158(){
	String str="(01007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase159(){
	String str="(0107";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase160(){
	String str="(017";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase161(){
	String str="(02";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase162(){
	String str="(02007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase163(){
	String str="(0207";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase164(){
	String str="(027";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase165(){
	String str="(03";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase166(){
	String str="(03007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase167(){
	String str="(0307";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase168(){
	String str="(037";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase169(){
	String str="(04";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase170(){
	String str="(04007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase171(){
	String str="(0407";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase172(){
	String str="(047";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase173(){
	String str="(05";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase174(){
	String str="(05007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase175(){
	String str="(0507";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase176(){
	String str="(057";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase177(){
	String str="(06";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase178(){
	String str="(06007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase179(){
	String str="(0607";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase180(){
	String str="(067";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase181(){
	String str="(07";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase182(){
	String str="(07007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase183(){
	String str="(0707";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase184(){
	String str="(077";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase185(){
	String str="(08";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase186(){
	String str="(08007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase187(){
	String str="(0807";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase188(){
	String str="(087";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase189(){
	String str="(09";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase190(){
	String str="(09007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase191(){
	String str="(0907";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase192(){
	String str="(097";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase193(){
	String str="(1";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase194(){
	String str="(1007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase195(){
	String str="(107";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase196(){
	String str="(17";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase197(){
	String str="(2";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase198(){
	String str="(2007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase199(){
	String str="(207";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase200(){
	String str="(27";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase201(){
	String str="(3";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase202(){
	String str="(3007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase203(){
	String str="(307";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase204(){
	String str="(37";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase205(){
	String str="(4";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase206(){
	String str="(4007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase207(){
	String str="(407";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase208(){
	String str="(47";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase209(){
	String str="(5";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase210(){
	String str="(5007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase211(){
	String str="(507";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase212(){
	String str="(57";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase213(){
	String str="(6";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase214(){
	String str="(6007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase215(){
	String str="(607";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase216(){
	String str="(67";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase217(){
	String str="(7";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase218(){
	String str="(7007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase219(){
	String str="(707";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase220(){
	String str="(77";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase221(){
	String str="(8";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase222(){
	String str="(8007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase223(){
	String str="(807";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase224(){
	String str="(87";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase225(){
	String str="(9";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase226(){
	String str="(9007";
	assertTrue(bondRegex(str));
	}
	@Test
	public void testCase227(){
	String str="(907";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase228(){
	String str="(97";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase229(){
	String str="";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase230(){
	String str=")";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase231(){
	String str=")007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase232(){
	String str=")07";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase233(){
	String str=")7";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase234(){
	String str="0";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase235(){
	String str="0007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase236(){
	String str="007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase237(){
	String str="07";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase238(){
	String str="1";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase239(){
	String str="1007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase240(){
	String str="107";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase241(){
	String str="17";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase242(){
	String str="2";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase243(){
	String str="2007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase244(){
	String str="207";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase245(){
	String str="27";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase246(){
	String str="3";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase247(){
	String str="3007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase248(){
	String str="307";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase249(){
	String str="37";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase250(){
	String str="4";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase251(){
	String str="4007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase252(){
	String str="407";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase253(){
	String str="47";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase254(){
	String str="5";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase255(){
	String str="5007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase256(){
	String str="507";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase257(){
	String str="57";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase258(){
	String str="6";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase259(){
	String str="6007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase260(){
	String str="607";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase261(){
	String str="67";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase262(){
	String str="7";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase263(){
	String str="7007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase264(){
	String str="707";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase265(){
	String str="77";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase266(){
	String str="8";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase267(){
	String str="8007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase268(){
	String str="807";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase269(){
	String str="87";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase270(){
	String str="9";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase271(){
	String str="9007";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase272(){
	String str="907";
	assertFalse(bondRegex(str));
	}
	@Test
	public void testCase273(){
	String str="97";
	assertFalse(bondRegex(str));
	}

}
