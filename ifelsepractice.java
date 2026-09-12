public class ifelsepractice {
    public static void main (String[] args){

        System.out.println("if-else practice\n");

        // Adult checker
        int n = 18;
        if(n >= 18){  // if true
            System.out.println("Adult");
        } else {    // agar false hai to yeh chlega
            System.out.println("Non-Adult");
        }
        
        System.out.println(8 <= 5);

        // Calculator program
          
        int a = 9;
        char operator = '*';
        int b = 8;

        if(operator == '+'){
            System.out.println("Ans: " + (a + b));
        } else if(operator == '-'){
            System.out.println("Ans: " + (a - b));
        } else if(operator == '*'){
            System.out.println("Ans: " + (a * b));
        } else if(operator == '/'){
            System.out.println("Ans: " + (a / b));
        } else{
            System.out.println("Error");
        }
    }

    // Range mein check krne ke liye hum variale ko beech mein rkhte hn
    // 0 < a <= 10

    // Comparison operators!
    // a < b - a Less than b
    // a > b - a greator than b
    // a >= b - a greator than or equal to b
    // a <= b - a less than or equal to b
    // a == b - a is equal to b
    
}
