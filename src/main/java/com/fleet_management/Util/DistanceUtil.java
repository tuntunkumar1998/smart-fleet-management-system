package com.fleet_management.Util;

import com.fleet_management.Dto.CoordinateDTO;

public class DistanceUtil {

	 public static double calculateDistance(CoordinateDTO a,CoordinateDTO b) {
		 
		 double x =  b.getLatitude() - a.getLatitude();
		 
		 double y = b.getLongitude() - a.getLongitude();
		 
		 return Math.sqrt(x * x + y * y);
	 }
	
}
