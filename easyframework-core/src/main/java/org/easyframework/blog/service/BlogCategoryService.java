package org.easyframework.blog.service;

import java.util.List;

import org.easyframework.blog.bean.BlogCategory;

public interface BlogCategoryService {
	
	public List<BlogCategory> queryBlogCategory();
	
	public void addBlogCategory(BlogCategory blogCategory);
	
	public void updateBlogCategory(BlogCategory blogCategory);
	
	public BlogCategory queryBlogCategoryById(String id);
	
}
