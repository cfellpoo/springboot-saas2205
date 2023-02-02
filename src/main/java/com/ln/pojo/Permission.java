package com.ln.pojo;

import java.util.ArrayList;
import java.util.List;

public class Permission {
private String id;
private String name;
private String pid;
private String url;
private String icon;
private boolean open=true;
private boolean checked=false;
List<Permission> children=new ArrayList<>();

public boolean isChecked() {
	return checked;
}

	@Override
	public String toString() {
		return "Permission{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", pid='" + pid + '\'' +
				", url='" + url + '\'' +
				", icon='" + icon + '\'' +
				", open=" + open +
				", checked=" + checked +
				", children=" + children +
				'}';
	}

	public Permission() {
	}

	public Permission(String id, String name, String pid, String url, String icon, boolean open, boolean checked, List<Permission> children) {
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.url = url;
		this.icon = icon;
		this.open = open;
		this.checked = checked;
		this.children = children;
	}

	public void setChecked(boolean checked) {
	this.checked = checked;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public boolean isOpen() {
	return open;
}
public void setOpen(boolean open) {
	this.open = open;
}
public List<Permission> getChildren() {
	return children;
}
public void setChildren(List<Permission> children) {
	this.children = children;
}
public String getIcon() {
	return icon;
}
public void setIcon(String icon) {
	this.icon = icon;
}

}
