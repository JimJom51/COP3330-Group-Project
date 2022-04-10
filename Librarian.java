//Group 44
//Dr.Jahani
//COP3330-22
//April 10,2022

package librarian;

public class Librarian {
    public String department = "Librarian";
    public String code;
    protected boolean isEnable;
    
    public String department(){
        return this.department;
    }
    
    Librarian(String code){
        if(this.code.equals(code)){
        this.isEnable = true;
        }
        else{
            this.isEnable = false;
        }
    }
    
}
