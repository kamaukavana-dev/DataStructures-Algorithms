public class ArrayDemo2 {
    static void move(String name){
        System.out.println("Heeey "+name+" you are walking.");

    }
    static void move(String name ,int age){
        System.out.println("Heey "+name+" You are "+age+" years and you are walking.");
    }


    public static void main(String[] args) {
        move("Daniel");
        move("Daniel",20);

    }
}