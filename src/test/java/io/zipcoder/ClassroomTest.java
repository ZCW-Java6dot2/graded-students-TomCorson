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
        Double [] nedExamScore = {99.0,98.0,100.0}
        Student ned = new Student("Ned","Flanders",nedExamScore);
        Student [] school = {bob,alice,joe,katie,ned};
        Classroom classR = new Classroom(school);

        Student [] expected = {alice,bob};
        Student [] actual = classR.getStudentsByScore();;
        assertEquals(expected,actual);
    }

}
