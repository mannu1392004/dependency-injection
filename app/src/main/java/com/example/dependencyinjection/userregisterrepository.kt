package com.example.dependencyinjection

import javax.inject.Inject

class userregisterrepository @Inject constructor
    (private val emaiservice: emaiservice,
     private val usersaved: usersaved) {

    fun userregistor(Username:String,password:String){
        emaiservice.emailservice("mannu","registerd")
        usersaved.usersaved(Username,password)
    }
}