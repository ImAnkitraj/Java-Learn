public class Main {
    public static void main(String[] args) {
        System.out.println("Main");
        SmartKitchen sk = new SmartKitchen();

        sk.setKitchenState(true, true, true);
//        sk.getBrewMaster().setHasWorkTodo(true);
//        sk.getIceBox().setHasWorkTodo(true);
//        sk.getDishMaker().setHasWorkTodo(true);

        sk.doKitchenWork();
//        sk.getBrewMaster().brewCoffee();
//        sk.getDishMaker().toDishes();
//        sk.getIceBox().orderFood();
    }
}
