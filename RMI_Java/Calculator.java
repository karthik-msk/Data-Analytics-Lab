//CALCULATOR INTERFACE
import java.rmi.*;

public interface Calculator extends Remote{
    public int add(int x, int y) throws RemoteException;
}


