package com.example.dagger2.di;

import com.example.dagger2.MainActivity;

import dagger.Component;

@Component(modules = {MotorModulo.class})
public interface MotorComponent {
    void inject(MainActivity mainActivity);
}
