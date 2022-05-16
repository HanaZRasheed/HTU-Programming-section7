package packages.time;

import java.time.LocalDate; 
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDemo {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now(); 
    System.out.println(date);
    
    
    LocalTime Time=LocalTime.now();
    System.out.println(Time);
    
    
    LocalDateTime dateAndTime = LocalDateTime.now();
    System.out.println(dateAndTime);
    
    
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    /*
     * yyyy-MM-dd	"1988-09-29"	
     * dd/MM/yyyy	"29/09/1988"	
     * dd-MMM-yyyy	"29-Sep-1988"	
     * E, MMM dd yyyy	"Thu, Sep 29 1988"
     * dd-MM-yyyy HH:mm:ss
     */
    
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}