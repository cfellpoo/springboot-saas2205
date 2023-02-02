package com.ln.pojo;

import java.util.ArrayList;
import java.util.List;

public class PermisssionView {
    private Integer id;
    private Integer pid;
    private String name;
    private String icon;
    private String url;
    private boolean open=true;
    private boolean checked=false;
    List<PermisssionView> children=new ArrayList<>();


    @Override
    public String toString() {
        return "PermisssionView{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", url='" + url + '\'' +
                ", open=" + open +
                ", checked=" + checked +
                ", children=" + children +
                '}';
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public List<PermisssionView> getChildren() {
        return children;
    }

    public void setChildren(List<PermisssionView> children) {
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public PermisssionView(Integer id, Integer pid, String name, String icon, String url) {
        this.id = id;
        this.pid = pid;
        this.name = name;
        this.icon = icon;
        this.url = url;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PermisssionView(Integer id, Integer pid, String name, String icon, String url, boolean open, boolean checked, List<PermisssionView> children) {
        this.id = id;
        this.pid = pid;
        this.name = name;
        this.icon = icon;
        this.url = url;
        this.open = open;
        this.checked = checked;
        this.children = children;
    }

    public PermisssionView() {
    }
}
