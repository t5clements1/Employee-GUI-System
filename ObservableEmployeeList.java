package JAVA;
import java.util.*; 

import java.util.List; 

 

 

                // ObservableEmployeeList class 

                class ObservableEmployeeList1 { 

                    private List<Employee1> employees = new ArrayList<>(); 

                    private List<Observer1> observers = new ArrayList<>(); 

                 

                    public void addObserver(Observer1 observer) { 

                        observers.add(observer); 

                    } 

                 

                    public void removeObserver(Observer1 observer) { 

                        observers.remove(observer); 

                    } 

                 

                    public void addEmployee(Employee1 employee) { 

                        employees.add(employee); 

                        notifyObservers("Employee added: " + employee.getName()); 

                    } 

                 

                    public void updateEmployeeRole(Employee1 employee, Role newRole) { 

                        employee.setRole(newRole); 

                        notifyObservers("Role updated for employee: " + employee.getName() + ", new role: " + newRole); 

                    } 

                 

                    public void updateEmployeeDepartment(Employee1 employee, Department newDepartment) { 

                        employee.setDepartment(newDepartment); 

                        notifyObservers("Department updated for employee: " + employee.getName() + ", new department: " + newDepartment); 

                    } 

                 

                    private void notifyObservers(String message) { 

                        for (Observer1 observer : observers) { 

                            observer.update(message); 

                        } 

                    } 

                } 