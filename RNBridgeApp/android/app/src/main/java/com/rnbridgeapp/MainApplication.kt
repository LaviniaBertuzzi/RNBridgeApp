package com.rnbridgeapp

import android.app.Application
import com.facebook.react.PackageList
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint
import com.facebook.react.defaults.DefaultReactNativeHost
import com.facebook.soloader.SoLoader
import com.rnbridgeapp.AppPackage

class MainApplication : Application(), ReactApplication {
    private val mReactNativeHost: ReactNativeHost = object : DefaultReactNativeHost(this) {
        override fun getUseDeveloperSupport(): Boolean = BuildConfig.DEBUG

        // Packages that cannot be autolinked yet can be added manually here, for example:
        // packages.add(new MyReactNativePackage());
        override fun getPackages(): List<ReactPackage> =
            PackageList(this).packages.apply {
                // Packages that cannot be autolinked yet can be added manually here, for example:
                // packages.add(new MyReactNativePackage());
                add(AppPackage())
            }

        override protected fun getJSMainModuleName(): String? {
            return "index"
        }

    }

    override fun getReactNativeHost(): ReactNativeHost {
        return mReactNativeHost
    }

    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this,  /* native exopackage */false)
        if (BuildConfig.IS_NEW_ARCHITECTURE_ENABLED) {
            // If you opted-in for the New Architecture, we load the native entry point for this app.
            DefaultNewArchitectureEntryPoint.load()
        }
        ReactNativeFlipper.initializeFlipper(this, reactNativeHost.getReactInstanceManager())
    }
}