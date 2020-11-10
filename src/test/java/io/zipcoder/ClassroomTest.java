package io.zipcoder;

import org.junit.Test;
import static org.junit.Assert.*;

public class ClassroomTest {

    @Test
    public void ClassroomMaxStudentTest(){
        Classroom classroom = new Classroom(25);
        Integer expected = 25;
        Integer actual = classroom.getStudents().length;
        assertEquals(expected,actual);
    }
    @Test
    public void ClassroomStudentArrTest(){
        Double [] bobExamScore = {88.0,99.0,100.0};
        Student bob = new Student("bob","White",bobExamScore);
        Double [] aliceExamScore = {94.0,95.0,98.0};
        Student alice = new Student("Alice", "Inwonderland",aliceExamScore);
        Student [] classroom = {bob,alice};
        Student [] expected = {bob,alice};
        Classroom classR = new Classroom(classroom);
        Student [] actual = classR.getStudents();
        assertEquals(expected,actual);
    }
    @Test
    public void classroomGetStudentTest(){
        Double [] bobExamScore = {88.0,99.0,100.0};
        Student bob = new Student("bob","White",bobExamScore);
        Double [] aliceExamScore = {94.0,95.0,98.0};
        Student alice = new Student("Alice", "Inwonderland",aliceExamScore);
        Student [] classroom = {bob,alice};
        Student [] expected = {bob,alice};
        Classroom classR = new Classroom(classroom);
        Student [] actual = classR.getStudents();
        assertEquals(expected,actual);
    }
    @Test
    public void getAverageExamScoreTest(){
        Double [] bobExamScore = {90.0,90.0,90.0};
        Student bob = new Student("bob","White",bobExamScore);
        Double [] aliceExamScore = {94.0,95.0,93.0};
        Student alice = new Student("Alice", "Inwonderland",aliceExamScore);
        Student [] classroom = {bob,alice};
        Double bobAve = bob.getAverageExamScore();
        Double aliceAve = alice.getAverageExamScore();
        Classroom classR = new Classroom(classroom);
        Double expected = 92.0;
        Double actual = classR.getAverageExamScore();
        assertEquals(expected,actual);
    }
    @Test
    public void addStudentTest(){
        Double [] bobExamScore = {88.0,99.0,100.0};
        Student bob = new Student("bob","White",bobExamScore);
        Double [] aliceExamScore = {94.0,95.0,98.0};
        Student alice = new Student("Alice", "Inwonderland",aliceExamScore);
        Student [] preEnrol = {bob};
        Classroom classR = new Classroom(preEnrol);
        classR.addStudent(alice);
        Student [] expected = {bob,alice};
        Student [] actual = classR.getStudents();
        assertEquals(expected,actual);
    }
    @Test
    public void removeStudentTest(){
        Double [] bobExamScore = {88.0,99.0,100.0};
        Student bob = new Student("bob","White",bobExamScore);
        Double [] aliceExamScore = {94.0,95.0,98.0};
        Student alice = new Student("Alice", "Inwonderland",aliceExamScore);
        Student [] beforeRemoval = {bob,alice};
        Classroom classR = new Classroom(beforeRemoval);
        classR.removeStudent("Alice","Inwonderland");
        Student [] expected = {bob};
        Student [] actual = classR.getStudents();
        assertEquals(expected,actual);
    }
    @Test
    public void getStudentsByScoreTest(){
        Double [] bobExamScore = {90.0,90.0,90.0};;
        Student bob = new Student("bob","White",bobExamScore);
        Double [] aliceExamScore = {94.0,95.0,93.0};
        Student alice = new Student("Alice", "Inwonderland",aliceExamScore);
        Student [] school = {bob,alice};
        Classroom classR = new Classroom(school);

        Student [] expected = {alice,bob};
        Student [] actual = classR.getStudentsByScore();;
        assertEquals(expected,actual);
    }
    @Test
    public void getGradeBookTest(){
        Double [] bobExamScore = {90.0,90.0,90.0};;
        Student bob = new Student("Bob","White",bobExamScore);
        Double [] aliceExamScore = {94.0,95.0,93.0};
        Student alice = new Student("Alice", "Inwonderland",aliceExamScore);
        Double [] joeExamScore = {77.0,69.0,80.0};
        Student joe = new Student("Joe","Momma",joeExamScore);
        Double [] katieExamScore = {65.0,57.0,60.0};
        Student katie = new Student("Katie", "Schmatey",katieExamScore);
        Double [] nedExamScore = {99.0,98.0,100.0};
        Student ned = new Student("Ned","Flanders",nedExamScore);
        Student [] school = {bob,alice,joe,katie,ned};
        Classroom classR = new Classroom(school);

        String expected = "Student name: Ned Flanders\n" +
                "> Average score: 99.0\n" +
                "> Exam scores:\n" +
                "Exam 1 -> 99.0\n" +
                "Exam 2 -> 98.0\n" +
                "Exam 3 -> 100.0\n" +
                "GRADE: A\n" +
                "Student name: Alice Inwonderland\n" +
                "> Average score: 94.0\n" +
                "> Exam scores:\n" +
                "Exam 1 -> 94.0\n" +
                "Exam 2 -> 95.0\n" +
                "Exam 3 -> 93.0\n" +
                "GRADE: B\n" +
                "Student name: Bob White\n" +
                "> Average score: 90.0\n" +
                "> Exam scores:\n" +
                "Exam 1 -> 90.0\n" +
                "Exam 2 -> 90.0\n" +
                "Exam 3 -> 90.0\n" +
                "GRADE: C\n" +
                "Student name: Joe Momma\n" +
                "> Average score: 75.33333333333333\n" +
                "> Exam scores:\n" +
                "Exam 1 -> 77.0\n" +
                "Exam 2 -> 69.0\n" +
                "Exam 3 -> 80.0\n" +
                "GRADE: F\n" +
                "Student name: Katie Schmatey\n" +
                "> Average score: 60.666666666666664\n" +
                "> Exam scores:\n" +
                "Exam 1 -> 65.0\n" +
                "Exam 2 -> 57.0\n" +
                "Exam 3 -> 60.0\n" +
                "GRADE: D\n";

        String actual = classR.getGradeBook();
        assertEquals(expected,actual);
    }

}
