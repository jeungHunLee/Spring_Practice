package com.mycompany.Spring_MVC.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("boardDAO")
public class BoardDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<BoardVO> getBoardList() {
        String BOARD_LIST = "select * from webboard order by seq desc";
        return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
    }

    public BoardVO getBoard(BoardVO vo) {
        String GET_BOARD = "select * FROM webboard where seq=?";
        Object[] args = { vo.getSeq() };
        return jdbcTemplate.queryForObject(GET_BOARD, args, new BoardRowMapper());
    }

    public void insertBoard(BoardVO vo) {
        String INSERT_BOARD = "insert into webboard (writer, title, content) values(?, ?, ?)";
        Object[] args = { vo.getWriter(), vo.getTitle(), vo.getContent() };
        jdbcTemplate.update(INSERT_BOARD, args);
    }

    public void updateBoard(BoardVO vo) {
        String UDATE_BOARD = "update webboard set title=?, content=? where seq=?";
        jdbcTemplate.update(UDATE_BOARD, vo.getTitle(), vo.getContent(), vo.getSeq());
    }
}
