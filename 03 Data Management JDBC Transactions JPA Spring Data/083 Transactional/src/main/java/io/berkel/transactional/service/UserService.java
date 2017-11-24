package io.berkel.transactional.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void performSQLQuery01() {

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

    @Transactional
    public void performSQLQuery02() {

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement("INSERT INTO city (Name, CountryCode, District, Population) VALUES (?, ?, ?, ?)");
                ps.setString(1, "Puerto Deseado");
                ps.setString(2, "ARG");
                ps.setString(3, "Santa Cruz");
                ps.setInt(4, 14183);
                return ps;
            }
        });

    }

    @Transactional
    public void performSQLQueries() {

        performSQLQuery01();
        performSQLQuery02();

    }

}
