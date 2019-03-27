package com.bawei.utils;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.*;

/**
 * 文件处理工具类
 * @author Wangbt
 *
 */
public class FileUtil {

	private static final String UPLOAD_URL = "E:/OA";
	
	/**
	 * 文件上传
	 * @param files
	 * @return
	 */
	public static List<Map<String, String>> fileUpload(CommonsMultipartFile[] files, String url) {
		if (files == null || files.length == 0)
			return null;
		List<Map<String, String>> fileInfo = new ArrayList<Map<String,String>>();
		try {
			for (int i = 0; i < files.length; i++) {
				if (!files[i].isEmpty()) {// 判断文件是否为空
					Map<String, String> map = new HashMap<String,String>();
					String pashParent = UPLOAD_URL + url;
					File file = new File(pashParent);
					if (!file.exists())// 如果保存的文件路径不存在，就创建响应目录
						file.mkdirs();
					String fileName = new Date().getTime() + "." + files[i].getOriginalFilename().split("\\.")[1];
					String pash = pashParent + fileName;
					
					// 保存文件路径和原文件名
					map.put("url", url + fileName);
					map.put("formerly", files[i].getOriginalFilename());
					fileInfo.add(map);
					
					// 获取输出流
					FileOutputStream fos = new FileOutputStream(pash);
					// 获取输入流
					InputStream is = files[i].getInputStream();
					// 以字节方式写入文件
					int a = 0;
					while (((a = is.read())) != -1) {
						fos.write(a);
					}
					fos.flush();
					fos.close();
					is.close();
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return fileInfo;
	}
}
