public class honda extends Car {
    private boolean modeRamahLingkungan;

    public honda(double kapasitasTengki, String tipeTransmisi, boolean modeRamahLingkungan) {
        super(kapasitasTengki, tipeTransmisi);
        this.modeRamahLingkungan = modeRamahLingkungan;
    }

    public boolean isModeRamahLingkungan() {
        return modeRamahLingkungan;
    }

    public void setModeRamahLingkungan(boolean modeRamahLingkungan) {
        this.modeRamahLingkungan = modeRamahLingkungan;
    }

    @Override
    public void maju() {
        if (modeRamahLingkungan) {
            System.out.println("Honda Berjalan dengan mode ramah lingkungan");
        } else {
            System.out.println("Honda berjalan maju");
        }
    }

    public void togglemodeRamahLingkungan() {
        modeRamahLingkungan = !modeRamahLingkungan;
        System.out.println("Sekarang mode ramah lingkungan " + (modeRamahLingkungan ? "ON" : "OFF"));
    }
}
