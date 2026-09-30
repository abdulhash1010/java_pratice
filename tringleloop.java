
//square with loop

public class tringleloop {
public static void main(String[] args) {
//     for(int i=0; i <=5; i++){
//         for(int j=0; j<=5; j++){
//             System.out.print(" * ");
//         } 
//         System.out.println(" ");
//     }

//     System.out.println();


// //tringle with loop

//       for(int i =1; i<=5; i++){
//         for(int j = 1; j<=i; j++){
//             System.out.print(" * ");
//         } 
//         System.out.println(" ");
//       }
//          System.out.println();

//       //invertied tringle with loop

//       for(int i = 5; i>=1; i--){
//         for(int j = 1; j<=i; j++){
//             System.out.print(" * ");
//         }
//         System.out.println(" ");
//       }
//      }
//  }

        //pyramid

        for(int i = 1; i<=5;i++){

            for(int j = 1; j<=5-i; j++){
                System.out.print(" ");
            } 
         
                for(int j = 1; j<=i; j++){
                
                    System.out.print(" * ");
                }
                System.out.println();
            }
//         
              System.out.print("  ");
  System.out.println("  ");

        //invertied pyremid
        for(int i = 5; i>=1;i--){

            for(int j = 1; j<=5-i; j++){
                System.out.print(" ");
            } 
               for(int j = 1; j<=i; j++){

                 System.out.print(" * ");
                }
              System.out.println();
            }
             System.out.print("  ");
        }
}