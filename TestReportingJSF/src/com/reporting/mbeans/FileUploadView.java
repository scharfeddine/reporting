package com.reporting.mbeans;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

 

























import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import com.reporting.metier.entities.TarifsInterTmp;
import com.reporting.metier.entities.Template;
import com.reporting.metier.interfaces.TarifinterLcrRemote;
import com.reporting.metier.interfaces.TemplateRemote;
 
@ManagedBean
public class FileUploadView {
 
	@EJB
	private TemplateRemote template_service;
	
	@EJB
	private TarifinterLcrRemote lcrService;
	public void handleFileUpload(FileUploadEvent event) {
		System.out.println(event.getFile().getFileName());
        FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
		 if (event.getFile().equals(null)) {
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "File is null", null));
		 }
		 InputStream file;
		 org.apache.poi.ss.usermodel.Workbook workbook = null;
		 try {
		 file = event.getFile().getInputstream();
		  workbook = WorkbookFactory.create(file);
		  Template t  = template_service.getTemplate(55);
		  
          //Get first/desired sheet from the workbook
		   org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0); 
		   List<TarifsInterTmp> temp = new ArrayList<>();
		  Iterator<Row> rowIterator = sheet.iterator();
        for(int i=t.getLignesIgnore_Tarif();i<13;i++){
              Row row = sheet.getRow(i);
              //For each row, iterate through all the columns
              Iterator<Cell> cellIterator = row.cellIterator();
               
               TarifsInterTmp temp1 = new TarifsInterTmp();
               temp1.setNomFichier(event.getFile().getFileName());
               temp1.setOperateur(t.getOperateur());
              while (cellIterator.hasNext())
              {
                  Cell cell = cellIterator.next();
                  //Check the cell type and format accordingly
                  switch (cell.getCellType())
                  {
                      case Cell.CELL_TYPE_NUMERIC:
                    	  if(t.getCodeDestColRow()!=""){
                              if(cell.getColumnIndex()==Integer.valueOf(t.getCodeDestColRow())){
                              	temp1.setCodeDest(cell.getNumericCellValue()+"");
                              	}
                    	  }
                              if(t.getCodePaysColRow()!=""){
                                  if(cell.getColumnIndex()==Integer.valueOf(t.getCodeDestColRow())){
                                  	temp1.setIdPays((int) cell.getNumericCellValue());
                                  	}
                              }
                              if(t.getTarifColRow()!=""){
                                  if(cell.getColumnIndex()==Integer.valueOf(t.getTarifColRow())){
                                  	temp1.setTarifs(cell.getNumericCellValue());
                                  	}
                              }
                          break;
                    	  
                      case Cell.CELL_TYPE_STRING:
                    	if(t.getDestColRow()!=""){
                        if(cell.getColumnIndex()==Integer.valueOf(t.getDestColRow())){
                        	temp1.setDestination(cell.getStringCellValue());
                        	}
                    	}
                        if(t.getDateEffColRow()!=""){
                        	if(cell.getColumnIndex()==Integer.valueOf(t.getDateEffColRow())){
                        		;
                            	temp1.setDateValidite(cell.getDateCellValue());
                            	
                            }
                        }
                          break;
                    	  }
              }
              temp.add(temp1);
        }    
       for(TarifsInterTmp ts:temp){
    	  lcrService.addLigne(ts);
    	   
       }
          file.close();
		 } catch (IOException e) {
			 FacesContext.getCurrentInstance()
			 .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error reading file" + e, null));
			 } catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 }
}