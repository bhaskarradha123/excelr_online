package looping_statements;

public class For_Loop_Program {
	public static void main(String[] args) {
		
//		int num=1;
//		while(num<=10) {
//			System.out.println(num);
//			num++;
//		}	
		for(int num=1;num<=10;num++) {
			System.out.print(num+",");
		}
		
		
		System.out.println("\n-------------A-Z-----------------");
		
		for(char c='A';c<='Z';c++) {
			System.out.print(c+",");
		}
		System.out.println("\n----------z-a---------------------");
		for(char c='z';c>='a';c--) {
			System.out.print(c+",");
		}
		
		System.out.println("\n---------even numbers-------------");
		for(int i=2;i<=20;i=i+2) {
			System.out.print(i+",");
		}
		System.out.println("\n---------Multiples of 5-----------");
		for(int i=5;i<=50;i=i+5) {
			System.out.print(i+",");
		}
		
		
		System.out.println("\n-------Multiples of 4------------");
		int i=4;
		for(;i<40;) {
			System.out.print(i+",");
			i=i+4;
		}
		
	}
}
