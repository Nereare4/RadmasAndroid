package com.example.dagger2.di;

import android.app.Application;

public class MotorAplication extends Application {
    private MotorComponent motorComponent;

    @Override
    public void onCreate(){
        super.onCreate();
        motorComponent = DaggerMotorComponent.builder().motorModule(new MotorModulo()).build();
    }

    public MotorComponent getMotorComponent(){
        return motorComponent;
    }
}
