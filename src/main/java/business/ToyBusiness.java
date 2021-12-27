package business;



import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproduct.Toy;
import toyproduct.models.AmericanHelicopterToy;
import toyproduct.models.AmericanCarToy;


public class ToyBusiness {
    private final ToyFactory toyFactory;         

    public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }
    
    public Toy produceToy(String type){
        return this.toyFactory.produceToy(type);
    }
   
}
