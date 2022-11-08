package com.example.dagger2.di;

import com.example.dagger2.Coche;
import com.example.dagger2.Motor;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MotorModulo {
    @Named("diesel")
    @Provides
    public Motor providesMotorDiesel(){
        return new Motor("diesel");
    }
    @Named("gasolina")
    @Provides
    public Motor providesMotorGasolina(){
        return new Motor("gasolina");
    }
    @Provides
    public Coche providesCoche(@Named("diesel") Motor motor){
        return new Coche(motor);
    }
}
