import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {

        @Test
        public void newCamTest() {
            Camera nikonD3100 = new Camera();
            Lens firstLens = new Lens(15, 30);
            nikonD3100.setBrand("Nikon D3100");
            nikonD3100.setMegaPixels(12);
            nikonD3100.setDisplaySize(3);
            nikonD3100.setColored(true);
            nikonD3100.setLens(firstLens);
            assertEquals("Nikon D3100", nikonD3100.getBrand());
            assertEquals(12, nikonD3100.getMegaPixels());
            assertEquals(3, nikonD3100.getDisplaySize());
            assertTrue(nikonD3100.isColored());
            assertEquals(firstLens, nikonD3100.getLens());
        }

        @Test
        public void lensTest() {
            Lens firstLens = new Lens(15, 30);
            assertEquals(15, firstLens.minFocal);
            assertEquals(30, firstLens.maxFocal);
            Lens secondLens = new Lens(16, 17);
            assertEquals(16,secondLens.minFocal);
            assertEquals(17,secondLens.maxFocal);
        }

}
