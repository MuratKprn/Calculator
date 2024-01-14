import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "Please select the action you want to perform below.\n"
                    + "1- Sum Up\n"
                    + "2- Subtraction\n"
                    + "3- Multiplication\n"
                    + "4- Division\n"
                    + "5- Exponential Numbers\n"
                    + "6- Mod Operations\n"
                    + "7- Rectangle Area and Perimeter\n"
                    + "0- Quit\n";

        System.out.println(menu);

        while (true){
            System.out.println("Select a function : ");
            select = scanner.nextInt();

            if (select == 0){
                break;

            } else if (select < 0 || select > 7) {
                System.out.println("You entered an invalid function!");

            }else {
                System.out.print("1. number :");
                double a = scanner.nextDouble();

                System.out.print("2. number :");
                double b = scanner.nextDouble();

                switch (select){
                    case 1:
                        Methods.sumUp(a,b);
                        break;
                    case 2:
                        Methods.subtraction(a,b);
                        break;
                    case 3:
                        Methods.multiplication(a,b);
                        break;
                    case 4:
                        Methods.division(a,b);
                        break;
                    case 5:
                        Methods.exponentialNumbers(a,b);
                        break;
                    case 6:
                        Methods.mod(a,b);
                        break;
                    case 7:
                        Methods.square(a,b);
                        break;
                }
            }
        }
    }
}
