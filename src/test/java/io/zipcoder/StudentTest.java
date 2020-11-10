package io.zipcoder;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void studentSetFirstNameTest(){
        Double [] exams = {100.0, 77.8, 96.0};
        Student s1 = new Student("Bob","Smith",exams);
        s1.setFirstName("Billy");
        String expected = "Billy";
        String actual = s1.getFirstName();
       assertEquals(expected,actual);
    }
    @Test
    public void studentGetFirstNameTest(){
        Double [] exams = {100.0, 77.8, 96.0};
        Student s1 = new Student("Jim","Smith",exams);
        String expected = "Jim";
        String actual = s1.getFirstName();
        assertEquals(expected,actual);
    }
    @Test
    public void studentSetLastNameTest(){
        Double [] exams = {100.0, 77.8, 96.0};
        Student s1 = new Student("Bob","Smith",exams);
        s1.setLastName("crow");
        String expected = "crow";
        String actual = s1.getLastName();
        assertEquals(expected,actual);
    }
    @Test
    public void studentGetLastNameTest(){
        Double [] exams = {100.0, 77.8, 96.0};
        Student s1 = new Student("Jim","Smith",exams);
        String expected = "Smith";
        String actual = s1.getLastName();
        assertEquals(expected,actual);
    }
    @Test
    public void getNumOfExamsTakenTest(){
        Double [] exams = {100.0, 77.8, 96.0};
        Student s1 = new Student("Jim","Smith",exams);
        Integer expected = 3;
        Integer actual = s1.getNumberOfExamsTaken();
        assertEquals(expected,actual);
    }
    @Test
    public void getExamScoresTest(){
        Double [] exams = {100.0, 77.0, 96.0};
        Student s1 = new Student("Jim","Smith",exams);
        String expected = "Exam 1 -> 100.0\nExam 2 -> 77.0\nExam 3 -> 96.0";
        String actual = s1.getExamScores();
        assertEquals(expected,actual);
    }
    @Test
    public void addExamScoreTest(){
        Double [] exams = {100.0, 77.0, 96.0};
        Student s1 = new Student("Jim","Smith",exams);
        s1.addExamScore(89.0);
        String expected = "Exam 1 -> 100.0\nExam 2 -> 77.0\nExam 3 -> 96.0\nExam 4 -> 89.0";
        String actual = s1.getExamScores();
        assertEquals(expected,actual);
    }
    @Test
    public void setExamScoreTest(){
        Double [] exams = {100.0, 77.0, 96.0};
        Student s1 = new Student("Jim","Smith",exams);
        s1.setExamScore(1,99.0);
        String expected = "Exam 1 -> 100.0\nExam 2 -> 99.0\nExam 3 -> 96.0";
        String actual = s1.getExamScores();
        assertEquals(expected,actual);
    }
    @Test
    public void getAverageExamScoreTest(){
        Double [] exams = {100.0, 77.0, 96.0};
        Student s1 = new Student("Jim","Smith",exams);
        Double expected = 91.0;
        Double actual = s1.getAverageExamScore();
        assertEquals(expected,actual);
    }
    @Test
    public void toStringTest(){
        Double [] exams = {100.0, 77.0, 96.0};
        Student s1 = new Student("Jim","Smith",exams);
        String expected = "Student name: Jim Smith\n> Average score: 91.0\n" +
                "> Exam scores:\nExam 1 -> 100.0\nExam 2 -> 77.0\nExam 3 -> 96.0";
        String actual = s1.toString();
        assertEquals(expected,actual);

    }

}