public class vehicleApp {
    public static void main(String[] args) {
        // Mencoba Honda
        honda putih = new honda(40, "otomatis", true);
        System.out.println("honda putih :");
        putih.maju();
        putih.togglemodeRamahLingkungan();
        putih.maju();

        // Mencoba Toyota
        toyota merah = new toyota(80, "otomatis", true);
        System.out.println("\nToyota Merah:");
        merah.maju();
        merah.toggleempatWD();
        merah.maju();

        // Mencoba Suzuki
        suzuki kuning = new suzuki(60, "manual", true);
        System.out.println("\nSuzuki Kuning:");
        kuning.maju();
        kuning.togglemodeoffRoad();
        kuning.maju();
    }
}