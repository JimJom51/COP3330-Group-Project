//Group 44
//Dr.Jahani
//COP3330-22
//April 10, 2022

package Borrowing;

import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Borrowing {

    protected int id;
    public String bookname;
    public String borrower;
    public static String dateBorrowed;
    public static String dateDue;
    
    private static final DateFormat Borrowed = new SimpleDateFormat("dd/MM/yyyy");
    private static final DateFormat Due = new SimpleDateFormat("dd/MM/yyyy");
    public void update(){
        Date currentDate = new Date();
        
        System.out.println(Borrowed.format(currentDate));
        
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DATE,14);
        
        Date Dued = c.getTime();
    }
    
    public String getDateBorrowed(){
        return Borrowing.dateBorrowed;
    }
    
    public String getDateDue(){
        return Borrowing.dateDue;
    }
}
