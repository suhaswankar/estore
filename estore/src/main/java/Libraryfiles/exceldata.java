package Libraryfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldata {
	
	public FileInputStream infile;
	public Workbook book;
	public Sheet shit;
	public Row row;
	public Cell col;
	public FileOutputStream outfile;
	String filepath = null;
	
	
	public exceldata(String filepath) {
		this.filepath = filepath;
	}
	
	
	public int rowcount(String sheetname) throws EncryptedDocumentException, IOException {
		infile = new FileInputStream(filepath);
		book = WorkbookFactory.create(infile);
		shit = book.getSheet(sheetname);
		int RowNo = shit.getLastRowNum();
		
		book.close();
		infile.close();
		return RowNo;
		
	}
	public int colcount(String sheetname, int rowno) throws EncryptedDocumentException, IOException {
		infile = new FileInputStream(filepath);
		book = WorkbookFactory.create(infile);
		shit = book.getSheet(sheetname);
		row = shit.getRow(rowno);
		int ColNo = row.getLastCellNum();
	
		book.close();
		infile.close();
		return ColNo;
		
	}
	
	public String getdata(String sheetname, int rowno, int colno) throws EncryptedDocumentException, IOException {
		infile = new FileInputStream(filepath);
		book = WorkbookFactory.create(infile);
		shit = book.getSheet(sheetname);
		row = shit.getRow(rowno);
		col = row.getCell(colno);
		
		DataFormatter format = new DataFormatter();
		String data;
		
		try {
			data = format.formatCellValue(col);
		}
		catch(Exception e) {
			data =" ";
		}
		
		book.close();
		infile.close();
		return data;
		
	}
	
	public String send_data(String sheetname, int rowno, int colno, String data) throws EncryptedDocumentException, IOException {
		infile = new FileInputStream(filepath);
		book = WorkbookFactory.create(infile);
		shit = book.getSheet(sheetname);
		row = shit.getRow(rowno);
		col = row.getCell(colno);
		
		outfile = new FileOutputStream(filepath);
		book.write(outfile);
		outfile.close();
		book.close();
		infile.close();
		return data;
		
	}
	
	
	
}
