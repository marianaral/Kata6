package toys;


public class ToyBusiness {
    final private SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
    
    
    public Car createCar() {
        Car car = new Car(serialNumberGenerator.next());
        car.pack();
        car.label();
        return car;
    }
    
    public Helicopter createHelicopter() {
        Helicopter helicopter = new Helicopter(serialNumberGenerator.next());
        helicopter.pack();
        helicopter.label();
        return helicopter;
    }
}
