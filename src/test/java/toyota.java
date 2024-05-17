public class toyota extends Car {
    private boolean empatWD;

    public toyota(double kapasitasTengki, String tipeTransmisi, boolean empatWD) {
        super(kapasitasTengki, tipeTransmisi);
        this.empatWD = empatWD;
    }

    public boolean isEmpatWD() {
        return empatWD;
    }

    public void setEmpatWD(boolean empatWD) {
        this.empatWD = empatWD;
    }

    @Override
    public void maju() {
        if (empatWD) {
            System.out.println("Toyota Begerak maju dengan penggerak roda 4");
        } else {
            System.out.println("Toyota Bergerak maju");
        }
    }

    public void toggleempatWD() {
        empatWD = !empatWD;
        System.out.println("Sekarang penggerak roda 4 " + (empatWD ? "aktifkan" : "nonaktifkan"));
    }
}