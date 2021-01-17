package com.ujjwal.softuserassignment6.adapter

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ujjwal.softuserassignment6.R
import com.ujjwal.softuserassignment6.model.User


class UserAdapter(
    val students: MutableList<User>,
    val context : Context
): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    class UserViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val profileImg : ImageView
        val tvName : TextView
        val tvAge : TextView
        val tvAddress : TextView
        val tvGender : TextView
        val btnDelete : ImageView

        init {
            profileImg = view.findViewById(R.id.profileImg)
            tvName = view.findViewById(R.id.tvname)
            tvAddress = view.findViewById(R.id.tvaddress)
            tvAge = view.findViewById(R.id.tvage)
            tvGender = view.findViewById(R.id.tvgender)
            btnDelete = view.findViewById(R.id.delete)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.student_layout, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = students[position]

        holder.tvName.text = user.name
        holder.tvAge.text = user.age
        holder.tvAddress.text = user.address
        holder.tvGender.text = user.gender

        Glide.with(context)
            .load(user.image)
            .into(holder.profileImg)
        //delete
        holder.btnDelete.setOnClickListener {
            students.removeAt(position)
            notifyDataSetChanged()
        }

    }

    override fun getItemCount(): Int {
        return students.size
    }
}