package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QuestionRepository extends Repository {

    public QuestionRepository(Connection connection) {
        super(connection);
    }
    public ArrayList<Question> questionList = new ArrayList<>();
    public void getConnectionByID() throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS questions (id INT, question VARCHAR(100), rightNumber INT)");
//        statement.executeUpdate("INSERT INTO questions VALUES (1, 'first question - 1, 2, 3', 1), (2, 'second question - 1, 2, 3', 3), (3, 'third question - 1, 2, 3', 1)");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM questions");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String question = resultSet.getString("question");
            int rightNumber = resultSet.getInt("rightNumber");
            System.out.println(id + " | " + question);
            questionList.add(new Question(id, question, rightNumber));
        }
    }
    public ArrayList<Question> getQuestionList() {
        return questionList;
    }
}
