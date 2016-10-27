package domein;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LidTest
{
    private Lid lid1, lid2, lid3;
    private int huidigJaar = GregorianCalendar.getInstance().get(Calendar.YEAR);

    @Before
    public void before()
    {
        lid1 = new Lid("Jan");
        lid2 = new Lid("Piet");
        lid3 = new Lid("Peter");
    }

    @Test
    public void lidNaamNaConstructie()
    {
        Assert.assertEquals("Jan", lid1.getNaam());
    }

    @Test
    public void defaultStartjaarNaContructie()
    {
        Assert.assertEquals(0, lid1.getStartjaar());
    }

    @Test
    public void defaultAantalFamilieledenNaConstructie()
    {
        Assert.assertEquals(0, lid1.getAantalFamilieleden());
    }

    @Test
    public void defaultCategorieNaConstructie()
    {
        Assert.assertEquals(0, lid1.getCategorie());
    }

    @Test
    public void lidNaamAanpassen()
    {
        lid2.setNaam("Els");
        Assert.assertEquals("Els", lid2.getNaam());

    }

    @Test
    public void lidSetStartjaar1900()
    {
        lid2.setStartjaar(1900);
        Assert.assertEquals(huidigJaar, lid2.getStartjaar());
    }

    public void lidSetStartjaar2000()
    {
        lid2.setStartjaar(2000);
        Assert.assertEquals(2000, lid2.getStartjaar());
    }

    @Test
    public void lidSetFouteCategorie()
    {
        lid2.setCategorie(8);
        Assert.assertEquals(1, lid2.getCategorie());
    }

    @Test
    public void lidSetJuisteCategorie()
    {
        lid2.setCategorie(2);
        Assert.assertEquals(2, lid2.getCategorie());
    }

    @Test
    public void lidSetFoutAantalFamilieleden()
    {
        lid2.setAantalFamilieleden(-3);
        Assert.assertEquals(0, lid2.getAantalFamilieleden());
    }

    @Test
    public void lidSetJuistAantalFamilieleden()
    {
        lid2.setAantalFamilieleden(2);
        Assert.assertEquals(2, lid2.getAantalFamilieleden());
    }

    @Test
    public void berekenLidgeld()
    {
        lid3.setAantalFamilieleden(3);
        lid3.setCategorie(2);
        lid3.setStartjaar(2010);
        Assert.assertEquals(15.84, lid3.berekenLidgeld(), 0.005);
    }
}
