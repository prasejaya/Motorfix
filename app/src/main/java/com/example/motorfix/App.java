package com.example.motorfix;

import android.app.Application;

public class App extends Application {

    public static final boolean log = true;
    public static final int authRequest = 0, detailRequest = 1, mapFineLocationRequest = 2, bluetoothDeviceRequest = 3;
    private static App instance;

    public static synchronized App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
    }
}