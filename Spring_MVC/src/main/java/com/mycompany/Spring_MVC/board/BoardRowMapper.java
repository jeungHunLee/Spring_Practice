package com.mycompany.Spring_MVC.board;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardRowMapper implements RowMapper<BoardVO> {
    @Override
    public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
        BoardVO board = new BoardVO();
        board.setSeq(rs.getInt("seq"));
        board.setWriter(rs.getString("writer"));
        board.setTitle(rs.getString("title"));
        board.setContent(rs.getString("content"));
        return board;
    }
}
