import java.util.Scanner;
public class Example25 {
    public static void main(String[] args) {
        int number, mult;
        Scanner input =  new Scanner(System.in);
        number = input.nextInt();

        for (int i = 1; i <= 10; i++ ) {
            mult = i * number;
            System.out.println( number + " x " + i + " = " + mult);
        }


    }
}
