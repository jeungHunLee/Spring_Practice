package com.mycompany.Spring_MVC.controller;

import com.mycompany.Spring_MVC.user.UserDAO;
import com.mycompany.Spring_MVC.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class LoginController implements Controller {
    @Autowired
    private UserDAO userDAO;

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        UserVO vo = new UserVO();
        vo.setId(id);
        vo.setPassword(password);

        List<UserVO> user = userDAO.getUser(vo);

        ModelAndView mav = new ModelAndView();

        if(user.isEmpty()) {
            mav.setViewName("login");
        } else {
            mav.setViewName("redirect:getBoardList.do");
        }

        return mav;
    }
}
