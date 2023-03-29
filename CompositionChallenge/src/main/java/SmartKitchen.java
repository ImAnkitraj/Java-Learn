public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox ;
    private DishWasher dishMaker;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.iceBox = new Refrigerator();
        this.dishMaker = new DishWasher();
    }
    public SmartKitchen(CoffeeMaker brewMaster, Refrigerator iceBox, DishWasher dishMaker) {
        this.brewMaster = brewMaster;
        this.iceBox = iceBox;
        this.dishMaker = dishMaker;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishMaker() {
        return dishMaker;
    }

    public void setKitchenState(boolean dish, boolean coffee, boolean ice) {
        brewMaster.setHasWorkTodo(coffee);
        dishMaker.setHasWorkTodo(dish);
        iceBox.setHasWorkTodo(ice);
    }

    public void doKitchenWork() {
        dishMaker.toDishes();
        iceBox.orderFood();
        brewMaster.brewCoffee();
    }
}

class CoffeeMaker {
    private boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void brewCoffee() {
        if(hasWorkTodo) {
            System.out.println("Brewing Coffee...");
            this.hasWorkTodo = false;
        }
    }
}

class Refrigerator {
    private boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void orderFood() {
        if (hasWorkTodo) {
            System.out.println("Ordering Food...");
            this.hasWorkTodo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void toDishes() {
        if (hasWorkTodo) {
            System.out.println("washing dishes..");
            this.hasWorkTodo = false;
        }
    }
}
