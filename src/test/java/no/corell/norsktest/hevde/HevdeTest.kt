package no.corell.norsktest.hevde

import no.corell.norsktest.hevde.Hevde.Companion.`forvent at`
import org.junit.jupiter.api.Test


class HevdeTest {

    @Test
    fun `2 pluss 2 er 4`() {
        var tall = 2 + 2
        `forvent at`(tall).`er lik`(4)
    }

    @Test
    fun `2 pluss 2 er ikke 5`() {
        var tall = 2 + 2
        `forvent at`(tall).`ikke er lik`(5)
    }

    @Test
    fun `Streng test`() {
        `forvent at`("Jeg").`er lik`("Jeg")
    }

    @Test
    fun `Streng test ikke`() {
        `forvent at`("Jeg").`ikke er lik`("Meg")
    }
}

