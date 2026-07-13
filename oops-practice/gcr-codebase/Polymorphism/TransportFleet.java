class Vehicle {
    public double fuelCost(double km) {
        return 0;
    }
}

class Car extends Vehicle {
    @Override
    public double fuelCost(double km) {
        return km * 0.12;
    }
}

class Bus extends Vehicle {
    @Override
    public double fuelCost(double km) {
        return km * 0.25;
    }
}

class Bike extends Vehicle {
    @Override
    public double fuelCost(double km) {
        return km * 0.06;
    }
}

class ElectricCar extends Vehicle {
    @Override
    public double fuelCost(double km) {
        return km * 0.03;
    }
}

public class TransportFleet {
    public static void main(String[] args) {
        Vehicle[] fleet = {new Car(), new Bus(), new Bike(), new ElectricCar()};

        for (Vehicle vehicle : fleet) {
            if (vehicle instanceof Car) {
                System.out.println("Car fuel cost: " + vehicle.fuelCost(100));
            } else if (vehicle instanceof Bus) {
                System.out.println("Bus fuel cost: " + vehicle.fuelCost(100));
            } else if (vehicle instanceof Bike) {
                System.out.println("Bike fuel cost: " + vehicle.fuelCost(100));
            } else if (vehicle instanceof ElectricCar) {
                System.out.println("ElectricCar fuel cost: " + vehicle.fuelCost(100));
            }
        }
    }
}
