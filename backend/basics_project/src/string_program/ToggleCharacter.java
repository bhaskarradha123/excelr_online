package string_program;

public class ToggleCharacter {

	public static void main(String[] args) {
		String s="Programmer123..!!";
		StringBuilder toggle=new StringBuilder();
		for(char c:s.toCharArray()) {
			if(Character.isUpperCase(c)) {
				char ch=Character.toLowerCase(c);
				toggle.append(ch);
			}
			else if(Character.isLowerCase(c)) {
				char ch=Character.toUpperCase(c);
				toggle.append(ch);
			}
			else {
				toggle.append(c);
			}
		}
		System.out.println(toggle);
	}
}
