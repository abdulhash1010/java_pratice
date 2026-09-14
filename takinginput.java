import java.util.Scanner;

public class  takinginput{
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = Sc.nextInt();
        System.out.println("enter number 2");
        int b = Sc.nextInt();
        int sum = a+b;
        System.out.println(("the sum of these numbe9r is :") + (sum));
        Sc.close();
    }


}