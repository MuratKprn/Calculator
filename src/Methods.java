public class Methods {

    public static void main(String[] args) {

    }static double sumUp(double a,double b){
        double result = a + b;
        System.out.println("Result : " + result);
        return result;
    }static double subtraction(double a, double b){
        double result = a - b;
        System.out.println("Result : " + result);
        return result;
    }static double multiplication(double a,double b){
        double result = a * b;
        System.out.println("Result : " + result);
        return result;

    }static double division(double a,double b){
        double result = a / b;
        System.out.println("Result : " + result);
        return result;

    }static double exponentialNumbers(double a,double b){
        if (b == 0){
            System.out.println("A number to the zeroth power equals one");
            return 1;

        }double result = 1;
        for (int i = 1; i <= b ; i++) {
            result *= a;
        }
        System.out.println("Exponential Result : " + result);
        return result;

    }static double mod(double a,double b){
        double result = a % b;
        System.out.println("Mod : " + result);
        return result;

    }static void square(double a,double b){
        if (a<0 || b<0){
            System.out.println("Rectangle side length cannot be minus!");
        }else {
            System.out.println("Rectangle Area : "+ (a*b));
            System.out.println("Rectangle Perimeter: " + 2*(a+b));
        }
    }
}
