package com.green.First;

public class Board {
    private int num;
    private String title;
    private String writer;
    private int views;
    private String boardInfo;

    public Board(int num, String title, String writer, int views, String boardInfo) {
        this.num = num;
        this.title = title;
        this.writer = writer;
        this.views = views;
        this.boardInfo = boardInfo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getBoardInfo() {
        return boardInfo;
    }

    public void setBoardInfo(String boardInfo) {
        this.boardInfo = boardInfo;
    }
}
