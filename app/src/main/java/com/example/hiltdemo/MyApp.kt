package com.example.hiltdemo

import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject
import javax.inject.Singleton

@ActivityScoped
class MyApp @Inject constructor() {

    fun displayAppName() : String {
        return "Hilt Demo"
    }

}