//Создать класс StudentGroupServiceImpl, в котором реализована логика чтения Студентов и Преподавателя из файла txt 
//(реализация чтения файла опциональна), 
//создания класса StudentGroup и возвращения его.

package service;

import data.Student;
import data.Teacher;
import data.studentGroup;
import util.ReaderFromTxt;

public class StudentGroupServiceImpl implements StudentGroupService{

    private studentGroup grup;

    public StudentGroupServiceImpl(studentGroup grup) {
        this.grup = grup;
    }

    public studentGroup getGroup() {
        return grup;
    }

    public void setGroup(studentGroup group) {
        this.grup = group;
    }

    @Override
    public Teacher read(Teacher teacher) {
        return (Teacher) ReaderFromTxt.read(teacher);
    }

    @Override
    public Student read(Student student) {
        return (Student) ReaderFromTxt.read(student);
    }

 
    


}
