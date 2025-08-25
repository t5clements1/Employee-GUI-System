package JAVA;
public interface BonusStrategy1 { 

    double calculateBonus(double baseSalary); 

} 

 

class PerformanceBonusStrategy implements BonusStrategy1 { 

    @Override 

    public double calculateBonus(double baseSalary) { 

        return baseSalary * 0.15;  

    } 

} 

 

class ProjectBonusStrategy implements BonusStrategy1 { 

    private final int completedProjects; 

 

    public ProjectBonusStrategy(int completedProjects) { 

        this.completedProjects = completedProjects; 

    } 

 

    @Override 

    public double calculateBonus(double baseSalary) { 

        return completedProjects * 1000;  

    } 

} 

 

class FixedBonusStrategy implements BonusStrategy1 { 

    private final double fixedBonus; 

 

    public FixedBonusStrategy(double fixedBonus) { 

        this.fixedBonus = fixedBonus; 

    } 

 

    @Override 

    public double calculateBonus(double baseSalary) { 

        return fixedBonus; 

    } 

} 
 

 