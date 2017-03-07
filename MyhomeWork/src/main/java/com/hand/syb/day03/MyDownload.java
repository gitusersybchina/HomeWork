package com.hand.syb.day03;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 下载远程文件并保存到本地
 * 
 */
public class MyDownload {

	public static void main(String[] args) {

		String urlString = "http://www.madore.org/~david/math/padics.pdf";
		try {
			URL url = new URL(urlString);
			URLConnection conn = url.openConnection();
			
			InputStream is = conn.getInputStream();
			
			File file = new File("files/padics.pdf");
			if(file.exists()){
				
				System.out.println("文件已经存在......");
				
			}else{
				FileOutputStream fos = new FileOutputStream(file);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				int t = 0;
				byte b [] = new byte[1024];		
				while ( ( t = is.read(b)) != -1) {
					//读多少字节写入多少字节
					bos.write(b,0,t);
				}
				
				bos.close();
				fos.close();
				is.close();
				
				System.out.println("-----Download SUCCESS-----");
			}
			
		}catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();	
			
		}
	}

}




