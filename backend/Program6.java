class Program6{


public static void main(String[]args){
   int a=10;
   System.out.println(a);
   int b=++a +  a++ + a--  +  --a  + a++;
   System.out.println("b value is "+b);
   System.out.println("a value is "+a);

}


}

/*
unary operator 

   it is used to increment/decrement the value by 1
   1.increment unary operator
           1.preincrement- first it will increase the value by 1 then it will use
           2.postincrement-first it will use then it increase the value by 1
   2.decrement unary operator
           1.predecrement-first it will decrease the value by 1 then it will use
           2.postdecrement-first it will use then it decrease the value by 1

*/