package com.mycompany.Spring_MVC.board;

public class BoardVO {
    private int seq;
    private String writer;
    private String title;
    private String content;

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSeq() {
        return seq;
    }

    public String getWriter() {
        return writer;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
