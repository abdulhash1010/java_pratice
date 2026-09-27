import java.util.Scanner;

class calcuwithwhileloop {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        int on = 1;

        while (on == 1) {

            System.out.println("enter no. 1 (000 to quit): ");       // Number 1 mein agar user 000 type krega to calculater off hojaayga
            int a = Sc.nextInt();
            if (a == 000) {                         // Check krne ke liye ki calculater on hai ki nahi
                System.out.println("calculater Off");
                on = 0;            // On ki value 1 se 0 krne ke liye
                break;
            }

            System.out.println("enter operater: ");
            char op = Sc.next().charAt(0);

            System.out.println("enter no. 2: ");
            int b = Sc.nextInt();

            System.out.println("Ans: ");

            if (op == '+') {
                System.out.println(a + b);
            } else if (op == '-') {
                System.out.println(a - b);
            } else if (op == '*') {
                System.out.println(a * b);
            } else {
                System.out.println(a / b);
            }

            System.err.println("\n");    // For new line after answer
        }

        Sc.close();
    }

}