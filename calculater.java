 //calculater 

     import java.util.Scanner;
     class calculater{
         public static void main(String[]args){
             Scanner Sc = new Scanner(System.in);
             System.out.println("enter no. 1");
             int a = Sc.nextInt();
             System.out.println("enter operater");
             char op = Sc.next().charAt(0);
             System.out.println("enter no. 2");
             int b = Sc.nextInt();
             Sc.close();

             if(op=='+'){
                 System.out.println(a+b);
             }else if(op=='-'){
                 System.out.println(a-b);
             }else if(op=='*'){
                 System.out.println(a*b);
             }else
               System.out.println(a/b);
             }

         }
    
