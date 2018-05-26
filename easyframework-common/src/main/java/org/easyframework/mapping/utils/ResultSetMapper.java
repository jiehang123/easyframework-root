package org.easyframework.mapping.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultSetMapper {
	public abstract Object mapResultSet(ResultSet resultSet, int i) throws SQLException;
}