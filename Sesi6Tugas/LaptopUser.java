public class LaptopUser {
    
    private Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }

    void turnOnLaptop() {
        laptop.powerOn();
    }

    void turnOffLaptop() {
        laptop.powerOff();
    }

    void makeLaptopLouder() {
        laptop.volumeUp();
    }

    void makeLaptopSilence() {
        laptop.volumeDown();
    }
}