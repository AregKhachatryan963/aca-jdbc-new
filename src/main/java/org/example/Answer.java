package org.example;

public class Answer {
    int id;
    int answerValue;
    int question_ID;
    public Answer(int id, int answerValue, int question_ID){
        this.id = id;
        this.answerValue = answerValue;
        this.question_ID = question_ID;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getQuestion_ID() {
        return question_ID;
    }

    public void setQuestion_ID(int question_ID) {
        this.question_ID = question_ID;
    }

    public int getAnswerValue() {
        return answerValue;
    }

    public void setAnswerValue(int answerValue) {
        this.answerValue = answerValue;
    }
}
