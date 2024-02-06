package dev.rominaruiz.imc_proyect;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testCalculateImc() {
        Person person = new Person(70, 1.75);

        double expectedImc = 70 / (1.75 * 1.75);

        double personImc = person.calculateImc();

        assertEquals(expectedImc, personImc);
    }
}
