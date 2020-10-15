public class Lens {

    public int lens;
    public int minFocal;
    public int maxFocal;
    private int counterLens;

    public Lens(int minFocal, int maxFocal) {
        if (minFocal > maxFocal) {
            System.out.println("The minimal focal length is bigger than the maximum!");
        } else {
            this.minFocal = minFocal;
            this.maxFocal = maxFocal;
        }
        counterLens++;
        this.lens = counterLens;
    }

    @Override
    public String toString() {
        return "Lens{" +
                "Min-Focal=" + minFocal +
                ", Max-Focal=" + maxFocal +
                '}';
    }
}
