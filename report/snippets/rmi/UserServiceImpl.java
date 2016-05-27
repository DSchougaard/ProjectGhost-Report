import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject;

public class UserServiceImpl extends UnicastRemoteObject implements UserService {
  public UserServiceImpl() throws RemoteException {}

  public String find(int id){ 
    return "SomeUserWithID=" + id;
  }

  public static void main(String args[]){
    try{
      UserServiceImpl service = new UserServiceImpl();
      Naming.rebind("UserService", service);
    }catch(Exception e){
      System.out.println("Error: " + e.getMessage());   
      e.printStackTrace();
    }
  }
}
