package JAVA;
public class HRDepartmentObserver implements Observer1 { 

    @Override 

    public void update(String message) { 

        System.out.println("HR Department notified: " + message); 

    } 

} 