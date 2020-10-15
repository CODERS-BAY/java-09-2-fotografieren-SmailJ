import java.util.ArrayList;
import java.util.List;

public class Camera {

    private String brand;
    private int megaPixels;
    private int displaySize;
    private boolean colored;
    private int counter;
    private int camCounter;
    private Lens lens;

    public Camera() {
        counter++;
        this.camCounter = counter;
    }

    public Camera(String brand, int megaPixels, int displaySize, boolean colored, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public boolean isColored() {
        return colored;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCamCounter() {
        return camCounter;
    }

    public void setCamCounter(int camCounter) {
        this.camCounter = camCounter;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "Brand='" + brand + '\'' +
                ", MegaPixels=" + megaPixels +
                ", Displaysize=" + displaySize +
                ", Colored=" + colored +
                ", Lens=" + lens +
                '}';
    }
}
