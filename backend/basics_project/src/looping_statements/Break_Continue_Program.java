package looping_statements;

public class Break_Continue_Program {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			   if(i==5) {
				   break;
			   }
			   System.out.println(i);
				
		}
			
		for(char i='a';i<='z';i++) {
			if(i=='e') {
				continue;
			}
			
			System.out.println(i);
		}
	}
}
