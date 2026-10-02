public class conversion {
    public static void main(String[] args) {
        // implicit conversion
        // (byte ot int)

        //byte b = 24;
        //int i=b;
        //System.out.println(i);

        // (charater into int)
        //char c ='h';
        //int i=c;
        //System.out.println(i);

        //explicit conversion
        //(int to byte)

        //int i=300;
       // byte b=(byte)i;
       // System.out.println(b);

        //Turncating conversion
        float f=34.334f;
        int i;
        i=(int)f;
        System.out.println(i);

        // Boolean to any datatype
        // this is not possible

        byte b=50;
        b=(byte)(b*2);
        System.out.println(b);


        
    }
}
