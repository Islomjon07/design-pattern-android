package com.example.design_pattern_project.singleton

class User {
    private var userName: String = "Default value User"

    fun setNewUserName(newValue: String) {
        userName = newValue
    }

    fun getCurrentUserName(): String {
        return userName
    }
}

object ObjectUser {
    private var userName: String = "Default value ObjectUser"

    fun setNewUserName(newValue: String) {
        userName = newValue
    }

    fun getCurrentUserName(): String {
        return userName
    }
}

fun main() {
    val objectUser = ObjectUser
    val objectUserSecond = ObjectUser
    val user = User()
    val userSecond = User()


    objectUser.setNewUserName("New Value [Object]")

    println(objectUser.getCurrentUserName())

    user.setNewUserName("New Value [Class]")

    println(user.getCurrentUserName())
}






































}