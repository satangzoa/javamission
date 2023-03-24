package ucmap.java.mission5.controller;

import ucmap.java.mission5.entity.*;


public class VehicleManager {
//	Airplane[] airplaneArr;
//	Car[] carArr;
//	Ship[] shipArr;
	
	Vehicle[] vehicleArr;
	
	public VehicleManager() {
//		airplaneArr = new Airplane[2];
//		carArr = new Car[3];
//		shipArr = new Ship[2];
//		
		vehicleArr = new Vehicle[7];
		
		vehicleArr[0] = new Airplane("보잉747", 1300, 300, 4);
		vehicleArr[1] = new Airplane("F-16", 1600, 1, 1);
		
		vehicleArr[2] = new Car("소나타3", 180, 5, 10);
		vehicleArr[3] = new Car("티코", 130, 4, 15);
		vehicleArr[4] = new Car("스타렉스", 150, 10, 11);
		
		vehicleArr[5] = new Ship("크루즈2", 30, 400, 35000);
		vehicleArr[6] = new Ship("노틸러스", 25, 150, 15000);
	}
	
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for (int inx = 0 ; inx < vehicleArr.length ; inx++) {
			vehicleArr[inx].displayInfo();
			vehicleArr[inx].setAvailable(true);
		}
		
//		for (int inx = 0 ; inx < carArr.length ; inx++) {
//			carArr[inx].displayInfo();
//			carArr[inx].setAvailable(true);
//		}
//		
//		for (int inx = 0 ; inx < shipArr.length ; inx++) {
//			shipArr[inx].displayInfo();
//			shipArr[inx].setAvailable(true);
//		}
		
		System.out.println();
	}
	
	public void sortByModelName() {
		//모델명을 기준으로 오름차순으로 정렬하는 코드를 작성하시오. vehicleArr
		

		
		for(int i = 0; i < vehicleArr.length - 1; i++) {
			for(int j = i + 1; j < vehicleArr.length; j++) {
				if (vehicleArr[i].getModelName().compareTo(vehicleArr[j].getModelName()) > 0)  {
					Vehicle temp = vehicleArr[i];
					vehicleArr[i] = vehicleArr[j];
					vehicleArr[j] = temp;
				}
			}
		}
		
	}
}

