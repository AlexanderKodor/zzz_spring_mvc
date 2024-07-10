package com.alex.spring.mvc;

import jakarta.validation.constraints.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min=2, message = "Минимальная длина - 2 символа")
    private String name;
    @NotBlank(message = "Поле не должно быть пустым")
    private String surname;
    @Min(value = 100, message = "ЗП д.б. больше 100")
    @Max(value = 1000, message = "ЗП больше 1000 не получают")
    private int salary;
    private String department;
    private Map<String,String> departments;
    private String car;
    private Map<String,String> cars;
    private String[] languages;
    private Map<String,String> languagesList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Используйте шаблон XXX-XX-XX")
    private String phoneNumber;

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }
    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales","Sales");
        cars = new HashMap<>();
        cars.put("BMW","BMW");
        cars.put("Audi","Audi");
        cars.put("VW","VW");
        languagesList = new HashMap<>();
        languagesList.put("EN", "English");
        languagesList.put("RU", "Russian");
        languagesList.put("DE", "Deutch");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", car='" + car + '\'' +
                ", languages=" + Arrays.toString(languages) +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
