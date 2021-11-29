package toys;

public class Car {
    final private Integer serialNumber;
    final private String type = "car";

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }    
    
    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }
    
    public void pack(){
        System.out.printf("Packing %s '%d'\n", this.type, this.serialNumber);
    }
    
    public void label(){
        System.out.printf("Labeling %s '%d'\n", this.type,this.serialNumber);

    }
}