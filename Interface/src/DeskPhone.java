public class DeskPhone implements ITelephone{
     private int myNumber;
     private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No need of power button in desk phone");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Dialing " + phoneNumber);
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the call");
            isRinging = false;
        }
        else {
            isRinging = true;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring...");
        }
        else {
            isRinging = true;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
