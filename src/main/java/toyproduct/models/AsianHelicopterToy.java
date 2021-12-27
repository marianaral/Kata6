package toyproduct.models;

import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproduct.Toy;


public class AsianHelicopterToy implements Toy{
    final private Integer serialNumber;
    final private String type = "helicopter";
    private final AmericanComponentFactory factory;
    
    public AsianHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AmericanComponentFactory();

    }    
    
    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing %s '%d'\n", this.type, this.serialNumber);
    }
    
    @Override
    public void label(){
        System.out.printf("Labeling %s '%d'\n", this.type,this.serialNumber);

    }

    @Override
    public String toString() {
        return "AsianHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }

    @Override
    public void prepare() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
