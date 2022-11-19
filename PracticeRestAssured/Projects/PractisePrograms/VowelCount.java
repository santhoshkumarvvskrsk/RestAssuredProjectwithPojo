
public class VowelCount {

	public static void main(String[] args) {
		String sv="Welcome";
		char[] ch= sv.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(Character.toLowerCase(ch[i]) == 'a'||Character.toLowerCase(ch[i]) == 'e'||
				Character.toLowerCase(ch[i]) == 'i'||Character.toLowerCase(ch[i]) == 'o'
				||Character.toLowerCase(ch[i]) == 'u') {
				count++;
			}
		}
		System.out.println("count of vowels are"+count);
		
	}

}
