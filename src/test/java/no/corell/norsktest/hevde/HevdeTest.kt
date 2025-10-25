package no.corell.norsktest.hevde

import no.corell.norsktest.hevde.Hevde.Companion.forvent
import org.junit.jupiter.api.Test


class HevdeTest  {

    @Test
    fun `2 pluss 2 er 4`() {
        var tall = 2 + 2
        forvent(tall).er(4)
    }
}

