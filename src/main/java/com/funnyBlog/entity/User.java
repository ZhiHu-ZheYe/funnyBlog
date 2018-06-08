package com.funnyBlog.entity;

/**
 * @ClassName user
 * @Author ZhengWeizhi
 * Date 2018/6/8 11:20
 **/
public class User {
    private String userId;
    private String userName;
    private String userIcon;
    private String userSex;
    private String userAccount;
    private String userPassword;
    private String userEmail;
    private String userFollowing;
    private String userFollowed;

    private String followingUid;
    private String followedUid;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserFollowing() {
        return userFollowing;
    }

    public void setUserFollowing(String userFollowing) {
        this.userFollowing = userFollowing;
    }

    public String getUserFollowed() {
        return userFollowed;
    }

    public void setUserFollowed(String userFollowed) {
        this.userFollowed = userFollowed;
    }

    public String getFollowingUid() {
        return followingUid;
    }

    public void setFollowingUid(String followingUid) {
        this.followingUid = followingUid;
    }

    public String getFollowedUid() {
        return followedUid;
    }

    public void setFollowedUid(String followedUid) {
        this.followedUid = followedUid;
    }
}
