package com.arquitecturajava.webspring.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.webspring.models.Persona;

class PersonaTest {

	@Test
	void mayorEdadtest() {
		//arrange preparar
		Persona p = new Persona("pepe", 20);
		boolean esMayor = p.esMayorEdada();
		assertTrue(esMayor);
	}

}
