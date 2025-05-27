public class LargestNumberInArray {
     public static void main(String[] args) {
         int[]arr={34,78,65,10,3,67,85};
         int largest=arr[0];
         int smallest=arr[0];
         
         for(int i=0;i<arr.length;i++){
             if(arr[i]>largest){
                    largest=arr[i];       
             }
         }
         for(int i=0;i<arr.length;i++){
             if(arr[i]<smallest){
                    smallest=arr[i];       
             }
         }
 System.out.println("Largest number  " + largest+" Smallest number "+smallest);
     }
}
