package com.rnbridgeapp

import android.widget.Toast

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class ToastModule(context: ReactApplicationContext) :
    ReactContextBaseJavaModule(context) {

    /**
     * Needed by all Java/Kotlin native modules
     * returns the name used by js / tsx to get this module
     */
    override fun getName() : String = "ToastModule"

    @ReactMethod
    fun showToast(message: String) {
        /**
         * Extending ReactContextBaseJavaModule allows us
         * to understand which Activity is currently
         * used.
         */
        getCurrentActivity()?.let {
            Toast.makeText(it, message, Toast.LENGTH_SHORT).show()
        }
    }
}