package com.zuily.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Uuid {
	public static void main(String[] args) {
		String format = new SimpleDateFormat("yyyyMMddHHmmssSSS") .format(new Date() );
		System.out.println(format);
	}

}
