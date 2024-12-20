package com.xantrix.webapp.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.xantrix.webapp.domain.Articoli;

public class ArticoliExcelView  extends AbstractXlsxView
{
	private String fileName;
	
	public ArticoliExcelView(String NomeFile)
	{
		fileName = NomeFile;
	}
	
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception
	{
		// Tipo e nome del file
		response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
		
		@SuppressWarnings({ "unchecked" })
		List<Articoli> articoli = (List<Articoli>) model.get("Articoli");
		
		final Sheet sheet = workbook.createSheet("Articoli");
		sheet.setDefaultColumnWidth(30);
		
		// stile intestazione
		CellStyle style = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName("Arial");
		style.setFillForegroundColor(HSSFColor.HSSFColorPredefined.BLUE.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		font.setBold(true);
		font.setColor(HSSFColor.HSSFColorPredefined.WHITE.getIndex());
		style.setFont(font);
		
		// creazione riga di instestazione
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Codice");
		header.getCell(0).setCellStyle(style);
		header.createCell(1).setCellValue("Descrizione");
		header.getCell(1).setCellStyle(style);
		header.createCell(2).setCellValue("Prezzo");
		header.getCell(2).setCellStyle(style);
		header.createCell(3).setCellValue("Um");
		header.getCell(3).setCellStyle(style);
		header.createCell(4).setCellValue("Categoria");
		header.getCell(4).setCellStyle(style);
		
		int rowCount = 1;
		
		//popolamento del file excel
		for (Articoli articolo : articoli)
		{
			Row ArtRow = sheet.createRow(rowCount++);
			ArtRow.createCell(0).setCellValue(articolo.getCodArt());
			ArtRow.createCell(1).setCellValue(articolo.getDescrizione());
			ArtRow.createCell(2).setCellValue(articolo.getPrezzo());
			ArtRow.createCell(3).setCellValue(articolo.getUm());
			ArtRow.createCell(4).setCellValue(articolo.getDesFamAss());
		}
	}
}
