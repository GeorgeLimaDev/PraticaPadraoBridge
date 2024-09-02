public class Radio extends AbstractDevice {
    private String modulation = "FM";

    public String getModulation() {
        return modulation;
    }

    public void setModulation(String modulation) {
        this.modulation = modulation;
    }

    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println("| Modulation is " + modulation);
    }
}
