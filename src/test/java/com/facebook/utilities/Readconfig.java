package com.facebook.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Readconfig {
	Properties pro;
	public  Readconfig() {
		File fi = new File("./Configuration/config.properties");
		try {
			FileInputStream src = new FileInputStream(fi);
			pro = new Properties();
			pro.load(src);
				
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getapplicationurl() {
		String url = pro.getProperty("baseurl");
		return url;
	}
	
	public String getfname() {
		String rname = pro.getProperty("fcname");
		return rname;
	}
	
	public String getlname() {
		String rlname = pro.getProperty("lcname");
		return rlname;
	}
	
	public String getmobile() {
		String rmobile = pro.getProperty("mcnum");
		return rmobile;
	}
	
	public String getnewpass() {
		String rnewpass = pro.getProperty("ncpass");
		return rnewpass;
	}
	
	public String getdate() {
		String rdate = pro.getProperty("ncdate");
		return rdate;
	}
	
	public String getmonth() {
		String rmonth = pro.getProperty("ncmonth");
		return rmonth;
	}
	
	public String getyear() {
		String ryear = pro.getProperty("ncyear");
		return ryear;
	}
	
	public String getchromepath() {
		String rchromepath = pro.getProperty("chromepath");
		return rchromepath;
	}
	
	public String getfirefoxpath() {
		String rfirefoxpath = pro.getProperty("firefoxpath");
		return rfirefoxpath;
	}
}
