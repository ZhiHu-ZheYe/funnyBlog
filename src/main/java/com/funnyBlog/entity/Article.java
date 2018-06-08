package com.funnyBlog.entity;

import java.util.Date;

/**
 * @ClassName article
 * @Author ZhengWeizhi
 * Date 2018/6/8 11:30
 **/
public class Article {
    private String articleId;
    private String articleTitle;
    private Date articleTime;
    private String articleSummary;
    private String articleUid;
    private String articleUname;
    private String articleIcon;
    private int articleComment;
    private int articlepUvote;

    private String articleContent;


    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Date getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Date articleTime) {
        this.articleTime = articleTime;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
    }

    public String getArticleUid() {
        return articleUid;
    }

    public void setArticleUid(String articleUid) {
        this.articleUid = articleUid;
    }

    public String getArticleUname() {
        return articleUname;
    }

    public void setArticleUname(String articleUname) {
        this.articleUname = articleUname;
    }

    public String getArticleIcon() {
        return articleIcon;
    }

    public void setArticleIcon(String articleIcon) {
        this.articleIcon = articleIcon;
    }

    public int getArticleComment() {
        return articleComment;
    }

    public void setArticleComment(int articleComment) {
        this.articleComment = articleComment;
    }

    public int getArticlepUvote() {
        return articlepUvote;
    }

    public void setArticlepUvote(int articlepUvote) {
        this.articlepUvote = articlepUvote;
    }


    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}

