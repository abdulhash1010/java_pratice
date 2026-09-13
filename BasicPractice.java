public class BasicPractice {

    public static void main(String[] args) {

        // =====================================================
        // QUESTION 1: Positive, Negative or Zero
        // =====================================================
        // Create an int variable and assign a value to it.
        // Check whether the number is positive, negative, or zero.
        //
        // Example:
        // int number = -10;
        //
        // Expected Output:
        // Negative
        

        // =====================================================
        // QUESTION 2: Even or Odd
        // =====================================================
        // Create an int variable and assign a value to it.
        // Check whether the number is even or odd.
        // Use the modulus (%) operator.
        //
        // Example:
        // int number = 17;
        //
        // Expected Output:
        // Odd
        

        // =====================================================
        // QUESTION 3: Greater of Two Numbers
        // =====================================================
        // Create two int variables.
        // Find and print which number is greater.
        // Also handle the case when both numbers are equal.
        //
        // Example:
        // int a = 25;
        // int b = 40;
        //
        // Expected Output:
        // 40 is greater
        

        // =====================================================
        // QUESTION 4: Voting Eligibility
        // =====================================================
        // Create an int variable called age.
        // Check whether the person is eligible to vote.
        //
        // Rule:
        // Age 18 or above -> Eligible
        // Below 18       -> Not Eligible
        //
        // Example:
        // int age = 21;
        //
        // Expected Output:
        // Eligible to vote
        

        // =====================================================
        // QUESTION 5: Student Result
        // =====================================================
        // Create an int variable called marks.
        // Check the student's result using if-else.
        //
        // Rules:
        // 90 or above -> Excellent
        // 75-89       -> Very Good
        // 60-74       -> Good
        // 40-59       -> Pass
        // Below 40    -> Fail
        //
        // Example:
        // int marks = 82;
        //
        // Expected Output:
        // Very Good
        

        // =====================================================
        // QUESTION 6: Largest of Three Numbers
        // =====================================================
        // Create three int variables.
        // Find and print the largest number.
        // Use the logical AND (&&) operator.
        //
        // Example:
        // int a = 35;
        // int b = 20;
        // int c = 50;
        //
        // Expected Output:
        // 50 is the largest
        

        // =====================================================
        // QUESTION 7: Temperature Checker
        // =====================================================
        // Create a double variable called temperature.
        // Categorize the temperature using if-else-if-else.
        //
        // Rules:
        // Below 10 -> Cold
        // 10-24    -> Cool
        // 25-34    -> Warm
        // 35+      -> Hot
        //
        // Example:
        // double temperature = 32.5;
        //
        // Expected Output:
        // Warm
        

        // =====================================================
        // QUESTION 8: Simple Calculator
        // =====================================================
        // Create two double variables and one char variable.
        // Perform the operation based on the operator.
        //
        // Operators:
        // +  Addition
        // -  Subtraction
        // *  Multiplication
        // /  Division
        //
        // Example:
        // double a = 20;
        // double b = 5;
        // char operator = '*';
        //
        // Expected Output:
        // 100.0
        //
        // Bonus:
        // Handle division by zero.
        

        // =====================================================
        // QUESTION 9: Login Checker
        // =====================================================
        // Create two String variables:
        // username
        // password
        //
        // Correct credentials:
        // username = "admin"
        // password = "1234"
        //
        // Check whether both username and password are correct.
        // Use .equals() for String comparison.
        // Use the logical AND (&&) operator.
        //
        // Expected Output:
        // Login Successful
        //
        // Otherwise:
        // Invalid Login
        

        // =====================================================
        // QUESTION 10: Electricity Bill
        // =====================================================
        // Create an int variable called units.
        // Calculate the electricity bill using if-else.
        //
        // Rules:
        // First 100 units  -> Rs. 5 per unit
        // Next 100 units   -> Rs. 7 per unit
        // Above 200 units  -> Rs. 10 per unit
        //
        // Example:
        // int units = 250;
        //
        // Calculate:
        // First 100 units  = 100 * 5
        // Next 100 units   = 100 * 7
        // Remaining 50     = 50 * 10
        //
        // Expected Output:
        // Total Bill = 1900

        //Answer=1
        
        int a = -10;
        if(a > 0){
            System.out.println("ans:" + "positive");
        }else if (a < 0){
            System.out.println("ans:" + "negative");
        }else {
            System.out.println("ans:" + "zero");
        }

    



// Answer 2

    int b = 17;

     if(b % 2 == 0){
        System.out.println("Ans:" + "Even");
    }else {
        System.out.println("Ans:" +"Odd");
    }

    //Ans 3

    int A = 20;
    int B = 40;
    if(A > B){
        System.out.println("A is greater");
    }else if (B > A){
        System.out.println("B is greater");
    }else{
        System.out.println("both are equal");
    
    System.out.println("test");
    }

     //ans 4

   int Age = 21;
   if(Age >= 18){
        System.out.println("person:" + "Eligible");
   }else{
    System.out.println("person:" + "not Eligible");
   }

   //ans 5

   int marks = 82;
   if (marks >= 90){
    System.out.println("student:" + "Excellent");
   }else if (marks >= 75 && marks <= 89){
    System.out.println("student:" +"very good");
   }else if (marks >= 60 && marks <= 74){
    System.out.println("student:" +"good");
   }else if (marks >= 40 && marks <= 59){
    System.out.println("student:" +"pass");
   }else {
    System.out.println("student:" +"fail");
   }

   //ans 6

   int g = 35;
   int h = 20;
   int m = 50;
   if (m > h && m > g){
    System.out.println("m:" + "large");
   }else if (h>g && h>m){
    System.out.println("h:"+ "larger");
   }else if (g>h && g>m){
    System.out.println("g:" + "larger");
   }
    
   //ans 7

   double temp = 32.5d;
   if (temp <= 10){
    System.out.println("TEMP:" + "cold");
   }else if (10 <= temp && temp >= 24){
    System.out.println("TEMP:" + "cool");
   }else if (25 <= temp && temp <= 34){
    System.out.println("TEMP:" + "warm");
   }else{
    System.out.println("TEMP:" + "hot");
   } 

   //ANS 8

   double n = 20;
   char operator = '*';
   double y = 5;
   if (operator == '+'){
    System.out.println("ans:"  + (n + y));
   }else if (operator == '-'){
    System.out.println("ans:" + (n - y));
   }else if (operator == '*'){
    System.out.println("ans:" + (n * y));
   }else if(operator == '/'){
    System.out.println("ans:" + (n / y));
   }
 
   //ans 9

   String username = "admin";
   int password = 1234;
   if(username=="admin" && password == 1234){
    System.out.println("login Successful");
   }else {
    System.out.println("invalid");
   }

  // ans 10

  int unit = 250;
  if(unit <= 100){
    System.out.println( unit * 5);
  }else if (unit <= 200){
    System.out.println( unit * 7);
  }else {
    
    System.out.println( ("totalbill:") + ((100 * 5) + (100 * 7) + ((unit - 200) * 10)));
  }
    
    }
}




