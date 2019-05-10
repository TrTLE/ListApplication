package io.listeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val nameArray by lazy { resources.getStringArray(R.array.nameArray)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //#########################################
        //CRÉATION DU LISTE ADPATER
        //          ET ASSOCIATION AVEC LES DONNÉES À AFFICHER
        //#########################################


        myList.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nameArray)


    }
}
