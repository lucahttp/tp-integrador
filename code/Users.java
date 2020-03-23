
// Create a MyClass class
public class Users {
  int x;
  String Username;
  String Name;
  String Password;
  String Location;
  String ProfileType;

  // Create a class constructor for the MyClass class
  public Users(String username,String name,String password,String location,String profiletype) {
    x = 5;
    //Username = "Lukaneco";
    this.Username = username;
    this.Name = name;
    this.Password = password;
    this.Location = location;
    this.ProfileType = profiletype;
  }
  public static void main(String[] args) {
    Users newUser = new Users("Lukaneco","luca","contraseña123","flores1","viewer");
    System.out.println(newUser.x);
    System.out.println(newUser.Username);

  }
}

