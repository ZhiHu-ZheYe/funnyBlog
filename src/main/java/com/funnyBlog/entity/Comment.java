package com.funnyBlog.entity;

import java.util.Date;

/**
 * @ClassName comment
 * @Author ZhengWeizhi
 * Date 2018/6/8 11:48
 **/
public class Comment {
    private String commentId;
    private String commentContent;
    private String commentAid;
    private String commentUid;
    private Date commentTime;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentAid() {
        return commentAid;
    }

    public void setCommentAid(String commentAid) {
        this.commentAid = commentAid;
    }

    public String getCommentUid() {
        return commentUid;
    }

    public void setCommentUid(String commentUid) {
        this.commentUid = commentUid;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}
