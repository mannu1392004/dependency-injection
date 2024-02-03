package com.example.dependencyinjection

import dagger.Component

@Component(modules = [userrepositorymodule::class,notificationmodule::class])

interface userregistrationcomponent {
    fun getuserregistrationservice():userregisterrepository

}
