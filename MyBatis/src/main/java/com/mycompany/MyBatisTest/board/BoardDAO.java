package com.mycompany.MyBatisTest.board;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("boardDAO")
public class BoardDAO {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List<BoardVO> getBoardList() {
        return sqlSessionTemplate.selectList("DAO.getBoardList");
    }

    public BoardVO getBoard(BoardVO vo) {
        return sqlSessionTemplate.selectOne("DAO.getBoard", vo);
    }


    public void insertBoard(BoardVO vo) {
        sqlSessionTemplate.insert("DAO.insertBoard", vo);
    }

    public void updateBoard(BoardVO vo) {
        sqlSessionTemplate.update("DAO.updateBoard", vo);
    }

    public void deleteBoard(BoardVO vo) {
        sqlSessionTemplate.delete("DAO.deleteBoard", vo);
    }
}
