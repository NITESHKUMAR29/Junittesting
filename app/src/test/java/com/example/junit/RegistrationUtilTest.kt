package com.example.junit

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilTest{

    @Test
    fun emptyUser(){
        val result=RegistrationUtil.validateUser(
            userName = "",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun validAuth(){
        val result=RegistrationUtil.validateUser(
            userName = "manish",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isTrue()
    }
    @Test
    fun repeatUser(){
        val result=RegistrationUtil.validateUser(
            userName = "nitesh",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun confirmPasswordNotMatch(){
        val result=RegistrationUtil.validateUser(
            userName = "manish",
            password = "123",
            confirmedPassword = "456"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateUser(
            "Philipp",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password returns false`() {
        val result = RegistrationUtil.validateUser(
            "Philipp",
            "abcdefg5",
            "abcdefg5"
        )
        assertThat(result).isFalse()
    }


}