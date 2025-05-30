package string_program;

public class Program3 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("hello java");
		System.out.println(sb);//hello java
		System.out.println(sb.length());//10
		sb.setLength(5);
		System.out.println(sb);//hello
		sb.replace(0, 0, "H");
		System.out.println(sb);
		
		sb.insert(0, "data");
		System.out.println(sb);
		sb.delete(0, 4);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
	}
}
