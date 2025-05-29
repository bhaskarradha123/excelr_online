package string_program;

public class FindVowels {
	public static void main(String[] args) {
		String s = "Programmer";
		int vowelCount = 0;
		int consonantCount = 0;
		String s2 = s.toLowerCase();
		for (char c : s2.toCharArray()) {
//		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
//		System.out.println(c+ " vowel");
//		else
//			System.out.println(c+" consonant");

			if ("aeiou".indexOf(c) != -1) {
				System.out.println(c + " vowel");
				vowelCount++;
			}
			else {
				System.out.println(c + " consonant");
				consonantCount++;
			}
		}
		System.out.println("vowel count "+vowelCount+" \nConsonant Count "+consonantCount);
	}
}