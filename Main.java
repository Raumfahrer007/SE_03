public class Main {

    public static void main(String[] args) {
        System.out.println("Test");

        Car car = new Car(300, "Mercedes");
        Motorbike bike = new Motorbike(212, "BMW");
        Bicycle bicycle = new Bicycle("Orbea");

        bike.moveForward();
        //Polymorphism
        useVehicle(car);
        useVehicle(bicycle);
    }

    static private void useVehicle(Vehicle vehicle) {
        System.out.println("I'm using the " + vehicle.getClass().getSimpleName());
    }

    static abstract class Vehicle {
        int tires;
        boolean hasEngine;
        String brand;
    
        public Vehicle(int tires, boolean hasEngine, String brand) {
            this.tires = tires;
            this.hasEngine = hasEngine;
            this.brand = brand;
        }
    
        public abstract void start();
    
        public void moveForward() {
            System.out.println("Vehicle moves forward");
        }

        public void getSlower() {
            System.out.println("Vehicle slowes down");
        }
    }


    static abstract class MotorizedVehicle extends Vehicle {
        int horsepower;

        public MotorizedVehicle(int tires, int horsepower, String brand) {
            super(tires, true, brand);
            this.horsepower = horsepower;
        }

        public void start() {
            System.out.println("Engine starts ...");
        }
    }

    static abstract class NonMotorizedVehicle extends Vehicle {
        public NonMotorizedVehicle(int tires, String brand) {
            super(tires, false, brand);
        }

        public void start() {
            System.out.println("Nothing happens ...");
        }
    }


    static class Car extends MotorizedVehicle {
        public Car(int horsepower, String brand) {
            super(4, horsepower, brand);
        }
    }

    static class Motorbike extends MotorizedVehicle {
        public Motorbike(int horsepower, String brand) {
            super(2, horsepower, brand);
        }

        @Override
        public void moveForward() {
            System.out.println("Vehicle moves forward ... fast");
        }
    }


    static class Bicycle extends NonMotorizedVehicle {
        public Bicycle(String brand) {
            super(2, brand);
        }
    }
}