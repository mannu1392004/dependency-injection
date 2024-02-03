package com.example.dependencyinjection

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface  emaiservice {
    fun emailservice(from:String,message: String)

class sqlrepository @Inject constructor() :emaiservice{

    override fun emailservice(from: String,message: String){
        Log.d(TAG,"email by sql ")
    }
}
class firebase @Inject constructor() :emaiservice{
    override fun emailservice(from: String, message: String) {
  Log.d(TAG,"email by firebase")
    }
}}