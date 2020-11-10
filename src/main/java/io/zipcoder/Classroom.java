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

    public String getGradeBook(){
        StringBuilder gradeBook = new StringBuilder();
        Student [] kids = this.getStudentsByScore();
        double a = Math.floor(.1 * kids.length);
        double b = Math.floor(.29 * kids.length);
        double c = Math.floor(.5 * kids.length);
        double d = Math.floor(.89 * kids.length);

        for(int i = 0; i < kids.length; i++){
           gradeBook.append(kids[i].toString());
           if(a == i){
               gradeBook.append("\nGRADE: A\n");
           }
           else if(b == i){
               gradeBook.append("\nGRADE: B\n");
           }
           else if(c == i){
               gradeBook.append("\nGRADE: C\n");
           }
           else if(d == i){
               gradeBook.append("\nGRADE: D\n");
           }
           else{
               gradeBook.append("\nGRADE: F\n");
           }
        }
        return gradeBook.toString();
    }

}