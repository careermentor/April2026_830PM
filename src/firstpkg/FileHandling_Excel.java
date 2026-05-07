package firstpkg;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class FileHandling_Excel 
{
	
	public static void printnumber10()
	{
		for(int i=1; i<11; i++ )
		{
			System.out.println(i);
		}
	}

	public static void readexceldata() throws Exception
	{
		
		FileInputStream fis = new FileInputStream("./testdata/testdata.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("data");
		
		int nr = sh1.getPhysicalNumberOfRows();  //nr=3
		
		for(int i=0;i<nr;i++)
		{
			XSSFRow row = sh1.getRow(i); //i=0, i=1, i=2
			
			//i=0
			int nc = row.getPhysicalNumberOfCells();
			
			for(int j=0; j<nc;j++) //j=0, j=1, i=1, j=0,j=1, j=2
			{
				XSSFCell col = row.getCell(j);
				
				if(col.getCellType()==CellType.STRING)
				{
					System.out.print(col.getStringCellValue() + "     ");
				}
				
				else if(col.getCellType()==CellType.BOOLEAN)
				{
					System.out.print(col.getBooleanCellValue() + "     ");
				}
				
				else if(col.getCellType()==CellType.NUMERIC)
				{
					if(DateUtil.isCellDateFormatted(col))
					{
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						System.out.print(sdf.format(col.getDateCellValue()) + "     ");
					}
					else
					{
						System.out.print(col.getNumericCellValue() + "     ");
					}
					
					
				}
				
				
			}
			
			System.out.println();
		}
		
		/*
		//first row
		XSSFRow row1 = sh1.getRow(0);  
		
		XSSFCell col1 = row1.getCell(0);
		System.out.print(col1.getStringCellValue() + "     ");
		
		XSSFCell col2 = row1.getCell(1);
		System.out.print(col2.getStringCellValue() + "     ");
		
		System.out.println();
		
		//second row
		XSSFRow row2 = sh1.getRow(1);
		
		XSSFCell col21 = row2.getCell(0);
		System.out.print(col21.getStringCellValue() + "     ");
		
		XSSFCell col22 = row2.getCell(1);
		System.out.print(col22.getStringCellValue() + "     ");
		
		XSSFCell col23 = row2.getCell(2);
		System.out.print(col23.getStringCellValue()  + "     ");
		*/
	}
	
	public static void main(String[] args) throws Exception 
	{
		readexceldata();
	}
	
}
