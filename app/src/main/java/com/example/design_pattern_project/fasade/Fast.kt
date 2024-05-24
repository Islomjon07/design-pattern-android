package com.example.design_pattern_project.fasade

import com.example.design_pattern_project.fasade.car.actions.BungleUpInCar
import com.example.design_pattern_project.fasade.car.actions.CarEngine
import com.example.design_pattern_project.fasade.car.actions.GetInCar
import com.example.design_pattern_project.fasade.car.actions.OpenCarInDoor
import com.example.design_pattern_project.fasade.car.actions.StartCarFacade
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class StartCarFacadeImpl(
    private val openDoor: OpenCarInDoor,
    private val getingCar: GetInCar,
    private val buckleUpinCar: BungleUpInCar,
    private val carEngaine: CarEngine,
) : StartCarFacade {

    override fun bungleUpInCar() {
        CoroutineScope(Dispatchers.IO + SupervisorJob()).launch {
            openDoor.bungleUpInCar()
            getingCar.bungleUpInCar()
            buckleUpinCar.bungleUpInCar()
            carEngaine.bungleUpInCar()
        }
    }

}