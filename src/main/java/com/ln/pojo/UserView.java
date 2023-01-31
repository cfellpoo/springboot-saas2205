package com.ln.pojo;

public class UserView {

    private static final long serialVersionUID = 1L;
    private String id;
    private String username;
    private String loginacct;
    private String userpswd;
    private String email;
    private String createtime;

    public UserView(String id, String username, String loginacct, String userpswd, String email, String createtime) {
        this.id = id;
        this.username = username;
        this.loginacct = loginacct;
        this.userpswd = userpswd;
        this.email = email;
        this.createtime = createtime;
    }

    public UserView() {
    }

    @Override
    public String toString() {
        return "UserView{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", loginacct='" + loginacct + '\'' +
                ", userpswd='" + userpswd + '\'' +
                ", email='" + email + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginacct() {
        return loginacct;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct;
    }

    public String getUserpswd() {
        return userpswd;
    }

    public void setUserpswd(String userpswd) {
        this.userpswd = userpswd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}

