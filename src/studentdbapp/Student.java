/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdbapp;

/**
 *
 * @author keepa
 */
public class Student {

    /**
     * @param args the command line arguments
     */

    private int ID;
    private String name;
    private double GPA;
    
    public Student() {
        
    }
    public Student(int ID, String name, double GPA) {
        this.ID = ID;
        this.name = name;
        this.GPA = GPA;
    }
    
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return ID;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    }
    

