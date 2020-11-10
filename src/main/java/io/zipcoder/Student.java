package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student>{

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double [] examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(Arrays.asList(examScores));
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken(){
        return this.examScores.size();
    }
    public String getExamScores(){
        StringBuilder scores = new StringBuilder();
        for(int i = 0; i < examScores.size();i++){
            scores.append("Exam " + (i+1) + " -> " + (examScores.get(i)));
            if(i != examScores.size()-1){
                scores.append("\n");
            }
        }
        return scores.toString();
    }

    public void addExamScore(double v) {
        this.examScores.add(v);
    }

    public void setExamScore(int i, double updated) {
        this.examScores.set(i,updated);
    }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        for(Double e: this.examScores){
            sum += e;
        }
        return sum/this.examScores.size();
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("Student name: " + this.getFirstName() + " " + this.getLastName()+ "\n" +
                "> Average score: " + this.getAverageExamScore()+"\n" +"> Exam scores:\n" +
                this.getExamScores());
        return result.toString();
    }


    @Override
    public int compareTo(Student s) {
        if (getAverageExamScore() == null || s.getAverageExamScore() == null) {
            return 0;
        }
        return  getAverageExamScore().compareTo(s.getAverageExamScore());
    }
}

