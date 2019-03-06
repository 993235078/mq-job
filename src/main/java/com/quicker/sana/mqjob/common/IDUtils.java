package com.quicker.sana.mqjob.common;

import java.util.Random;
import java.util.UUID;

/**
 * 生成ID工具类
 * @周继文
 * */
public class IDUtils {

	/**
	 * 图片名称生成
	 */
	public static String genImageName() {
		long millis = System.currentTimeMillis();
		Random random = new Random();
		int end3 = random.nextInt(999);
		String str = millis + String.format("%03d", end3);
		return str;
	}
	
	/**
	 * id生成
	 */
	public static String getId() {
		long millis = System.currentTimeMillis();
		Random random = new Random();
		int end2 = random.nextInt(99999);
		String str = millis + String.format("%02d", end2);
		Long id = new Long(str);
		return id.toString();
	}
	
	/**
	 * 随机生成32位字符串
	 */
	
	public static String getSessoinId() {
		return UUID.randomUUID().toString().replace("-","");
	}
}
