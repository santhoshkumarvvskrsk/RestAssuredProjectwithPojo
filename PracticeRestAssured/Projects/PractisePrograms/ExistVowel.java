import java.util.regex.*;

public class ExistVowel {
	
	public static void main(String[] args) {
		String sv = "welcome";
		String regrex ="[aieouAEIOU]";
		
		Pattern pattern = Pattern.compile(regrex);
		Matcher matcher = pattern.matcher(sv);
		if(matcher.find()) {
			System.out.println("String Contains Vowels");
		}else {
			System.out.println("String doesnot contain Vowels");
		}	
	}
	
	
}
