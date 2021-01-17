package com.ujjwal.softuserassignment6.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ujjwal.softuserassignment6.R
import com.ujjwal.softuserassignment6.adapter.UserAdapter
import com.ujjwal.softuserassignment6.model.students


class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = root.findViewById(R.id.recyclerView)
        val adapter = UserAdapter(students,container!!.context)
        recyclerView.layoutManager = LinearLayoutManager(container.context)
        recyclerView.adapter = adapter
        return root
    }


}