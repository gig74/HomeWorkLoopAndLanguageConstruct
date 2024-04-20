import java.util.Scanner;

public class LoopFizzBuzz {
    public static String WORD_DIV_3 = "fizz";
    public static String WORD_DIV_5 = "buzz";
    public static String WORD_DIV_3_AND_5 = "fizzbuzz";
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        String inInt = in.nextLine();
        in.close();
        int n = Integer.parseInt(inInt);
        if (n >= 0) {
            for (int i = 0; i <= n; i++) {
                String forPrint = "";

                int div3 = i % 3 ;
                int div5 = i % 5 ;
                if (i == 0) {
                    forPrint = "0" ; // Так указано в контрольном примере
                } else if ( div3 == 0 && div5 == 0 ) {
                    forPrint = " " + WORD_DIV_3_AND_5 ;
                } else if ( div3 == 0 ) {
                    forPrint = " " + WORD_DIV_3 ;
                } else if ( div5 == 0 ) {
                    forPrint = " " + WORD_DIV_5 ;
                } else {
                    forPrint = " " + i ;
                }
                System.out.print(forPrint);
            }
        }
        else {
            System.out.println("Введённое число отрицательное, нельзя обработать");
        }
    }
}
