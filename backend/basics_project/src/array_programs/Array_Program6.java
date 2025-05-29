package array_programs;


public class Array_Program6 {

 public static void main(String[] args) {
		int [][]arr= {{10,20,30},{40,50,60},{70,80,80}};
		int [][]arr1= {{100,200,300},{400,500,600},{700,800,800}};

		for(int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]+" * "+arr1[i][i]+" = "+(arr[i][j]*arr1[i][j]));
			}
			System.out.println();
		}
}
	
}
