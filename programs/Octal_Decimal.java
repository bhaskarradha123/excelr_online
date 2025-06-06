class Octal_Decimal{
    public static void main(String[] args) {
        int octalNum=157;
        int decimalNum=0;
        int power=0;
        while(octalNum>0){
            int rem=octalNum%10;
          decimalNum+= rem*Math.pow(8,power++);
            octalNum/=10;
        }
        System.out.println("Decimal value is: "+decimalNum);

    }
}