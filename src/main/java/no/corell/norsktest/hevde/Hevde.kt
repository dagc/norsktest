package no.corell.norsktest.hevde

class Hevde {


    companion object {
        fun `forvent at`(inn: Int) : Forventet{
            return Forventet(inn)
        }

        fun `forvent at`(inn: String) : Forventet{
            return Forventet(inn)
        }

        fun `forvent at`(inn: Testbar) : Forventet{
            inn.valider()
            return Forventet(inn)
        }
    }



}