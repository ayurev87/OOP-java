//Создать класс StudentGroup, содержащая в себе поля Teacher и список студентов.

package data;

import java.util.List;

public class studentGroup {
    
    private Teacher teacher;
    private List <Student> students;
    private int grupNumber;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getGrupNumber() {
        return grupNumber;
    }

    public void setGrupNumber(int grupNumber) {
        this.grupNumber = grupNumber;
    }

    public studentGroup(Teacher teacher, List <Student> students, int grupNumber){
        this.teacher = teacher;
        this.students = students;
        this.grupNumber = grupNumber;
    }


}
