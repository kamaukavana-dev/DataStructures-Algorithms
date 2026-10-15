public class ArrayDemo {
    public static void main(String[] args) {
        int[][] num = new int[2][3];
        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;
        num[1][0] = 4;
        num[1][1] = 5;
        num[1][2] = 6;

        System.out.println(num[0][1]);

    }
}