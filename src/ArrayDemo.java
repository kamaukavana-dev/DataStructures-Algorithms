public class ArrayDemo{
    public static void main(String[] args){
        int[][] myNums = { {4, 5, 2}, {3, 9, 8, 5, 7} };

        for (int[] row : myNums) {
            for (int num : row) {
                System.out.println(num);
            }
        }

    }
}
