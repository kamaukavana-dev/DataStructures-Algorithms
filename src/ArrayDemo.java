public class ArrayDemo {
    public static void main(String[] args){
        String[] seats = {"John", "Jenny", "Liam", "Bo"};

        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat " + (i + 1) + ": " + seats[i]);
        }

    }
}