package io.zipcoder;

import java.util.*;

public class Classroom {

    private Student [] students;

    public Classroom(int maxNumOfStudents){
        this.students = new Student[maxNumOfStudents];
    }
    public Classroom(Student [] students){
        this.students = students;
    }
    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return this.students;
    }
    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (Student st : students) {
            sum += st.getAverageExamScore();
        }
        return sum / Double.valueOf(students.length);

    }
        public void addStudent(Student stu){
           Student [] updated = new Student[this.students.length +1];
           for(int i = 0;i < this.students.length;i++){
               updated[i] = this.students[i];
           }
           updated[updated.length-1] = stu;
           this.students = updated;
        }

    public void removeStudent(String firstName, String lastName) {
        Student [] removed = new Student[this.students.length-1];
        for(int i = 0; i < this.students.length;i++){
            if(!this.students[i].getFirstName().equals(firstName) && !this.students[i].getLastName().equals(lastName)){
                removed[i] = this.students[i];
            }
        }
        this.students = removed;
    }

    public Student[] getStudentsByScore() {
        List<Student> studentList = new ArrayList<>(Arrays.asList(getStudents()));
        Collections.sort(studentList);
        Collections.reverse(studentList);
        return studentList.toArray(new Student[studentList.size()]);
}
}