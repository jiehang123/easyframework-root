package org.easyframework.blog.controller;

import java.util.List;

import org.easyframework.blog.bean.BlogCategory;
import org.easyframework.blog.service.BlogCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogCategoryController {
	
	@Autowired
	public BlogCategoryService blogCategoryService;
	
	@RequestMapping(value="/getList")
	public void queryBlogCategory() {
		List<BlogCategory> list = blogCategoryService.queryBlogCategory();
		System.out.println(list);
	}
	@RequestMapping(value="/updateBlog")
	public void updateBlogCategory() {
		blogCategoryService.updateBlogCategory(new BlogCategory());
	}
	@RequestMapping(value="/getBlog")
	public void queryBlogCategoryById() {
		BlogCategory blogCategory = blogCategoryService.queryBlogCategoryById("3");
		System.out.println(blogCategory);
	}
	@RequestMapping(value="/addBlog")
	public void addBlogCategory() {
		blogCategoryService.addBlogCategory(new BlogCategory());
	}

	public BlogCategoryService getBlogCategoryService() {
		return blogCategoryService;
	}

	public void setBlogCategoryService(BlogCategoryService blogCategoryService) {
		this.blogCategoryService = blogCategoryService;
	}
	
}
