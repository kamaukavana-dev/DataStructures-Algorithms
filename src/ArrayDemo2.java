public class ArrayDemo2{
    private String model;
    private String core;
    private int Gen;
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

}