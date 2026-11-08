import java.util.Scanner;

public class ArrayDemo2{
    public static void main(String[] args){
        //let's ask the user of number of arrays
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values is the array : ");
        int n = sc.nextInt();

        //store the number of arrays in the new array
        int [] myArray = new int[n];
        //loop to store the arrays
        for (int i=0;i<n;i++){
            myArray[i] = sc.nextInt();
        }
        //reverse the array
        System.out.println("REVERSED ARRAYS");
        for (int i = myArray.length -1;i>=0;i--){

            System.out.println(myArray[i]);

       }


    }
}