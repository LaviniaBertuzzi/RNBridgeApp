package com.rnbridgeapp

import android.app.Activity
import androidx.appcompat.app.AlertDialog

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class AlertModule(context: ReactApplicationContext) :
    ReactContextBaseJavaModule(context) {

    /**
     * Needed by all Java/Kotlin native modules
     */
    override fun getName() : String = "AlertModule"


    @ReactMethod
    fun showAlert(message: String) {
        val activity = getCurrentActivity()?.let{
            createAlertDialog(it, message).show()
        }
    }

    private fun createAlertDialog(activity: Activity, message: String): AlertDialog {
        return AlertDialog.Builder(activity).apply {
            this.setTitle("Done")
            this.setMessage(message)
            this.setPositiveButton("Ok"){ dialog, _ ->
                dialog.dismiss()
            }
        }.create()
    }
}