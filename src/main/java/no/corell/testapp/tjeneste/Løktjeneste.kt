package no.corell.testapp.tjeneste

import no.corell.norsktest.hevde.TestbarTjeneste
import no.corell.norsktest.hevde.TjenesteTest

class Løktjeneste : TestbarTjeneste<Løktjeneste>
{


    companion object {
        fun ny(): Løktjeneste {
            val tjeneste = Løktjeneste()
            return tjeneste.lagInstans { Løktjeneste() }
        }
    }

    override fun hentTester(): List<TjenesteTest> {
        return emptyList()
    }

    override fun ny(): Løktjeneste {
        return ny()
    }

}