public class ArrayDemo2{
    private String model;
    private String core;
    private int Gen ;
    ArrayDemo2( String model,String core,int Gen){
        this.model = model;
        this.core = core;
        this.Gen = 7;
    }
    String  set_model(String model){
        this.model = model;
        return model;
    }
    String getModel(){
        this.model = model;
        return model;
    }
    String  set_core(String core){
        this.core = core;
        return core;
    }
    String getcore(){
        this.model = model;
        return model;
    }
    int setGen(int Gen){
        this.Gen = Gen;
        return Gen;
    }
    int getGen(){
        this.Gen = Gen;
        return Gen;
    }

    public static void main(String[] args) {
        ArrayDemo2 myLaptop1 = new ArrayDemo2("Latitude","i7",8);
        ArrayDemo2 myLaptop2 = new ArrayDemo2("latitude","i5");

    }

}