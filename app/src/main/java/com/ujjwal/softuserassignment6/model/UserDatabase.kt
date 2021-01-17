package com.ujjwal.softuserassignment6.model

import com.ujjwal.softuserassignment6.model.User

var students = mutableListOf<User>(User("https://snapfishdeutschlandblog.files.wordpress.com/2014/07/04-donnerstag-raubkatze.jpg","Ujjwal khatri","20","Male","Kathmandu"))

class UserDatabase() {
    private val user1 = User("https://snapfishdeutschlandblog.files.wordpress.com/2014/07/04-donnerstag-raubkatze.jpg","Ujjwal khatri","20","Male","Kathmandu")



    fun getStudent():MutableList<User>
    {
        return students
    }
}
