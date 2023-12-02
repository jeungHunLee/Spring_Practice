package com.mycompany.MyBatisTest.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAO {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public UserVO getUser(UserVO vo) {
        return sqlSessionTemplate.selectOne("DAO.login", vo);
    }
}
