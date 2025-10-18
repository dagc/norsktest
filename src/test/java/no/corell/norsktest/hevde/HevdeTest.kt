package no.corell.norsktest.hevde

import junit.framework.TestCase
import org.junit.Test
import no.corell.norsktest.hevde.Hevde.Companion.forvent

class HevdeTest : TestCase() {

    @Test
    fun `2 pluss 2 er 4`() {
        var tall = 2 + 2
        forvent(tall).er(4)
    }
}

