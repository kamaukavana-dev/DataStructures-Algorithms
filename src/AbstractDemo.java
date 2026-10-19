abstract class Animal{
    public abstract void move();
    public void sound(){
        System.out.println("beeeeeeh!!!");
    }
}
class Cow extends Animal{
    public void move(){
        System.out.println("moves on four legs");
    }

    @Override
    public void sound() {
        System.out.println("mooows!!");
    }
}
public class AbstractDemo {
    public static void main(String[] args){
        Cow mycow = new Cow();
        mycow.move();
        mycow.sound();
    }
}