package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class AnswerRepository extends Repository{
    ArrayList<Question> questionList;
    ArrayList<Answer> answerList = new ArrayList<>();
    Scanner scanner;
    int countQuestions;
    int countTrueAnswers;
    public AnswerRepository(Connection connection) throws SQLException {
        super(connection);
        scanner = new Scanner(System.in);
    }
    public void setQuestionList(ArrayList<Question> questionList){
        this.questionList = questionList;
    }
    public void getConnectionByID() throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS answers (id INT, answer_value INT, question_ID INT)");
        for (Question question: questionList){
            countQuestions++;
            System.out.println(question.getId() + ". " + question.getQuestion());
            System.out.println("Enter answer: ");
            int value = scanner.nextInt();
            Answer answer = new Answer(question.getId(), value, question.getId());
            answerList.add(answer);
            if(question.getRightNumber() == value){
                countTrueAnswers++;
            }
            statement.executeUpdate("INSERT INTO answers VALUES (" + answer.getId() + ", " +
                    answer.getAnswerValue() + ", " + answer.getQuestion_ID() + ")");
        }

//        ResultSet resultSetQuestion = statement.executeQuery("SELECT * FROM question");
//        while (resultSetQuestion.next()){
//            String value = resultSetQuestion.getString("label");
//            int question_ID = resultSetQuestion.getInt("id");
//            System.out.println(value + " | " + question_ID);
//        }

    }

    public int getCountQuestions() {
        return countQuestions;
    }

    public int getCountTrueAnswers() {
        return countTrueAnswers;
    }
}
