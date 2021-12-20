
package factories;

import toyproduct.Toy;


public abstract class ToyFactory {
    
    public Toy produceToy(String type){
      Toy toy = this.createToy(type);
      toy.pack();
      toy.label();
      return toy;
    }
    
    final public SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();

    
    protected abstract Toy createToy(String type);
}
