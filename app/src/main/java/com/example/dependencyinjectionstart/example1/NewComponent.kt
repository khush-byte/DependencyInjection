package com.example.dependencyinjectionstart.example1

import dagger.Component

//used module for constructors items
@Component(modules = [ComputerModule::class])
interface NewComponent {
    fun inject(activity: Activity)
}