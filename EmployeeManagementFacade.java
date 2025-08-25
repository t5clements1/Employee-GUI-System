package JAVA;
// Adding an employee.
// Assigning a department and role to the employee.
// Generating reports based on employees'
// roles or departments.
// Calculating total compensation
// (salary + bonus) for a given employee.
// This will encapsulate the complexity of 
//interacting with different 
// subsystems
// (e.g., EmployeeFactory, ReportGenerator, and BonusStrategy) into a simple interface.
public class EmployeeManagementFacade {

} 
EmployeeManagementFacade facade = new EmployeeManagementFacade();
facade.addEmployee("John Doe", 30, "123 Main St", "E123", Department.IT, Role.ENGINEER, 80000);
facade.generateReportByDepartment(Department.IT);
