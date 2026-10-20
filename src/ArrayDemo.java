public class ArrayDemo{
    public static void main(String[] args){
        int [] [] num = {{1,2,3,4},{5,6,7},{4,2,3,5,6,7}};
        System.out.println("Number of rows : "+num.length);
        System.out.println("Number of columns in row 1 : "+num[0].length);
        System.out.println("Number of columns in row 2 : "+num[1].length);
        System.out.print("Number of columns in row 3 : "+num[2].length);

    }
}
