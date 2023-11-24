package de.syntaxinstitut.liveapprecyclerview.data

import de.syntaxinstitut.liveapprecyclerview.R

class Datasource {

    fun loadData() : List<Profil> {
        return listOf(
            Profil(R.string.name1,R.drawable.baseline_person_24,"", true),
            Profil(R.string.name2,R.drawable.baseline_person_4_24,"", false),
            Profil(R.string.name1,R.drawable.baseline_person_24,"", true),
            Profil(R.string.name1,R.drawable.baseline_person_24,"", true),
            Profil(R.string.name2,R.drawable.baseline_person_4_24,"", false),
            Profil(R.string.name1,R.drawable.baseline_person_24,"", true),
        )
    }


}