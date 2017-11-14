package io.berkel.callback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

    public  void performPreparedStatementCreator() {
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement("INSERT INTO city (Name, CountryCode, District, Population) VALUES (?, ?, ?, ?)");
                ps.setString(1, "Victoria");
                ps.setString(2, "ARG");
                ps.setString(3, "Buenos Aires");
                ps.setInt(4, 39447);
                return ps;
            }
        });
    }

}
