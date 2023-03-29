public class PersonalComputer extends Product{

    private Motherboard motherboard;
    private ComputerCase compterCase;
    private Monitor monitor;

    public PersonalComputer(String model, String manufacturer, Motherboard motherboard, ComputerCase compterCase, Monitor monitor) {
        super(model, manufacturer);
        this.motherboard = motherboard;
        this.compterCase = compterCase;
        this.monitor = monitor;
    }

    private void drawLogo() {
        monitor.drawPixel(1200, 50, "yellow");
    }

    public void powerUp() {
        compterCase.pressPowerButton();
        drawLogo();
    }
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public ComputerCase getCompterCase() {
//        return compterCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
}
