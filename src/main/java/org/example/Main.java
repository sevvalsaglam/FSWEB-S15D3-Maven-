package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    private static  Map<Integer, Employee> employeeMap;
    private static List<Employee> duplicatedEmployees;

    public static List findDuplicates(List<Employee> employees){
        employeeMap=new HashMap<>();
        duplicatedEmployees=new LinkedList<>();
        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(employee==null){
                System.out.println("null record");
                continue;
            }
            if(employeeMap.containsKey(employee.getId())){
                duplicatedEmployees.add(employee);
            }else{
                employeeMap.put(employee.getId(),employee);
            }
        }
        return duplicatedEmployees;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> employees){
        employeeMap=new HashMap<>();
        Iterator<Employee> iterator= employees.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if(employee==null){
                System.out.println("null record");
                continue;
            }
            if(!employeeMap.containsKey(employee.getId())){
                employeeMap.put(employee.getId(),employee);
            }
        }
        return employeeMap;
    }
    public static List<Employee> removeDuplicates(List<Employee> employees){
        List<Employee> duplicates = findDuplicates(employees);
        Map <Integer, Employee> uniques = findUniques(employees);
        List<Employee> onlyUnique = new LinkedList<>(uniques.values());
        onlyUnique.removeAll(duplicates);
        return onlyUnique;

    }

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        List <Employee> employee1= new LinkedList();
//        employee1.add(new Employee(1,"Şevval","Sağlam"));
//        employee1.add(new Employee(2,"Selen ","Solmaz"));
//        employee1.add(new Employee(1,"Şevval","Sağlam"));
//        employee1.add(new Employee(3,"Meryem","Çakal"));
//        employee1.add(new Employee(4,"Yaren","Tapıklama"));
//        employee1.add(new Employee(1,"Şevval","Sağlam"));
//        employee1.add(new Employee(5,"Nisa","Akyüz"));
//        System.out.println(employee1);
//
//        System.out.println(findDuplicates(employee1));
//        System.out.println(findDuplicates(employee1).size());
//        System.out.println(findUniques(employee1));
//        System.out.println(findUniques(employee1).size());
//        System.out.println(removeDuplicates(employee1));
//        System.out.println(removeDuplicates(employee1).size());
    }


}