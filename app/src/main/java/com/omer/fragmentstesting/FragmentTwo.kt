package com.omer.fragmentstesting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentTwo : Fragment() {

    private lateinit var button2 : Button
    private lateinit var text : TextView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_two,container,false)

        button2 =  root.findViewById(R.id.button2)
        text = root.findViewById(R.id.textViewOutput)


        button2.setOnClickListener {
            text.text = "Merhaba"
        }

        return root
    }
}