package Utils;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static void main(String[] args) {
		getRowCount();
		
	}
	
	public static void getRowCount() {
		try {
			
		//String ProjectPath = System.getProperty("user.dir");
		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\Ali-c\\eclipse-workspace\\EngvidEnglish\\Excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFSheet Sheet = workbook.getSheet("Sheet1");
		int rowCount = Sheet.getPhysicalNumberOfRows();
		System.out.println("Num of row :" + rowCount);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		
		
	}

}
