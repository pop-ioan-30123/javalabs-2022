package isp.lab4.exercise1;

public class TemperatureSensor {

    //atribute
    private int value;
    private String location;
    //constructori
    public TemperatureSensor () {
        this.value=0;
        this.location="Dormitor";
    }
    
    public TemperatureSensor(int type, String location) {
        this.value=type;
        this.location=location;
    }
    //metode
    public int getValue() {
        return this.value;
    }
    
    public String getLocation() {
        return this.location;
    }
    
    @Override
    public String toString(){
        return this.location+' '+this.value;
    }
}
