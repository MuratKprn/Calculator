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
            System.out.println("Bir işlem seçiniz : ");
            seçim = scanner.nextInt();
            if (seçim == 0){
                break;
            } else if (seçim < 0 || seçim > 7) {
                System.out.println("Geçersiz bir işlem girdiniz");
            }else {
                System.out.print("1. sayı :");
                double a = scanner.nextDouble();
                System.out.print("2. sayı :");
                double b = scanner.nextDouble();

                switch (seçim){
                    case 1:
                        method.toplama(a,b);
                        break;
                    case 2:
                        method.çıkarma(a,b);
                        break;
                    case 3:
                        method.çarpma(a,b);
                        break;
                    case 4:
                        method.bölme(a,b);
                        break;
                    case 5:
                        method.üslüsayı(a,b);
                        break;
                    case 6:
                        method.mod(a,b);
                        break;
                    case 7:
                        method.dörtgen(a,b);
                        break;
                }
            }
        }
    }
}
