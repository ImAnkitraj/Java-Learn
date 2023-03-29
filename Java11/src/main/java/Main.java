public class Main {
    public static void main(String[] args) {
         ComputerCase theCase = new ComputerCase("2022", "Dell", "240");
         Monitor theMonitor = new Monitor( "27-inch Beast", "Acer", "2540 x 1440", 27);
         Motherboard  theMotherboard = new Motherboard("8J-290", "Asus", 4, 6, "v2.44");
         PersonalComputer thePC = new PersonalComputer("2022", "Dell", theMotherboard, theCase, theMonitor);
//         thePC.getMonitor().drawPixel(2,3,"red");
//         thePC.getMotherboard().loadProgram("Windows Os");
//         thePC.getCompterCase().pressPowerButton();
         thePC.powerUp();

    }
}
