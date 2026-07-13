class RestaurantPerson {
    private String name;
    private int id;

    public RestaurantPerson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends RestaurantPerson implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef prepares meals");
    }
}

class Waiter extends RestaurantPerson implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter serves customers");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Rohan", 1);
        Worker waiter = new Waiter("Meera", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}
