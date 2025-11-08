package no.corell.norsktest.hevde

interface TestbarTjeneste<T> : HarNyFunksjon<T> {

    fun lagInstans(factory: () -> T): T {
        val tester  =  hentTester()
        if (tester.size == 0) {
            throw IllegalStateException("Tjeneste må ha tester")
        }
        return factory()
    }

    fun hentTester() : List<TjenesteTest>
}