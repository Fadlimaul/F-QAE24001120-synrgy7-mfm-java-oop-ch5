public class suzuki extends Car {
    private boolean modeoffRoad;

    public suzuki(double kapasitasTengki, String tipeTransmisi, boolean modeoffRoad) {
        super(kapasitasTengki, tipeTransmisi);
        this.modeoffRoad = modeoffRoad;
    }

    public boolean isModeoffRoad() {
        return modeoffRoad;
    }

    public void setModeoffRoad(boolean modeoffRoad) {
        this.modeoffRoad = modeoffRoad;
    }

    @Override
    public void maju() {
        if (modeoffRoad) {
            System.out.println("Suzuki bergerak maju dengan mode off road");
        } else {
            System.out.println("Suzuki bergerak maju");
        }
    }

    public void togglemodeoffRoad() {
        modeoffRoad = !modeoffRoad;
        System.out.println("Sekarang mode Off Road " + (modeoffRoad ? "ON" : "OFF"));
    }
}