public class ArrayDemo {
    public static void main(String[] args) {
        int  [] [] num = {{1,2,3},{4,5,6,7,8}};
        System.out.println(num[1][3]);
        for(int [] nums : num){
            System.out.println(nums[0]);
        }


    }
}