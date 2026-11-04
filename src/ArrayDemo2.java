import java.util.Scanner;

public class ArrayDemo2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of your array : ");
        int size = scanner.nextInt();

        int [] myArray = new int[size];
        System.out.println("Enter "+size+" arrays : ");
        for(int m = 0;m<size;m++){
            myArray[m] = scanner.nextInt();
        }

        System.out.println("Reverse Array");
        for(int i = myArray.length -1;i >= 0;i--){
            System.out.println(myArray[i]);
        }

        scanner.close();
    }
}