package org.example;

public class Question {
    int id;
    String question;
    int rightNumber;

    public Question(int id, String question, int rightNumber) {
        this.id = id;
        this.question = question;
        this.rightNumber = rightNumber;
    }

    public int getId() {
        return id;
    }
    public String getQuestion() {
        return question;
    }
    public int getRightNumber() {
        return rightNumber;
    }
}
