package com.example.springboot;

import org.apache.commons.lang3.StringUtils;
public class TextUtils {
	
	public static String getText() {
		String[] arr = {"This is ", "joined Strings!"};
		return StringUtils.join(arr, ",");
	}

}
