package no.corell.norsktest.hevde

import no.corell.norsktest.hevde.Hevde.Companion.forvent
import no.corell.testapp.domene.Farge
import no.corell.testapp.domene.Løk
import org.junit.jupiter.api.Test

class TestbarTest {

    @Test
    fun `Hvitløk test`() {
        var løk1 = Løk(0.05, Farge.HVIT)

        var løk2 = Løk(0.05, Farge.HVIT)

        forvent(løk1).er(løk2)
    }

    @Test
    fun `En hvitløk er ikke ok`() {
        var løk1 = Løk(0.05, Farge.HVIT)

        var løk2 = Løk(0.2, Farge.HVIT)

        try {
            forvent(løk1).`er ikke lik`(løk2)
        } catch(e: AssertionError) {
            //forventer dette, skal ikke brukes i vanlig tester

        }

    }

}