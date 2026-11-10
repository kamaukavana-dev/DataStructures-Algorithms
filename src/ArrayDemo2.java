public class ArrayDemo2{
    private String model;
    private String core;
    private int Gen ;

    ArrayDemo2(String model,String core,int Gen){
        this.model = model;
        this.core = core;
        this.Gen = Gen ;
    }
    ArrayDemo2(String model,String core){
        this.model = model;
        this.core = core;
        this.Gen = 7;
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
    String get_core(){
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
        System.out.println(" ");
    }

    public static void main(String[] args) {
        ArrayDemo2 myLaptop1 = new ArrayDemo2("Latitude","i7",8);
        ArrayDemo2 myLaptop2 = new ArrayDemo2("Ryzen","i9");
        myLaptop1.get_core();
        myLaptop2.LaptopInfo();
        myLaptop2.setGen(6);
        myLaptop2.getGen();
        myLaptop1.LaptopInfo();
        myLaptop2.LaptopInfo();

    }

}