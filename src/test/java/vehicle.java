public class vehicle {
    private int roda;

    public vehicle(int roda) {
        this.roda = roda;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public void maju() {
        System.out.println("Kendaraan bergerak maju");
    }

    public void belok(String kanan) {
        System.out.println("Kendaraan belok " + kanan);
    }
}

