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
public class ques5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Anusha", "1115N  CD", "6605280671", "anusha.kanagala98@gmail.com");
        
        Student student = new Student(4.0, "Abhi", "112N CD", "3022521152", "abhii.nathi@gmail.com");
        
        Employee employee = new Employee("CSIS", 1000.00, "02/01/2020", "Likitha", "1115N CD", "5103999788", "likithaalugubelli@gmail.com");
        
        Faculty faculty = new Faculty(20, 1, "CSIS", 2000.00, "028/02/2021", "Ramu", "PARK WAY", "6605281344", "ramuvallavarapu@gmail.com");
        
        Staff staff = new Staff("Software Developer", "CITE", 1400.00, "04/11/2021", "Pramodh", "Village O", "6602150760", "pramodhreddygonegari@gmail.com");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
    
}
