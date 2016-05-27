import java.rmi.*;
public class Client {
  public static void main(String args[]) {
    try {
      String userServiceURL = "rmi://localhost/UserService";
      UserService service = (UserService)Naming.lookup(userServiceURL);

      System.out.println("Username: " + service.find(1));
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}