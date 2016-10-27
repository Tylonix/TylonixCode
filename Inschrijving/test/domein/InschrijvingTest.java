package domein;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InschrijvingTest
{

    private Inschrijving i1, i2, i3;

	@Before
	public void before()
	{
		i1 = new Inschrijving("Karine", 'w');
                i2 = new Inschrijving("Wim", 'p');
                i3 = new Inschrijving("Eddy", 'x');
	}

	@Test
	public void geefNaamBijCreatie()
	{
		Assert.assertEquals("Karine", i1.getNaam());
	}

	@Test
	public void geefCategorieBijCreatie()
	{
		Assert.assertEquals('w', i1.getCategorie());
	}

	@Test
	public void verbeterFouteCategorie()
	{
		Assert.assertEquals('g', i3.getCategorie());
	}

        @Test
	public void stelJuistAantalBroodjesIn()
	{
                i2.setAantalBroodjes(8);
		Assert.assertEquals(8, i2.getAantalBroodjes());
	}

        @Test
	public void stelFoutAantalBroodjesIn()
	{
                i1.setAantalBroodjes(8);
		Assert.assertEquals(2, i1.getAantalBroodjes());
	}

        @Test
	public void geefAantalPersonenCategorieWofG()
	{
		Assert.assertEquals(1, i1.geefAantalPersonen());
	}

        @Test
        public void geefAantalPersonenCategorieP()
        {
                Assert.assertEquals(2, i2.geefAantalPersonen());
        }
}