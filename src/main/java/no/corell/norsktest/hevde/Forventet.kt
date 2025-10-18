package no.corell.norsktest.hevde



data class Forventet(var inndata: Any) {
    fun er(i: Int) {
        if(inndata as Int == i) {
            System.out.println("Test OK")
        } else {
            System.out.println("Test Feil")
        }
    }


}