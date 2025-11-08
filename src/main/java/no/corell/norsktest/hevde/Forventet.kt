package no.corell.norsktest.hevde




data class Forventet(var forventetdata: Any) {


    fun `er lik`(i: Int) {
        if(forventetdata as Int == i) {
            println("Test OK")
        } else {
            println("$forventetdata er ikke $i")
            assert(false, { "$forventetdata er ikke $i" })
        }
    }

    fun `er lik`(s: String) {
        if(forventetdata as String == s) {
            println("Test OK")
        } else {
            println("$forventetdata er ikke $s")
            assert(false, { "$forventetdata er ikke $s" })
        }
    }

    fun `ikke er lik`(i: Int) {
        if(forventetdata as Int != i) {
            println("Test OK")
        } else {
            println("$forventetdata er ikke $i")
            assert(false, { "$forventetdata er  $i" })
        }
    }

    fun  `ikke er lik`(s: String) {
        if(forventetdata as String != s) {
            println("Test OK")
        } else {
            println("$forventetdata er ikke $s")
            assert(false, { "$forventetdata er $s" })
        }
    }


    fun `er lik`(testbar: Testbar) {
        testbar.valider()
        if(forventetdata as Testbar == testbar) {
            println("Test OK")
        } else {
            println("$forventetdata er ikke lik $testbar")
            assert(false, { "$forventetdata er ikke lik $testbar" })
        }
    }

    fun `ikke er lik`(testbar: Testbar) {
        testbar.valider()
        if(forventetdata as Testbar != testbar) {
            println("Test OK")
        } else {
            println("$forventetdata er lik $testbar")
            assert(false, { "$forventetdata er lik $testbar" })
        }
    }


}