package JAVA;
public class ManagerObserver implements Observer1 { 

    @Override 

    public void update(String message) { 

        System.out.println("Manager notified: " + message); 

    } 

} 