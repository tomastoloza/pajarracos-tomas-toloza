import aves.AguiluchoColorado;
import aves.Albatros;
import aves.PalomaTorcaza;
import isla.Isla;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IslaTest {
    AguiluchoColorado aguiluchoColorado;
    Albatros albatros;
    PalomaTorcaza palomaTorcaza;
    Isla isla;

    @BeforeEach
    public void setUp() {
        aguiluchoColorado = new AguiluchoColorado();
        albatros = new Albatros();
        palomaTorcaza = new PalomaTorcaza();
        albatros.irAlGym();
        isla = new Isla();
        isla.agregarAve(aguiluchoColorado);
        isla.agregarAve(albatros);
        isla.agregarAve(palomaTorcaza);
        assertEquals(580, aguiluchoColorado.getFuerza());
        assertEquals(1100, albatros.getFuerza());
        assertEquals(700, palomaTorcaza.getFuerza());
        assertEquals(4500, albatros.getPeso());
        assertEquals(2380, isla.getFuerzaTotal());
        assertTrue(isla.getAvesDebiles().contains(aguiluchoColorado));
        assertTrue(isla.getAvesDebiles().contains(palomaTorcaza));
    }

    @Test
    public void testTerremoto() {
        isla.terremoto();
        assertEquals(40, aguiluchoColorado.getVelocidad());
        assertEquals(5300, albatros.getPeso());
        assertEquals(500, palomaTorcaza.getIra());

        assertEquals(580, aguiluchoColorado.getFuerza());
        assertEquals(1100, albatros.getFuerza());
        assertEquals(1400, palomaTorcaza.getFuerza());
        assertTrue(isla.getAvesDebiles().contains(aguiluchoColorado));
        assertFalse(isla.getAvesDebiles().contains(palomaTorcaza));
        assertEquals(1, isla.getAvesDebiles().size());
    }

    @Test
    public void testTormenta() {
        isla.terremoto();
        isla.tormenta();
        assertEquals(80, aguiluchoColorado.getVelocidad());
        assertEquals(640, aguiluchoColorado.getFuerza());
        assertEquals(5300, albatros.getPeso());
        assertEquals(500, palomaTorcaza.getIra());
    }
}