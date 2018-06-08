package com.funnyBlog.entity;

/**
 * @ClassName Reply
 * @Author ZhengWeizhi
 * Date 2018/6/8 11:51
 **/
public class Reply {
    private String ReplyId;
    private String ReplyToId;
    private String commentId;
    private String replyType;
    private String replyContent;
    private String fromUid;
    private String toUid;
    private String fromUname;
    private String toUname;

    public String getReplyId() {
        return ReplyId;
    }

    public void setReplyId(String replyId) {
        ReplyId = replyId;
    }

    public String getReplyToId() {
        return ReplyToId;
    }

    public void setReplyToId(String replyToId) {
        ReplyToId = replyToId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getReplyType() {
        return replyType;
    }

    public void setReplyType(String replyType) {
        this.replyType = replyType;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getFromUid() {
        return fromUid;
    }

    public void setFromUid(String fromUid) {
        this.fromUid = fromUid;
    }

    public String getToUid() {
        return toUid;
    }

    public void setToUid(String toUid) {
        this.toUid = toUid;
    }

    public String getFromUname() {
        return fromUname;
    }

    public void setFromUname(String fromUname) {
        this.fromUname = fromUname;
    }

    public String getToUname() {
        return toUname;
    }

    public void setToUname(String toUname) {
        this.toUname = toUname;
    }
}
