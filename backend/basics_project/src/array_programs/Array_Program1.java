package array_programs;

public class Array_Program1 {

	public static void main(String[] args) {
		//declaring a array and assigning 
		int []intArray= {1,2,3,4,5};
		int intArray2[]= {1,2,3,4,5};
		//declaring and providing a size
		int []arr1=new int[5];
		//accessing through index position
		System.out.println(intArray);//address of an array
		System.out.println(intArray[0]);//1
		System.out.println(intArray[6]);//Exception : ArrayIndexOutOfBound

	}
}
