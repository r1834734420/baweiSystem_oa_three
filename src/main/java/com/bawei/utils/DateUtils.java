package com.bawei.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	
	public static Date stringToDate(String source){
		try 
		{
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return sdf.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		return null;
	}
	
	public static Date stringToDate2(String source){
		try 
		{
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			return sdf.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		return null;
	}
	
	public static String monthDay(String source){
		try 
		{
			SimpleDateFormat sdf=new SimpleDateFormat("MM-dd");
			return sdf.format(sdf.parse(source));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		return null;
	}
	
	public static String dateToString(Date source){
		try 
		{
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return sdf.format(source);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return null;
	}
	
	/**
	 * 得到当前月的上个月
	 */
	
	public static Date getLastDate(Date date) {
		 Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	        cal.add(Calendar.MONTH, -1);
	        return cal.getTime();
	}
}
