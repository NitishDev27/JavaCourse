public class logic {
     public static void main(String[] args) {
        // Logical Operators
       int a = 25;
       int b = 10;
       int c = 15;

       int m=25;
       int n=35;

       boolean o=(m<n) && (m>n);
       System.out.println(o);

       boolean d = (a < b) && (b < c);
       boolean f = (a > b) && (b > c);

       // Short circuit

       System.out.println(d); // false
       System.out.println(f);

}}
