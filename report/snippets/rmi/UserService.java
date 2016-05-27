import java.rmi.*;

public interface UserService extends Remote {
  String find(int id) throws RemoteException;
}
