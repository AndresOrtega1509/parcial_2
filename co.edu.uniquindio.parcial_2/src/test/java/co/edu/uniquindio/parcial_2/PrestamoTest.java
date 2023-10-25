package co.edu.uniquindio.parcial_2;

import co.edu.uniquindio.parcial_2.dto.PrestamoDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrestamoTest {

    PrestamoDto prestamo;
    @BeforeEach
    public void init() {
        prestamo = new PrestamoDto(100001, 50.000, 4,900.000,200.000);}

    @Test
    void testNumeroReferencia() {
        int esperado = 100001;
        int real = prestamo.numeroReferencia();
        assertEquals(esperado, real);
    }
    @Test
    void  testValorMaximoPrestamo(){
        Double esperado = 200.000;
        Double valorPrestamo = prestamo.valorPrestamo();
        assertFalse(esperado > valorPrestamo);
    }
    @Test
    void testRealizarPrestamo(){
        double valor = prestamo.saldoDisponible();
        assertTrue(valor != 0);
    }
    @Test
    void testAprobarPlazoEnMes(){
        int esperado = 6;
        int realNumMes = prestamo.plazoEnMes();
        assertTrue(realNumMes > esperado);

    }
}
