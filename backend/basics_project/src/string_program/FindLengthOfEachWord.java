package string_program;

public class FindLengthOfEachWord {

	public static void main(String[] args) {
		
		String s="this is a java program";
		int count=0;
		for(String word:s.split(" ")) {
			System.out.println(word+" "+word.length());
			count++;
		}
		System.out.println(count);
	}
}
