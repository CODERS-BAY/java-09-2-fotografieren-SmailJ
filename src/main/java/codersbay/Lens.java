package codersbay;

public class Lens {

    public int lens;
    public int minFocal;
    public int maxFocal;
    private static int counterLens;

    public Lens(int minFocal, int maxFocal) throws Exception {
        if (minFocal > maxFocal) {
            throw new Exception("Max Focal to low ! (Unter Min)");
        } else {
            this.minFocal = minFocal;
            this.maxFocal = maxFocal;
        }
        counterLens++;
        this.lens = counterLens;
    }

    @Override
    public String toString() {
        return "codersbay.Lens{" +
                "Min-Focal=" + minFocal +
                ", Max-Focal=" + maxFocal +
                '}';
    }
}
