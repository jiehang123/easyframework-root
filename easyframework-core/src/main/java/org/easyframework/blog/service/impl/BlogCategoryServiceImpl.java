package org.easyframework.blog.service.impl;

import java.util.List;

import org.easyframework.blog.bean.BlogCategory;
import org.easyframework.blog.dao.BlogCategoryDao;
import org.easyframework.blog.service.BlogCategoryService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public class BlogCategoryServiceImpl implements BlogCategoryService {
	
	private BlogCategoryDao blogCategoryDao;
	public BlogCategoryDao getBlogCategoryDao() {
		return blogCategoryDao;
	}
	public void setBlogCategoryDao(BlogCategoryDao blogCategoryDao) {
		this.blogCategoryDao = blogCategoryDao;
	}
	
	@Override
	@Cacheable(value="book")
	public List<BlogCategory> queryBlogCategory() {
		return blogCategoryDao.queryBlogCategory();
	}
	@Override
	@CacheEvict(value="book", allEntries=true)
	public void addBlogCategory(BlogCategory blogCategory) {
		blogCategoryDao.addBlogCategory(blogCategory);
	}
	@Override
	@CacheEvict(value="book", allEntries=true)
	public void updateBlogCategory(BlogCategory blogCategory) {
		blogCategoryDao.updateBlogCategory(blogCategory);
	}
	@Override
	@Cacheable(value="book")
	public BlogCategory queryBlogCategoryById(String id) {
		return blogCategoryDao.queryBlogCategoryById(id);
	}

}
