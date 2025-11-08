package no.corell.norsktest.hevde

import no.corell.norsktest.hevde.Hevde.Companion.`forvent at`
import no.corell.testapp.domene.Farge
import no.corell.testapp.domene.Løk
import org.junit.jupiter.api.Test

class TestbarTest {

    @Test
    fun `Hvitløk test`() {
        var løk1 = Løk(0.05, Farge.HVIT)

        var løk2 = Løk(0.05, Farge.HVIT)

        `forvent at`(løk1).`er lik`(løk2)
    }

    @Test
    fun `En hvitløk er ikke ok`() {
        var løk1 = Løk(0.05, Farge.HVIT)

        var løk2 = Løk(0.2, Farge.HVIT)

        try {
            `forvent at`(løk1).`ikke er lik`(løk2)
        } catch(e: AssertionError) {
            //forventer dette, skal ikke brukes i vanlig tester

        }

    }

}