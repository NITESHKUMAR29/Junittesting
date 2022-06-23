package com.example.junit

import android.content.Context
import java.security.AccessControlContext

class ResourceComparer {

    fun isEqual(context:Context,resId: Int, string: String ):Boolean {
       return context.getString(resId)==string

    }
}