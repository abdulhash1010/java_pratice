public class practice {
    public static void main(String[] args) {
        
        // Practice program Questions

        // 1. A shirt costs $1500 and has a 20% discount. Calculate the discount amount and the final price

        int shirtAmt = 1500;
        int dis = 20;
        
        int disAmt = shirtAmt*dis/100;

        System.out.println("shirtAmt: "+(shirtAmt-disAmt));








        // 2. Create variables for birth year and current year, then calculate and print the person's age.

        int birthYr = 1998;
        int currentYr = 2026;

        System.out.println("age:" + (currentYr - birthYr));







        // 3. A Customer consumes 150 units of electricity at $6 per unit. Calculate and print the total electricity bill.

        System.out.println( "total bill:" + (1500*6));







        // 4. Salary Calculation program. Suppose an employee salary is 25000. He worked 23 days out of 26 working days, that means, he didnt worked for 3 days. He is to get 15% bonus on his salary and 10% tax deduction too. Calculate his bonus, tax, Salary after tax & bonus, per-day salary, Final salary (after bonus, tax, and 3 off days)
        
            int  perdaysalery = 30000/30;
            int  monthsal = perdaysalery*23;
            double bonus = monthsal*15/100;
            double salafterbonus = bonus + monthsal;
            double tax = salafterbonus*10/100;
            double salaftertax = salafterbonus - tax;



            System.out.println(salaftertax);






        // 5. Predict the output. Before running the program, comment answers : 
        int a = 10;
        int b = 3;

        // for example : 
        System.out.println(a + b);  // Answer : 13

        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println((double) a / b);
        System.out.println(a + b * 2);
        System.out.println((a + b) * 2);






        // 6. Shopping Bill program. A customer buys 3 shirts at 799, 2 jeans at 1299. He gets 15% discount on total. At checkout he pays 5% tax after the discount on total. Calculate and print : Total price, discount, Price after discount, tax, Final Bill

            int shirt = 3*799;
            int jeans = 2*1299;
            long total = shirt + jeans;
            double disc = total * 15/100;
            double priceafterdis = total - disc;
            double taxeafterdis = priceafterdis*5/100;
            double finalbill = priceafterdis+taxeafterdis;
            
            System.out.println(total);
            System.out.println(disc);
            System.out.println(priceafterdis);
            System.out.println(taxeafterdis);
            System.out.println(finalbill);




        // 7. Data type Trap. Predict the output: 

        int x = 5;
        double y = 2.5;
        int z = 2;

        System.out.println(x + y);
        System.out.println(x / z);
        System.out.println(x / y);
        System.out.println((int) y);
        System.out.println(x + z * y);





        // 8. Time Converter program. You are given time in seconds. Calculate and print hours, minutes and seconds. like :
        // Hours : 2
        // Minutes : 3
        // Seconds : 5

        int hour = 2*3600;
        int min = 3*60;
        int sec = hour+min+5;

        System.out.println(sec);


    }
}