//Создать метод в Controller createGroup(int groupNumber), в который передается номер группы, а возвращается StudentGroup.

package controller;

import data.Student;
import data.Teacher;
import data.studentGroup;
import service.DataService;
import service.StudentDataService;
import service.TeacherDataService;

public class Controller {

    private DataService studentService;
    private DataService teacherService;

    public Controller(StudentDataService studentService, TeacherDataService teacherService){
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    public Student writeStudent(Student student){
        studentService.write(student);
        return (Student) studentService.read(student);
    }

    public Teacher writeTeacher(Teacher teacher){
        teacherService.write(teacher);
        return (Teacher) teacherService.read(teacher);
    }

    public studentGroup createGroup (int grupNumber) {
        studentGroup grup = new studentGroup(null, null, grupNumber);
        return grup;
    }
}
