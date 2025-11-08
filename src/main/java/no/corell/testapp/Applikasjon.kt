package no.corell.testapp

import no.corell.testapp.tjeneste.Løktjeneste

class Applikasjon {


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Applikasjon starter")

            val løktjeneste = Løktjeneste.ny()
        }
    }

}