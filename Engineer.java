package JAVA;
public class Engineer extends Employee1 {  

 

    private int completedProjects;  

 

  

 

    public Engineer(String name, int age, String address, String employeeID,   

 

                    Department department, Role role, double salary, int teamSize, BonusStrategy1 bonusStrategy) {  

 

        super(name, age, address, employeeID, department, role, salary, teamSize, bonusStrategy);  

 

        this.completedProjects = teamSize; // Assuming this represents completed projects  

         

    }  

 

  

 

  

 

  

 

    public int getCompletedProjects() {  

 

        return completedProjects;  

 

    }  

 

  

 

   

 

    public double calculateTotalCompensation() {  

 

        return getSalary() + getBonusStrategy().calculateBonus(getSalary());  

 

    }  

 

  

 

    @Override  

 

    public void printInfo() {  

 

        super.printInfo();  

 

        System.out.println("Engineer Information:");  

 

        System.out.println("Completed Projects: " + completedProjects);  

 

        System.out.println("Total Compensation: $" + String.format("%.2f", calculateTotalCompensation()));  

 

    }  

 

  

 

    public String getDetails() {  

 

        return "Engineer: " + getName() + " | Completed Projects: " + completedProjects;  

 

    }  

 

} 
