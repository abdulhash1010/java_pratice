public class Basic {

    public static void main (String[]args){
        // System.out.println("hello i am abdul\nI am learning Java\nJava is fun");
        String name = "abdul rehman";
         int age = 82;
        float height = 6.6f;
        char grad = 'A';
        boolean student = true;

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("height: " + height );
        System.out.println("grad: " + grad);
        System.out.println("student: " + student);


        // sum 

        int a = 10;
        int b = 5;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println("sum: " + sum);
        System.out.println("sub: " + sub);
        System.out.println("mul: " + mul);
        System.out.println("div: " + div);

        // Avg marks
        int sci = 90;
        int mat = 90;
        int eng = 100;
        int avg = (sci + mat + eng) / 3;

    System.out.println(avg);


    // updating a variable

    int x = 80;
    x = 10;

    System.out.println(x);

    //+= add & assign

    int g = 40;
    g+=40;
    System.out.println(g);

    int v = 80;
    v-=50;
    System.out.println(v);

    int n = 20;
    n*= 5;
    System.out.println(n);

    int m = 90;
    m/=30;
    System.out.println(m);


    //pre & post assign operater

    int f = 40;
    int s = ++f;
    System.out.println(f);
    System.out.println(s);

    int d = 89;
    int j = d++;
    System.out.println(d);
    System.out.println(j);

    int k = 78;
    int u = --k;
    System.out.println(k);
    System.out.println(u);

    int e = 90;
    int r = e--;
    System.out.println(e);
    System.out.println(r);

   
    } 
    
}
