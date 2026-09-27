import java.util.Scanner;

class takinginput{
    public static void main(String[]args){
        System.out.println("taking input from users");
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter number 1");
        int a = Sc.nextInt();
        System.out.println("enter number 2");
        int b = Sc.nextInt();
        System.out.println("enter number 3");
        int c = Sc.nextInt();
        int sum = a+b+c;
        int sub = a-b-c;
        int mul = a*b*c;
        double div = a/b/c;
        
        System.out.println(("the sum of these numbers:") + (sum));
        System.out.println(("the sub of these numbers:") + (sub));
        System.out.println(("the mul of these numbers:") + (mul));
        System.out.println(("the div of these numbers:") + (div));
        Sc.close();

    }
}