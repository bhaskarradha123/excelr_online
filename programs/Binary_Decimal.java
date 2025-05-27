public class Binary_Decimal {
    
    public static void main(String[] args) {
        int binary=1010;
        int pow=0;
        int decimal=0;
        while(binary>0){
            int rem=binary%10;
            decimal +=rem*Math.pow(2, pow++);
            binary/=10;
        }
        System.out.println("Decimal value is: " + decimal);
    }
}
