package de.syntaxinstitut.liveapprecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import de.syntaxinstitut.liveapprecyclerview.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainRV = findViewById<RecyclerView>(R.id.mainRV)

        val profilListe = Datasource().loadData()


        //Sortiere Liste bevor sie in den Adapter gegeben
        Log.d("Sortierung", "Vorher: $profilListe")
//        val sortedList = profilListe.sortedByDescending {
//            getString(it.nameId)
//        }

//        val filteredList = profilListe.filter {
//            it.child
//        }


        Log.d("Sortierung", "Nachher: $profilListe")

        val adapter = ProfilAdapter(profilListe)
        mainRV.adapter = adapter




    }
}