package com.ujjwal.softuserassignment6.dashboard


import android.location.Address
import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.ujjwal.softuserassignment6.R

import com.ujjwal.softuserassignment6.model.User
import com.ujjwal.softuserassignment6.model.students


class DashboardFragment : Fragment(){

    private lateinit var dashboardViewModel: DashboardViewModel
    private lateinit var Image : EditText
    private lateinit var Name: EditText
    private lateinit var Age: EditText
    private lateinit var Address: EditText
    private lateinit var Gender: RadioGroup
    private lateinit var Addstudnet: Button
    var gender = "Male"


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        Name = root.findViewById(R.id.etfullname)
        Age = root.findViewById(R.id.etage)
        Address = root.findViewById(R.id.etAddress)
        Gender = root.findViewById(R.id.rgGender)
        Addstudnet = root.findViewById(R.id.btnAdd)
        Image = root.findViewById(R.id.etImgAddress)
        radioGroupListener()
        Addstudnet.setOnClickListener {



            data()

        }
        return root
    }

    private fun radioGroupListener() {
        Gender.setOnCheckedChangeListener {group, checkId ->
            when (checkId) {
                R.id.rbMale -> {
                    gender = "Male"
                }
                R.id.rbFemale -> {
                    gender = "Female"
                }
                R.id.rbOther ->
                    gender = "Others"
            }
        }
    }

    private fun data() {
        val image = Image.text.toString()
        val name = Name.text.toString()
        val age = Age.text.toString()
        val address = Address.text.toString()
        students.add(User(image, name, age, gender, address))
        Image.text.clear()
        Name.text.clear()
        Age.text.clear()
        Address.text.clear()
        Toast.makeText(activity, "Student Added successfully", Toast.LENGTH_SHORT).show()
    }


}