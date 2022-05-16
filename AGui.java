
package school.course.mangment.system;

import school.course.mangment.system.Admin;


interface AGui {
    public void CalculateFees(Student s);
    public void ACalculateSalary(Admin a);
    public void TCalculateSalary(Teacher t);
    public void ITCalculateSalary(IT i);
            
}
