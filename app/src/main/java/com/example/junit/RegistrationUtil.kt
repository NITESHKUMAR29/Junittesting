package com.example.junit

object RegistrationUtil {

    private val existingUser= listOf("nitesh","prajata")
    fun validateUser(
        userName:String,
        password:String,
        confirmedPassword: String


    ):Boolean{
        if(userName.isEmpty() || password.isEmpty()) {
            return false
        }
        if(userName in existingUser) {
            return false
        }
        if(password != confirmedPassword) {
            return false
        }
        if(password.count { it.isDigit() } < 2) {
            return false
        }
        return true

    }

}