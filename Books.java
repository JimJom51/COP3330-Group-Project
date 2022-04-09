//Group 44
//Dr. Jahani
//COP3330-22
//April 10, 2022

public class Books {
  
  /* attributes */
  protected int id;
  public String title;
  public String details;
  public String publisher;
  
  /* constructor */
  Books(int id) {
    this.id = id;
  }
  
  /* add object's attributes after construction */
  public void add(int id, String title, String details, String publisher) {
    
    if (this.id != id) 
      return;
    
    this.title = title;
    this.details = details;
    this.publisher = publisher;
  }
  
  
  public void update(int id, char c, String s) {
    
    if (this.id != id)
      return;
    
    /* update either the object's title, details or publisher */
    switch(c) {
      case 't' -> this.title = s;
      case 'd' -> this.details = s;
      case 'p' -> this.publisher = s;
    }
  }
  
  /* getter functions */
  public String getTitle() {
    return this.title;
  }
  
  public String getDetails() {
    return this.details;
  }
  
  public String getPublisher() {
    return this.publisher;
  }
}
