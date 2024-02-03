package com.example.dependencyinjection

import dagger.Module
import dagger.Provides
import org.jetbrains.annotations.NotNull

@Module
class userrepositorymodule {

    @Provides
    fun getfirebase(sqlsaved: usersaved.sqlsaved): usersaved {
        // Provide an actual instance of firebasesaved
        return sqlsaved
    }
}