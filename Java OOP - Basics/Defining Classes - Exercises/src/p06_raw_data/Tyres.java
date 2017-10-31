package p06_raw_data;

class Tyres {
    private double[] tyrePressure;

    Tyres(double[] pressure) {
        this.tyrePressure = new double[4];


        for (int i = 0; i < 4; i++) {
            tyrePressure[i] = pressure[i];
        }
    }

    public double[] getTyrePressure() {
        return tyrePressure;
    }
}
