public class ArrayDemo2{
    private int Gen ;
    private String model;
    private String core;

    ArrayDemo2(int Gen, String model,String core){
        this.Gen = 7;
        this.model = model;
        this.core = core;
    }

    String  set_model(String model){
        this.model = model;
        return model;
    }
    String get_model(){
        return model;
    }
    String  set_core(String core){
        this.core = core;
        return core;
    }
    String getcore(){
        return model;
    }
    int setGen(int Gen){
        this.Gen = Gen;
        return Gen;
    }
    int getGen(){
        return Gen;
    }
    void LaptopInfo(){
        System.out.printf("Model : %s , Core : %s , Gen : %d ",model,core,Gen);
    }

    public static void main(String[] args) {
        ArrayDemo2 myLaptop1 = new ArrayDemo2(8,"Latitude","i7");
        ArrayDemo2 myLaptop2 = new ArrayDemo2(7,"Ryzen","i9");
        myLaptop1.getcore();
        myLaptop2.setGen(6);
        myLaptop2.getGen();
        myLaptop1.LaptopInfo();
        System.out.println(" ");
        myLaptop2.LaptopInfo();

    }

}