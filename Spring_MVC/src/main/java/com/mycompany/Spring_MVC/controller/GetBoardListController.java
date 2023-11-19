package com.mycompany.Spring_MVC.controller;

import com.mycompany.Spring_MVC.board.BoardDAO;
import com.mycompany.Spring_MVC.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class GetBoardListController implements Controller {
    @Autowired
    private BoardDAO boardDAO;

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<BoardVO> boardList = boardDAO.getBoardList();

        ModelAndView mav = new ModelAndView();
        mav.setViewName("boardList");
        mav.addObject("boardList", boardList);

        return mav;
    }
}
