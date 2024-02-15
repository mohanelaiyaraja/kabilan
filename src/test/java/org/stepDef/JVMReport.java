package org.stepDef;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	
	public static void generatejvmReport( String Jsonpath) {
		// 1.Mention the target folder location - file 
		
		File f = new File("C:\\Users\\emoha\\eclipse-workspace\\CucumberNew\\JVMReport");
		
		// 2. Add details to report using Configuration class --------addClassfication()---m
		
		Configuration c = new Configuration(f,"FaceBook");
		
		c.addClassifications("Os Name", "Windows 11");
		c.addClassifications("BrowserName", "Chrome");
		c.addClassifications("Browser Version", "111.16");
		
		// 3. Add json file paths into List<string> (frist complete 4th step then 
		
		List<String> l = new ArrayList<String>();
		l.add(Jsonpath);
		
		// 4. Create object 
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
				
	}

}
