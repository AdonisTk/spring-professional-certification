package io.berkel.callback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void someUserService() {
            jdbcTemplate.query("select first_name from customer", new RowCallbackHandler() {
                @Override
                public void processRow(ResultSet resultSet) throws SQLException {

                }
            });
    }

}
