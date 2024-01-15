package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {

        Connection connection = DataBaseConnection.getConnection();

        QuestionRepository questionRepository = new QuestionRepository(connection);
        questionRepository.getConnectionByID();

        AnswerRepository answerRepository = new AnswerRepository(connection);
        answerRepository.setQuestionList(questionRepository.getQuestionList());
        answerRepository.getConnectionByID();
        System.out.println("Your result is - " + answerRepository.getCountTrueAnswers() + " / " + answerRepository.countQuestions);
    }

}

