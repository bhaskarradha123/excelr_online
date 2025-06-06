public class Decimal_Octal {
    
    public static void main(String[] args) {
        int decimal=111;
        String octal="";
        while(decimal>0){
            int rem=decimal%8;
            octal=rem+octal;
            decimal=decimal/8;
        }

        System.out.println("Octal value is: "+octal);
    }
}
