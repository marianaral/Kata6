package business;



import toyproduct.Toy;
import toyproduct.models.AmericanHelicopterToy;
import toyproduct.models.AmericanCarToy;


public abstract class ToyBusiness {
    final public SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
   
}
