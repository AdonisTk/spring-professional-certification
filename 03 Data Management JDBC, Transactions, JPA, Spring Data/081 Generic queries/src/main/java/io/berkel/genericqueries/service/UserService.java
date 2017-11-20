package io.berkel.genericqueries.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void performRowCallbackHandler() {
        jdbcTemplate.query("SELECT Name FROM city ORDER BY ID", new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                while (resultSet.next()) {
                    System.out.println(resultSet.getString(1));
                }
            }
        });
    }

}
