package com.example.dependencyinjection

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface  usersaved  {
    fun usersaved(username:String,password:String)


class sqlsaved @Inject constructor()  :usersaved {
    override fun usersaved(username: String, password: String) {
        Log.d(TAG,"user  saved in sql")
    }
}

class firebasesaved @Inject constructor() :usersaved{
    override fun usersaved(username: String, password: String) {
        Log.d(TAG,"user saved in firebase")
    }
}}

