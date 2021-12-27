package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AsianCarToy;
import toyproduct.models.AsianHelicopterToy;


public class AsianToyFactory extends ToyFactory{

    @Override
    protected Toy createToy(String type) {
        switch(type){
            case "car":
               AsianCarToy car = new AsianCarToy(generator.next());
               return car;
            case "helicopter":
                AsianHelicopterToy helicopter = new AsianHelicopterToy(generator.next());
                return helicopter;
            default:
                return null;   
        }
    }
    
}
