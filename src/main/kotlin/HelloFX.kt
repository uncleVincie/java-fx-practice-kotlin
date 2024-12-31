package com.vincie

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.Region
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloFX: Application() {

    override fun start(stage: Stage) {
        val scene = Scene(createContent(), 400.0, 200.0)
        stage.scene = scene
        stage.show()
    }

    private fun createContent(): Region {
        return VBox(20.0)
    }

    companion object {
        fun launch() {
            Application.launch()
        }
    }


}