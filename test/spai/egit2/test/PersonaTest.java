package spai.egit2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import spai.egit2.Persona;

public class PersonaTest {
    private Persona persona;

    @Before
    public void initObjects() {
        this.persona = new Persona("Ana ", "Vega", "Santana");
    }

    @Test
    public void testGetNombre() {
        assertEquals("Ana", this.persona.getNombre());
    }

    @Test
    public void testSetNombre() {
        this.persona.setNombre(" ana ");
        assertEquals("Ana", this.persona.getNombre());
    }

    @Test
    public void testGetApellido() {
        assertEquals("Vega", this.persona.getApellido());
    }

    @Test
    public void testSetApellido() {
        this.persona.setApellido("  vega  ");
        assertEquals("Vega", this.persona.getApellido());
    }

    @Test
    public void testGetApellidoMaterno() {
        assertEquals("Santana", this.persona.getApellidoMaterno());
    }

    @Test
    public void testSetApellidoMaterno() {
        this.persona.setApellidoMaterno("  Santana ");
        assertEquals("Santana", this.persona.getApellidoMaterno());
    }
    @Test
    public void testInicial() {
        assertEquals("A.", this.persona.inicial());
    }

    @Test
    public void testNombreCompleto() {
        assertEquals("Ana Vega Santana", this.persona.nombreCompleto());
    }

}
