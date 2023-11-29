package com.mycompany.Spring_MVC_Annotation.controller;

import com.mycompany.Spring_MVC_Annotation.user.UserDAO;
import com.mycompany.Spring_MVC_Annotation.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value="/login.do", method=RequestMethod.POST)
    public String login(UserVO vo, HttpSession session) {
        List<UserVO> user = userDAO.getUser(vo);

        if(user.isEmpty()) {
            vo.setId("ID를 입력하세요");
            return "login";
        } else {
            session.setAttribute("userId", user.get(0).getId());
            return "redirect:getBoardList.do";
        }
    }

    @RequestMapping(value="/login.do", method=RequestMethod.GET)
    public String loginView() {
        return "login";
    }

    @RequestMapping(value="/logout.do", method=RequestMethod.POST)
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }
}
