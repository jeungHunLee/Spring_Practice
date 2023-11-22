package com.mycompany.Spring_MVC.controller;

import com.mycompany.Spring_MVC.board.BoardDAO;
import com.mycompany.Spring_MVC.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteController implements Controller {
    @Autowired
    private BoardDAO boardDAO;

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String seq = request.getParameter("seq");
        BoardVO vo = new BoardVO();
        vo.setSeq(Integer.parseInt(seq));

        boardDAO.deleteBoard(vo);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:getBoardList.do");

        return mav;
    }
}
