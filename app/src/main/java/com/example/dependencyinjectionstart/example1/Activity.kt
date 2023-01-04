package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    //Inject to field
//    @Inject
//    lateinit var keyboard: Keyboard
//    @Inject
//    lateinit var memory: Memory
//    @Inject
//    lateinit var monitor: Monitor
//    @Inject
//    lateinit var mouse: Mouse

    @Inject
    lateinit var computer: Computer

    //Inject with getters
//    val component = DaggerNewComponent.create()
//    val keyboard = component.getKeyboard()
//    val memory = component.getMemory()
//    val monitor = component.getMonitor()
//    val mouse = component.getMouse()

    init {
        DaggerNewComponent.create().inject(this)
    }
}