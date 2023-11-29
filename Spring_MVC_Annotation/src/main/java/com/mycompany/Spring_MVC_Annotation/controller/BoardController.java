package com.mycompany.Spring_MVC_Annotation.controller;

import com.mycompany.Spring_MVC_Annotation.board.BoardDAO;
import com.mycompany.Spring_MVC_Annotation.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private BoardDAO boardDAO;

    @RequestMapping(value="/getBoardList")
    public String getBoardList(Model model) {
        List<BoardVO> boardList = boardDAO.getBoardList();
        model.addAttribute("boardList", boardList);
        return "boardList";
    }

    @RequestMapping(value="/getBoard.do")
    public String getBoard(BoardVO vo, Model model) {
        BoardVO board = boardDAO.getBoard(vo);
        model.addAttribute("board", board);
        return "boardContent";
    }

    @RequestMapping(value="/updateBoardForm.do")
    public String updateBoardForm(BoardVO vo, Model model) {
        BoardVO board = boardDAO.getBoard(vo);
        model.addAttribute("board", board);
        return "updateBoardForm";
    }

    @RequestMapping("/updateBoard.do")
    public String updateBoard(BoardVO vo, Model model) {
        boardDAO.updateBoard(vo);
        BoardVO board = boardDAO.getBoard(vo);
        model.addAttribute("board", board);
        return "boardContent";
    }

    @RequestMapping("/insertBoardForm.do")
    public String insertBoardForm() {
        return "insertBoard";
    }

    @RequestMapping("/insertBoard.do")
    public String insertBoard(BoardVO vo, Model model) {
        boardDAO.insertBoard(vo);
        List<BoardVO> boardList = boardDAO.getBoardList();
        model.addAttribute("boardList", boardList);

        return "boardList";
    }

    @RequestMapping("/deleteBoard.do")
    public String deleteBoard(BoardVO vo, Model model) {
        boardDAO.deleteBoard(vo);
        List<BoardVO> boardList = boardDAO.getBoardList();
        model.addAttribute("boardList", boardList);

        return "boardList";
    }
}
