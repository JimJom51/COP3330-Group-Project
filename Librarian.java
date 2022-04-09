//Group 44
//Dr. Jahani
//COP3330-22
//April 10, 2022

public class Librarian 
        extends User {
  
  /* attributes */
  public String department;
  private User[] users;
  
  /* constructors */
  Librarian(int id) {
    super(id);
    this.department = new String();
  }
  
  Librarian(int id, String department) {
    super(id);
    this.department = department;
  }
  
  /* enable and disable user functions */
  protected void enableUser(int id) {
    int length = users.length;
    
    for (int i = 0; i < length; ++i) {
      if (id == users[i].id) 
        users[i].isEnabled = true;
    }
  }
  
  protected void disableUser() {
    int length = users.length;
    
    for (int i = 0; i < length; ++i) {
      if (id == users[i].id) {
        users[i].isEnabled = false;
      }
    }
  }
  
  /* getter functions */
  public String getDepartment() {
    return this.department;
  }
}
