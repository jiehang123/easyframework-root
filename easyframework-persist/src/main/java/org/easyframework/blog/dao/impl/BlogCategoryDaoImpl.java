package org.easyframework.blog.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.easyframework.blog.bean.BlogCategory;
import org.easyframework.blog.dao.BlogCategoryDao;
import org.easyframework.mapping.utils.ResultSetHelper;
import org.easyframework.mapping.utils.ResultSetMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class BlogCategoryDaoImpl extends JdbcDaoSupport implements BlogCategoryDao{
	
	private static final String QUERY_CATEGORY_SQL = "select * from blog_category limit 0, 5";
	
	@Override
	public List<BlogCategory> queryBlogCategory() {
		List<BlogCategory> blogCategoryList = this.getJdbcTemplate().query(QUERY_CATEGORY_SQL, new RowMapper<BlogCategory>() {
            public BlogCategory mapRow(ResultSet resultset, int i) throws SQLException {
                return (new BlogCategoryMapper()).mapResultSet(resultset, i);
            }
        });
		
		System.out.println("query all");
        return blogCategoryList;
	}
	
	@Override
	public void addBlogCategory(BlogCategory blogCategory) {
		System.out.println("insert into...");
	}
	
	@Override
	public void updateBlogCategory(BlogCategory blogCategory) {
		System.out.println("update BlogCategory...");
	}
	
	@Override
	public BlogCategory queryBlogCategoryById(String id) {
		System.out.println("query By Id...");
		return null;
	}
	
	class BlogCategoryMapper extends ResultSetHelper implements ResultSetMapper {
        public BlogCategory mapResultSet(ResultSet resultSet, int i)
                throws SQLException {
            BlogCategory blogCategory = new BlogCategory();
            blogCategory.setName(getString(resultSet, "NAME"));
            blogCategory.setDescript(getString(resultSet, "DESCRIPT"));
            blogCategory.setCreatedAt(getTimestamp(resultSet, "CREATED_AT"));
            blogCategory.setCount(getInt(resultSet, "COUNT"));
            return blogCategory;
        }
    }


}
