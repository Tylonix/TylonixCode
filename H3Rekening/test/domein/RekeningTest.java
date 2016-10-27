package domein;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RekeningTest {

    private Rekening rek;

    @Before
    public void before() {
    }

    @Test
    public void maakRekeningZonderGegevensBijConstructie() {
        rek = new Rekening();
        Assert.assertNull(rek.getHouder());
        Assert.assertEquals(0L, rek.getRekeningnummer());
        Assert.assertEquals(0.0, rek.getSaldo(), 0.01);
    }

    @Test
    public void maakRekeningMetEnkelRekeningnummer() {
        rek = new Rekening(4545678912345L);
        Assert.assertEquals(4545678912345L, rek.getRekeningnummer());
        Assert.assertEquals(0.0, rek.getSaldo(), 0.01);
        Assert.assertNull(rek.getHouder());
    }

    @Test
    public void rekeningMetRekeningnummerEnSaldo() {
        rek = new Rekening(1231234567812L, 125);
        Assert.assertEquals(1231234567812L, rek.getRekeningnummer());
        Assert.assertEquals(125.0, rek.getSaldo(), 0.01);
        Assert.assertNull(rek.getHouder());
    }

    @Test
    public void rekeningMetRekeningnummerSaldoEnHouder() {
        rek = new Rekening(2323456789123L,150,"Sofie");
        Assert.assertEquals(2323456789123L, rek.getRekeningnummer());
        Assert.assertEquals(150.0, rek.getSaldo(),0.01);
        Assert.assertEquals("Sofie", rek.getHouder());
    }

    @Test
    public void wijzigRekeningSaldo() {
        rek = new Rekening();
        rek.setSaldo(150);
        Assert.assertEquals(150.0, rek.getSaldo(),0.01);
    }

    @Test
    public void wijzigRekeningHouder() {
        rek = new Rekening();
        rek.setHouder("An");
        Assert.assertEquals("An", rek.getHouder());
    }

    @Test
    public void wijzigRekeningRekeningnummer() {
        rek = new Rekening();
        rek.setRekeningnummer(999888888877L);
        Assert.assertEquals(999888888877L, rek.getRekeningnummer());
    }
}
