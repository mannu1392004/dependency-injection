package com.example.dependencyinjection

import dagger.Module
import dagger.Provides

@Module
class notificationmodule {

    @Provides
fun notification(firebase: emaiservice.firebase):emaiservice{
    return firebase
}


}