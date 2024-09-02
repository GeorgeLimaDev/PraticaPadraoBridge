public class TV extends AbstractDevice {
    private boolean smartTv = false;

    public void smartTvOn() {
        smartTv = true;
        System.out.println("Smart TV features are now ON.");
    }

    public void smartTvOff() {
        smartTv = false;
        System.out.println("Smart TV features are now OFF.");
    }

    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println("| Smart TV is " + (smartTv ? "enabled" : "disabled"));
    }
}
