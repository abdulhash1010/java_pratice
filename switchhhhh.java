import java.util.Scanner;



public class switchhhhh {
    public static void main(String[] args) {
        //int age = 19;
        //  switch(age){
        //  case 19:
        //  System.out.println("eligible for bike");
        //  break;
        //  case 15:
        //  System.out.println("not eligible for bike");
        //  default:
        //     System.out.println(" ");

            
        //  }

        Scanner Sc = new Scanner(System.in);
        System.out.println("enter number 1 to 7");
        int day = Sc.nextInt();

         
         switch(day){
         case 1:
         System.out.println("monday");
         break;
         case 2:
         System.out.println("tuesday");
         case 3:
         System.out.println("wednesday");
         break;
         case 4:
         System.out.println("thusday");
         break;
         case 5:
         System.out.println("friday");
         break;
         case 6:
         System.out.println("saturday");
         break;
         case 7:
         System.out.println("sunday");
         break;
         default:
            System.out.println("invalid day number ");

            
         }
         Sc.close();
         
    }
    
}
