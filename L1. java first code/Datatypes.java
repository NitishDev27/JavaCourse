public class Datatypes {
    public static void main(String[] args){
        //Intergers--> bytes, short, int, long.
        // Binary(2), octal(8), Hexadecimal(16) number system
        //byte b = 5; // decimal
        //byte b =0b111; // Binary representation
        //byte b = 05; // 0--7 --> octal representation
        byte b = 0XA; // 0--9 use numver for 10--15 --> (A,B,C,D,E,F) Hexadecimal representation
        short s = 20;
        int i = 100;
        long l = 297239702;
        System.out.println("Integers are follows--> "+b+", "+s+", "+i+", "+l+"");

        //real nubmer
        float f = 70.57f;
        double d = 975.3993;
        System.out.println("Real nubmer -->"+f+", "+d+" ");

        //boolean 
        boolean bool = true;
        System.out.println("Boolena-->"+bool+"");

        // Caracters
        char c = 'b';
        System.out.println("Caraters-->"+c+"");
        

        

    }
}
