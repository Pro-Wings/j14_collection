package com.prowings.enumdemo;

public class EnumDayDemo {
	
	public static void main(String[] args) {
		
		Day day = Day.SUNDAY;
		
		String res = isHoliday(day) ? "HOLIDAY!!" : "WORKING DAY!!!";
		
		System.out.println(res);
		
	}

	public static boolean isHoliday(Day day) {
		if(day.equals(Day.SATURDAY) || day.equals(Day.SUNDAY))
			return true;
		else
			return false;
	}

}
