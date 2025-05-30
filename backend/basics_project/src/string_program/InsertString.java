package string_program;

public class InsertString {
   public static void main(String[] args) {
	
	   String s="";
	   
	   for(int i=1;i<=10;i++) {
		   s= s+i+",";
	   }
	   System.out.println(s);
	   
	   
	   StringBuilder b=new StringBuilder("");
	   for(int i=1;i<=10;i++) {
		   b.append(i).append(",");
	   }
	   System.out.println(b);
}
}
