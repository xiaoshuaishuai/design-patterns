package com.xs.my.design.patterns.struceturetype.bridge;

public class Client {
	public static void main(String[] args) {
        INavigator bdNavigator = new BDNavigator();  
        INavigator gpsNavigator = new GPSNavigator();  
        //宝马安装北斗导航  
        AbstractVehicleBrand bmw = new BMWVehicle();  
        bmw.install(bdNavigator);  
        bmw.open();  
        //奔驰安装了神行者导航  
        AbstractVehicleBrand benz = new BMWVehicle();  
        benz.install(gpsNavigator);  
        benz.open();  
	}

}
