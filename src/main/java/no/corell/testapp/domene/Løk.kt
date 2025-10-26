package no.corell.testapp.domene

import no.corell.norsktest.hevde.Testbar

data class Løk(var kg: Double, var farge: Farge) : Testbar {
    override fun valider() {
        if (farge == Farge.HVIT && kg > 0.1) {
            forTung()
        }
        if (farge == Farge.RØD && kg > 0.5) {
            forTung()
        }
        if (farge == Farge.GUL && kg > 0.7) {
            forTung()
        }
    }

    fun forTung() {
        var s = "Løk av typen $farge er for tung."
        println(s)
        assert(false)
    }


}