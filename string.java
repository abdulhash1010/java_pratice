// public class prac {
//     public static void main(String[] args) {
//         // String name = "hello abdul";
//         // System.out.print("the name is");

//         int a = 6;
//         float b = 5.999f;
//         System.out.printf("the value of a is %d and thr value of f is %f",a,b);

//         char c = 'h';
//         float d = 9.000f;
//         System.out.printf("the value of c is %c and the value of d is %f ",c,d);
//     }
// }


class string {
    public static void main(String[] args) {
        // String name = "abdul";
        // System.out.println(name);
        // //length of string

        // System.out.println(name.length());

        // // name with lowercase

        // System.out.println(name.toLowerCase());

        // // name with upercase

        // System.out.println(name.toUpperCase());

        // // name with trim

        // String name2 = "   abdul   ";
        // System.out.println(name2.trim());

        // //replace string

        // System.out.println(name.replace('l','k'));

        // System.out.println(name.replace("abdul", "ali"));

        // //start string is true or false

        // System.out.println(name.startsWith("ab"));
        // System.out.println(name.endsWith("ul"));

        // // string is equal

        // System.out.println(name.equals("abdul"));
        // System.out.println(name.equals("ali"));

        // solving problems


        //ques:- write a java rogram to replace space with  underscore?

       String names = "i  am  abdul  ";
        System.out.println(names.replace(' ', '_'));


        //ques :- write a java program to fill ikn a letter template which look like below
        //letter= dear<|name|>,thanks a lot

        String letter = "dear name thanks a lot";
        System.out.println(letter.replace("name", "abdul"));

        // ques:- letter = "dear harry,this java course is nice . thanjs"

        String letter2 = "dear harry,\n \tthis java course is nice .\n  thanks";
        System.out.println(letter2);

        String letter3 = "dear name thanks a lot";

        System.out.println(letter3.charAt(3));
    }
}