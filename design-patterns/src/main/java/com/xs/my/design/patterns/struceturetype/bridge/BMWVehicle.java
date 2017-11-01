package com.xs.my.design.patterns.struceturetype.bridge;

public class BMWVehicle extends AbstractVehicleBrand{  
    //导航  
    INavigator navigator = null;  
  
    @Override  
    public void install(INavigator n) {  
        navigator = n;  
    }  
  
    @Override  
    public void open() {  
        navigator.work();  
    }  
  
}  