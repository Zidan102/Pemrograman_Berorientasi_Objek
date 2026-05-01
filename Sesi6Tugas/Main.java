import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Toshiba(); 
        LaptopUser andri = new LaptopUser(myLaptop);
        Scanner input = new Scanner(System.in);
        String action;
        boolean loop = true;

        System.out.println("=== APLIKASI INTERFACE LAPTOP ===");
        
        while (loop) {
            System.out.println("\n[ON] Nyalakan | [OFF] Matikan | [UP] Vol Up | [DOWN] Vol Down | [EXIT] Keluar");
            System.out.print("Pilih aksi: ");
            action = input.nextLine().toUpperCase();

            switch (action) {
                case "ON":
                    andri.turnOnLaptop();
                    break;
                case "OFF":
                    andri.turnOffLaptop();
                    break;
                case "UP":
                    andri.makeLaptopLouder();
                    break;
                case "DOWN":
                    andri.makeLaptopSilence();
                    break;
                case "EXIT":
                    loop = false;
                    break;
                default:
                    System.out.println("Aksi tidak dikenal!");
            }
        }
        
        System.out.println("Program selesai.");
        input.close();
    }
}