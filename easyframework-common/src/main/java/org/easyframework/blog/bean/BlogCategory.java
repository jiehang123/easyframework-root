package org.easyframework.blog.bean;

import java.io.Serializable;
import java.util.Date;

public class BlogCategory implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6420648669441251494L;
	
	private String name;
	private String descript;
	private Date createdAt;
	private Integer count;
	
	public BlogCategory() {
		super();
	}
	public BlogCategory(String name, String descript, Date createdAt) {
		super();
		this.name = name;
		this.descript = descript;
		this.createdAt = createdAt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "BlogCategory [name=" + name + ", descript=" + descript + ", createdAt=" + createdAt + ", count=" + count
				+ "]";
	}
	
}
