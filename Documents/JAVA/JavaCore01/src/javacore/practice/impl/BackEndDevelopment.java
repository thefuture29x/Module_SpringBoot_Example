package javacore.practice.impl;

import javacore.practice.Employee;

public class BackEndDevelopment extends Employee {
    private String frameworkName;
    private String language;
    private String programmingLangue;

    public BackEndDevelopment(int id, String name, String frameworkName, String language, String programmingLangue) {
        super(id, name);
        this.frameworkName = frameworkName;
        this.language = language;
        this.programmingLangue = programmingLangue;
    }

    public String getFrameworkName() {
        return frameworkName;
    }

    public void setFrameworkName(String frameworkName) {
        this.frameworkName = frameworkName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getProgrammingLangue() {
        return programmingLangue;
    }

    public void setProgrammingLangue(String programmingLangue) {
        this.programmingLangue = programmingLangue;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println(this.getFrameworkName() + " | " + this.getLanguage() +" | "+ this.getProgrammingLangue());
    }
}
