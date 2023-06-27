public class App {
    public static void main(String[] args) {
        
        Garage garage = new Garage();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Audi");
        Car car3 = new Car("Mercedes");

        Bike bike1 = new Bike("Yamaha");

        garage.park(car1);
        garage.park(car2);
        garage.park(car3);

        garage.park(bike1);


    }
}
