package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import in.ashokit.dao.ReportDao;
@Service
public class ReportService {

	private ReportDao reportDao;
	@Value("${report.type}")
	private String type;
	
	
     public ReportService() {
		System.out.println("0-para::constructor");
	}
       @Autowired
       public ReportService(ReportDao reportDao) {
		System.out.println("para::constructor");
		this.reportDao = reportDao;
	}

/*
	@Autowired
	public void setReportDao(ReportDao reportDao) {
    	 System.out.println("ReportService::SetterMethod");
		this.reportDao = reportDao;
	}
*/
	public void printName(Integer userId)
	{
		System.out.println(type);
		String nameById=reportDao.getNameById(userId);
		System.out.println(nameById);
	}

}
