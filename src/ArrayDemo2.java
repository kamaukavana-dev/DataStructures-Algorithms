public class ArrayDemo2 {
    public static void main(String[] args) {

        System.out.println("Factorial of 5 is"+" "+fact(5));

    }

    static int fact(int num) {
        if (num > 1) {
            int factorial = num * fact(num - 1);
            return factorial;
        } else {
            return 1;
        }
    }
}