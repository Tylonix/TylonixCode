package domein;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RekenmachineTest {

    private Rekenmachine machine;

    @Before
    public void before() {
        machine = new Rekenmachine();
    }

    @Test
    public void maakRekenmachineResultaatOp0() {
        Assert.assertEquals(0.0, machine.getResultaat(),0.01);
    }

    @Test
    public void setResultaat() {
        machine.setResultaat(1.8);
        Assert.assertEquals(1.8, machine.getResultaat(),0.01);
    }

    @Test
    public void telOp() {
        machine.setResultaat(1.8);
        machine.telOp(2.1);
        Assert.assertEquals(1.8 + 2.1, machine.getResultaat(),0.01);
    }

    @Test
    public void trekAf() {
        machine.setResultaat(1.8);
        machine.trekAf(2.2);
        Assert.assertEquals(1.8 - 2.2, machine.getResultaat(),0.01);
    }

    @Test
    public void vemenigvuldig() {
        machine.setResultaat(1.8);
        machine.vermenigvuldig(2.3);
        Assert.assertEquals(1.8 * 2.3, machine.getResultaat(),0.01);
    }

    @Test
    public void deelDoor() {
        machine.setResultaat(1.8);
        machine.deelDoor(2.4);
        Assert.assertEquals(1.8 / 2.4, machine.getResultaat(),0.01);
    }

    @Test
    public void clear() {
        machine.clear();
        Assert.assertEquals(0.0, machine.getResultaat(),0.01);
    }
}
