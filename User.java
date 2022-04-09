//Group 44
//Dr. Jahani
//COP3330-22
//April 10, 2022

public class User {
  
  /* attributes */
  protected int id;
  public String name;
  public String age;
  protected String username;
  protected String password;
  protected boolean isEnabled;
  
  /* constructor */
  User(int id) {
    this.id = id;
    this.isEnabled = true;
  }
  
  /* updates certain attributes */
  public void update(int id, char c, String s) {
    if (this.id != id)
      return;
    
    if (c == 'n')
      this.name = s;
    if (c == 'a')
      this.age = s;
    if (c == 'u')
      this.username = s; //probably change this. preferably usernames would be unique
    if (c == 'p')
      this.password = s;
  }
  
  /* getter functions */
  public String getName() {
    return this.name;
  }
  
  public String getAge() {
    return this.age;
  }
  
  public int getID() {
    return this.id;
  }
}
