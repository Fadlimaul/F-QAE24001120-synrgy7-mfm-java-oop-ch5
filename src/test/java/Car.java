public class Car extends vehicle {
    private double kapasitasTengki;
    private String tipeTransmisi;

    public Car(double kapasitasTengki, String tipeTransmisi) {
        super(4);
        this.kapasitasTengki = kapasitasTengki;
        this.tipeTransmisi = tipeTransmisi;
    }

    public double getKapasitasTengki() {
        return kapasitasTengki;
    }

    public void setKapasitasTengki(double kapasitasTengki) {
        this.kapasitasTengki = kapasitasTengki;
    }

    public String getTipeTransmisi() {
        return tipeTransmisi;
    }

    public void setTipeTransmisi(String tipeTransmisi) {
        this.tipeTransmisi = tipeTransmisi;
    }

    public void ubahTransmisi(String newtipeTransmisi) {
        this.tipeTransmisi = newtipeTransmisi;
        System.out.println("Transmisi diubah ke " + newtipeTransmisi);
    }
}
