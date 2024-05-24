package com.example.design_pattern_project.fasade

import androidx.lifecycle.ViewModel
import com.example.design_pattern_project.fasade.car.actions.StartCarFacade

class TestViewModel(
    private val startCarFacade: StartCarFacade
) : ViewModel() {
    init {
        startCarFacade.bungleUpInCar()
    }
}