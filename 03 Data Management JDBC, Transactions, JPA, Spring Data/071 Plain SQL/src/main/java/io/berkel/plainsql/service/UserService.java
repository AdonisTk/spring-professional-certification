package io.berkel.plainsql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.StatementCallback;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void performStatementCallback() {
        jdbcTemplate.execute(new StatementCallback<ResultSet>() {
            @Override
            public ResultSet doInStatement(Statement statement) throws SQLException, DataAccessException {
                ResultSet rs = statement.executeQuery("SELECT * FROM city");
                RowCallbackHandler handler = new RowCallbackHandler() {
                    public void processRow(ResultSet resultSet) throws SQLException {
                        while (resultSet.next()) {
                            System.out.println(resultSet.getObject(2));
                        }
                    }
                };
                handler.processRow(rs);
                return rs;
            }
        });
    }

}
