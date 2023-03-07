package com.rnbridgeapp

import android.widget.Toast
import android.content.Context

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class ToastModule(context: ReactApplicationContext) :
    ReactContextBaseJavaModule(context) {
    private val context: Context

    init {
        this.context = context
    }

    /**
     * Needed by all Java/Kotlin native modules
     */
    override fun getName() : String = "ToastModule"


    @ReactMethod
    fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}