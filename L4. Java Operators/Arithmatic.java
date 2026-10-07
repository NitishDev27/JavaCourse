public class Arithmatic{
    public static void main(String[] args) {
        //Arithmatic operator  --> +, -, *, /, %, +=, *=, -=, /=, %=, ++, -- 
        int a=10;
        int b=40;

        int c=a+b;
        int d=b-a;
        int e=a*b;
        int f=b/a;
        int g=b%a;

        System.out.println(c + "," + d + "," + e + "," + e + "," + f + "," + g);

        int h=a+2;
        
        h+=2; // it means h=h+2
        h-=2; // it means h=h-2
        h*=2; // it means h=h*2
        h/=2; // it means h=h/2
        h%=2; // it means h=h%2

        System.out.println(h);
        
        // increment and decrement
        int i=6;
        i++; // increment by 1 that means i=i+1
        i--; // decrement by 1 that means i=i-1

        System.out.println(i);

        // pre increment and post increment/decrement

        int j=8;
        ++j; //prefix increment
        --j; // prefix decrement
        j++; // postfix increment
            // j=9
        int k=j++; // k = j; j = j + 1;;
        System.out.println(j+"," +k);

        int l=++j; // l = j + 1;
        System.out.println(j+"," +l);
}
}