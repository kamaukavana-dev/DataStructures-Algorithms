public class ArrayDemo{
    //create the class attributes
    private String name;
    private int age;
    private int height;

    //user of getters and setters for name
    public String getName(){
        return name;
    }
    public void SetName(String Name){
        this.name = name;

    }
    //use of getters and setters for age
    int getAge(){
        return age;
    }
    int SetAge(int age){
        this.age = age;
        return age;
    }
    //use of getters and setters for height
    int getHeight(){
        return height;
    }
    public int setHeight(int height){
        this.height = height;
        return height;
    }
    void getinfo(){
        System.out.println("My name is "+getName());
    }

    public static void main(String[] args) {
        //create a new object
        ArrayDemo Person = new ArrayDemo();
        //set name
        Person.SetName("Daniel");
        Person.getinfo();




    }
}