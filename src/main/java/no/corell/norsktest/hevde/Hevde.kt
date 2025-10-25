package no.corell.norsktest.hevde

class Hevde {


    companion object {
        fun forvent(inn: Int) : Forventet{
            return Forventet(inn)
        }

        fun forvent(inn: String) : Forventet{
            return Forventet(inn)
        }

        fun forvent(inn: Testbar) : Forventet{
            inn.valider()
            return Forventet(inn)
        }
    }



}