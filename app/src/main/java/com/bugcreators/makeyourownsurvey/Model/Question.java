package com.bugcreators.makeyourownsurvey.Model;

public class Question {
    private String itemNumber;
    private String questionText;

    public Question(String itemNumber, String questionText) {
        this.itemNumber = itemNumber;
        this.questionText = questionText;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public String getQuestionText() {
        return questionText;
    }

}
