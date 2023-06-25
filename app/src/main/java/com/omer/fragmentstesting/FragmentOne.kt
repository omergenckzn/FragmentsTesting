package com.omer.fragmentstesting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.omer.fragmentstesting.databinding.FragmentOneBinding

class FragmentOne : Fragment() {

    private lateinit var clickButton: Button



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_one,container,false)

        clickButton =  rootView.findViewById(R.id.clickButton)

        clickButton.setOnClickListener {
            Toast.makeText(rootView.context,"Hello",Toast.LENGTH_SHORT).show()
        }

        return rootView

    }
}