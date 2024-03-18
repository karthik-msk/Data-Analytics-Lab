//CALCULATOR IMPLEMENTATION 
import java.rmi.server.*;
public class CalculatorImp extends UnicastRemoteObject implements Calculator{
    
    public CalculatorImp() throws Exception{
        super();
    }
    
    public int add(int x, int y){
        System.out.println("Received Request is "+ x + "+" + y);
        return x+y;
    }
}

