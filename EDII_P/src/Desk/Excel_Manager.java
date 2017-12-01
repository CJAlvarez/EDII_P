/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desk;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;


/**
 *
 * @author danie
 */
public class Excel_Manager {

    public Excel_Manager() {
    }
    
    public void exportarCampo(String nombreCampo, String dato){
        try {
            HSSFWorkbook libro = new HSSFWorkbook();
            
            HSSFSheet hoja = libro.createSheet("Hoja1");
            HSSFRow fila1 = hoja.createRow(0);
            HSSFRow fila2 = hoja.createRow(1);
            
            fila1.createCell(0).setCellValue(nombreCampo);
            fila2.createCell(0).setCellValue(dato);


            hoja.autoSizeColumn(1);
            makeRowBold(libro,fila1);
            
            libro.write(new FileOutputStream("Campos.xls"));
            libro.close();
            System.out.println("Exportado a Excel!");
        } catch (Exception e) {
        }
    }
    public static void makeRowBold(HSSFWorkbook wb, Row row){
        CellStyle style = wb.createCellStyle();//Create style
        HSSFFont font = wb.createFont();//Create font
        font.setBold(true);//Make font bold
        style.setFont(font);//set it to bold
        for(int i = 0; i < row.getLastCellNum(); i++){//For each cell in the row 
            row.getCell(i).setCellStyle(style);//Set the sty;e
        }
    }
}
