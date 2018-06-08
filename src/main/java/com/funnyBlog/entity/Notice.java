package com.funnyBlog.entity;

/**
 * @ClassName Notice
 * @Author ZhengWeizhi
 * Date 2018/6/8 12:01
 **/
public class Notice {
    private String noticeId;
    private int noticeType;
    private String noticeFromUid;
    private String noticeToUid;
    private String noticeEntity;
    private String noticeStatus;

    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    public int getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(int noticeType) {
        this.noticeType = noticeType;
    }

    public String getNoticeFromUid() {
        return noticeFromUid;
    }

    public void setNoticeFromUid(String noticeFromUid) {
        this.noticeFromUid = noticeFromUid;
    }

    public String getNoticeToUid() {
        return noticeToUid;
    }

    public void setNoticeToUid(String noticeToUid) {
        this.noticeToUid = noticeToUid;
    }

    public String getNoticeEntity() {
        return noticeEntity;
    }

    public void setNoticeEntity(String noticeEntity) {
        this.noticeEntity = noticeEntity;
    }

    public String getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(String noticeStatus) {
        this.noticeStatus = noticeStatus;
    }
}
