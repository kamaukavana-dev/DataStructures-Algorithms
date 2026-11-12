public class ArrayDemo{
    //create the class attributes
    private String name;
    private int age;
    private double height;

    //user of getters and setters for name
    public String getName(){
        return name;
    }
    public void SetName(String name){
        this.name = name;
    }
    //use of getters and setters for age
    public int getAge(){
        return age;
    }
    public void SetAge(int age){
        this.age = age;
    }
    //use of getters and setters for height
    public double getHeight(){
        return height;
    }
    public void SetHeight(double height){
        this.height = height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    void getinfo(){
        System.out.println("My name is "+getName()+" and i'm "+getAge()+" years old and "+getHeight()+" metres tall.");
    }

    public static void main(String[] args) {
        //create a new object
        ArrayDemo Person = new ArrayDemo();
        //set name
        Person.SetName("Daniel");
        Person.SetAge(6);
        Person.SetHeight(6.7);
        Person.getinfo();





    }
}