package codersbay;

public class Main {

    public static void main(String[] args) throws Exception {

        Lens firstLens = new Lens(13, 30);
        Lens secondLens = new Lens(35, 50);
        Lens thirdLens = new Lens(50, 117);

        Camera nikonD3100 = new Camera();
        nikonD3100.setBrand("Nikon D3100");
        nikonD3100.setMegaPixels(12);
        nikonD3100.setDisplaySize(3);
        nikonD3100.setColored(true);
        nikonD3100.setLens(firstLens);
        System.out.println(nikonD3100);

        Camera nikonD5100 = new Camera();
        nikonD5100.setBrand("Nikon D5100");
        nikonD5100.setMegaPixels(24);
        nikonD5100.setDisplaySize(4);
        nikonD5100.setColored(true);
        nikonD5100.setLens(thirdLens);
        System.out.println(nikonD5100);

        Camera sonyAlpha1 = new Camera();
        sonyAlpha1.setBrand("Sony Alpha v1");
        sonyAlpha1.setMegaPixels(28);
        sonyAlpha1.setDisplaySize(3);
        sonyAlpha1.setColored(false);
        sonyAlpha1.setLens(secondLens);
        System.out.println(sonyAlpha1);

        Camera sonyAlpha2 = new Camera();
        sonyAlpha2.setBrand("Sony Alpha v2");
        sonyAlpha2.setMegaPixels(40);
        sonyAlpha2.setDisplaySize(4);
        sonyAlpha2.setColored(true);
        sonyAlpha2.setLens(thirdLens);
        System.out.println(sonyAlpha2);

        sonyAlpha2.setBrand("Sony Alpha v2 b/w");
        sonyAlpha2.setMegaPixels(40);
        sonyAlpha2.setDisplaySize(4);
        sonyAlpha2.setColored(false);
        sonyAlpha2.setLens(secondLens);
        System.out.println(sonyAlpha2);
    }

}
