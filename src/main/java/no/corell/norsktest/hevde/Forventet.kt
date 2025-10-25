package no.corell.norsktest.hevde




data class Forventet(var forventetdata: Any) {


    fun er(i: Int) {
        if(forventetdata as Int == i) {
            println("Test OK")
        } else {
            println("$forventetdata er ikke $i")
            assert(false, { "$forventetdata er ikke $i" })
        }
    }

    fun er(s: String) {
        if(forventetdata as String == s) {
            println("Test OK")
        } else {
            println("$forventetdata er ikke $s")
            assert(false, { "$forventetdata er ikke $s" })
        }
    }

    fun `er ikke`(i: Int) {
        if(forventetdata as Int != i) {
            println("Test OK")
        } else {
            println("$forventetdata er ikke $i")
            assert(false, { "$forventetdata er  $i" })
        }
    }

    fun  `er ikke`(s: String) {
        if(forventetdata as String != s) {
            println("Test OK")
        } else {
            println("$forventetdata er ikke $s")
            assert(false, { "$forventetdata er $s" })
        }
    }


    fun er(testbar: Testbar) {
        testbar.valider()
        if(forventetdata as Testbar == testbar) {
            println("Test OK")
        } else {
            println("$forventetdata er ikke lik $testbar")
            assert(false, { "$forventetdata er ikke lik $testbar" })
        }
    }

    fun `er ikke lik`(testbar: Testbar) {
        testbar.valider()
        if(forventetdata as Testbar != testbar) {
            println("Test OK")
        } else {
            println("$forventetdata er lik $testbar")
            assert(false, { "$forventetdata er lik $testbar" })
        }
    }


}