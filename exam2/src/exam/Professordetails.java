/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Anusha Kanagala
 */
public class Professordetails extends Professor {
    private String professorName;
    private double Salary;
    private int experience;
    
    
    public Professordetails(String professorName, double Salary, int experience, String designation, String collegeName){
        super(designation, collegeName);
        this.professorName = professorName;
        this.Salary = Salary;
        this.experience = experience;
    }
    
    public String getProfessorName(){
        return professorName;
    }
    
    
    public double getsalary(){
        return Salary;
        
    }
    
    public int getExperience(){
        return experience;
    }
    
    
    @Override
    public String toString(){
       return "ProfessorName: "+getProfessorName()+",SALARY: "+getsalary()+",EXPERIENCE: "+getExperience()+","+super.toString();
}
}
