public class Main {

    public static void main(String[] args) {
        Car car = new Car(300, "Mercedes");
        Motorbike bike = new Motorbike(212, "BMW");
        Bicycle bicycle = new Bicycle("Orbea");

        System.out.println("---Inheritance---");
        bike.moveForward();

        //Subtype Polymorphism
        useVehicle(car);
        useVehicle(bicycle);

        //Parametric Polymorphism
        System.out.println("---Polymorphism---");
        Box<Integer> intBox = new Box<>(5);
        Box<String> stringBox = new Box<>("Hello");
        System.out.println(intBox.getValue());
        System.out.println(stringBox.getValue());

        //Ad-hoc Polymorphism
        System.out.println(calculator(5));
        System.out.println(calculator(25, 6));
    }

    static private void useVehicle(Vehicle vehicle) {
        System.out.println("I'm using the " + vehicle.getClass().getSimpleName());
        vehicle.start();
    }

    static private int calculator(int a) {
        return a+a;
    }

    static private int calculator(int a, int b) {
        return a+b;
    }


    //Inheritance
    static abstract class Vehicle {
        private int tires;
        private boolean hasEngine;
        private String brand;
    
        public Vehicle(int tires, boolean hasEngine, String brand) {
            this.tires = tires;
            this.hasEngine = hasEngine;
            this.brand = brand;
        }
    
        public abstract void start();

        public String getBrand() {
            return this.brand;
        }
    
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
            super.moveForward();
            System.out.println(".....fast");
        }
    }


    static class Bicycle extends NonMotorizedVehicle {
        public Bicycle(String brand) {
            super(2, brand);
        }
    }


    /* Parametric Polymorphism */
    static class Box<T> {
        private T value;

        public Box(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }
}