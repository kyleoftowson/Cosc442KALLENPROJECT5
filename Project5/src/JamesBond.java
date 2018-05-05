import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JamesBond {
	public Boolean bondRegex(String input){
		// String to be scanned to find the pattern.
	      
	      String pattern = ".+(.+007.+).+";

	      
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(input);
	      if (m.find( )) {
	         return true;
	      }else {
	         return false;
	      }
	   }

	
}
