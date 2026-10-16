
public class conditional {

    public static void main(String[] args) {
        // Selection Statment
        // if statement

        int num = 40;
        if (num > 20);
        System.out.println("Number is positive");

        // if-else statement
        int n = 7;
        if (n % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // Nested ifs

        int i = 11;
        if(i > 7){
            if(i < 10){
                System.out.println("i is less than 10");
            }
            else{
                System.out.println("i is greater than 10");
            }
        }
        else{
            System.out.println("i is grater than 7");
        }

        // if-else-if     ladder

        int d = 8;

        if(d == 5){
            System.out.println("d is equal to 5");
        }
        else if(d == 6){
            System.out.println(" d is equal to 6");
        }
        else if(d == 7){
            System.out.println("d is equal to 7");
        }
        else if(d == 8){
            System.out.println("d is equal to 8");
        }

    }
}
