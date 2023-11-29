package com.mycompany.Spring_MVC_Annotation.board;

import com.mycompany.Spring_MVC_Annotation.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("boardDAO")
public class BoardDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<BoardVO> getBoardList() {
        String GET_BOAORD_LIST = "select * from webboard order by seq desc";
        return jdbcTemplate.query(GET_BOAORD_LIST, new BoardRowMapper());
    }

    public BoardVO getBoard(BoardVO vo) {
        String GET_BOARD = "select * from webboard where seq=?";
        Object[] args = { vo.getSeq() };
        return jdbcTemplate.queryForObject(GET_BOARD, args, new BoardRowMapper());
    }

    public void updateBoard(BoardVO vo) {
        String UPDATE_BOARD = "update webboard set title=?, content=? where seq=?";
        jdbcTemplate.update(UPDATE_BOARD, vo.getTitle(), vo.getContent(), vo.getSeq());
    }

    public void insertBoard(BoardVO vo) {
        String INSERT_BOARD = "insert into webboard (writer, title, content) values (?, ?, ?)";
        jdbcTemplate.update(INSERT_BOARD, vo.getWriter(), vo.getTitle(), vo.getContent());
    }

    public void deleteBoard(BoardVO vo) {
        String DELETE_BOARD = "delete from webboard where seq=?";
        jdbcTemplate.update(DELETE_BOARD, vo.getSeq());
    }

    class BoardRowMapper implements RowMapper<BoardVO> {
        public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
            BoardVO board = new BoardVO();
            board.setSeq(rs.getInt("seq"));
            board.setContent(rs.getString("content"));
            board.setWriter(rs.getString("writer"));
            board.setTitle(rs.getString("title"));

            return board;
        }
    }
}
