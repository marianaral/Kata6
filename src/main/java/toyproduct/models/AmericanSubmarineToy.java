package toyproduct.models;

import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproduct.Toy;
import toyproduct.components.Engine;

public class AmericanSubmarineToy implements Toy {

    final private Integer serialNumber;
    final String type = "submarine";
    private final AmericanComponentFactory factory;
    private Engine engine;
    
    public AmericanSubmarineToy(Integer serialNumber) {
        this.serialNumber=serialNumber;
        this.factory = new AmericanComponentFactory();
    }

    
    @Override
    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    @Override
    public void pack() {
        System.out.printf("Packing %s '%d'\n", this.type, this.serialNumber);

    }

    @Override
    public void label() {
        System.out.printf("Labeling %s '%d'\n", this.type,this.serialNumber);

    }
    
    @Override
    public String toString() {
        return "AmericanSubmarineToy{" + "serialNumber=" + serialNumber + '}';
    }

    @Override
    public void prepare() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
