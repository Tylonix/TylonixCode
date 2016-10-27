package domein;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TombolaTest
{
    private Tombola t1, t2;

    @Before
    public void before()
    {
        t1 = new Tombola("Scouts Gent", -1, 0);
        t2 = new Tombola("Chiro Gent", 200, 1.5);
    }

    @Test
    public void verenigingnaamNaConstructie()
    {
        Assert.assertEquals("Scouts Gent", t1.getVerenigingnaam());
    }

    @Test
    public void defaultAantalLotjesNaContructie()
    {
        Assert.assertEquals(0, t1.getAantalLotjes());
    }

    @Test
    public void defaultPrijsPerLotNaConstructie()
    {
        Assert.assertEquals(1.0, t1.getPrijsPerLot(),0.01);
    }

    @Test
    public void verenigingnaamAanpassen()
    {
        t1.setVerenigingnaam("KLJ Gent");
        Assert.assertEquals("KLJ Gent", t1.getVerenigingnaam());

    }

    @Test
    public void aantalLotjesAanpassen()
    {
        t1.setAantalLotjes(500);
        Assert.assertEquals(500, t1.getAantalLotjes());
    }

    public void prijsPerLotAanpassen()
    {
        t1.setPrijsPerLot(1);
        Assert.assertEquals(1.0, t1.getPrijsPerLot(),0.01);
    }

    @Test
    public void berekenPrijsVanaf5Lotjes()
    {
        Assert.assertEquals(1.35 ,t2.geefPrijsVanaf5Lotjes(),0.01);
    }

    @Test
    public void berekenPrijsVanaf10Lotjes()
    {
        Assert.assertEquals(1.125 ,t2.geefPrijsVanaf10Lotjes(),0.01);
    }
}
