package com.mycompany.MyBatisTest.controller;

import com.mycompany.MyBatisTest.user.UserDAO;
import com.mycompany.MyBatisTest.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value="login.do", method=RequestMethod.POST)
    public String login(UserVO vo) {
        UserVO user = userDAO.getUser(vo);
        if(user == null) {
            return "login";
        } else {
            return "redirect:getBoardList.do";
        }
    }

    @RequestMapping(value="login.do", method=RequestMethod.GET)
    public String loginView() {
        return "login";
    }

    @RequestMapping("/logout.do")
    public String logout(HttpSession sess) {
        sess.invalidate();
        return "login";
    }
}
