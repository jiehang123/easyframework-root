package org.easyframework.blog.controller;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCacheFactoryBean;
import org.springframework.cache.support.SimpleCacheManager;

public class TestDemo {
	public static void main(String[] args) {
		ConcurrentMapCacheFactoryBean bean = new ConcurrentMapCacheFactoryBean();
		ConcurrentMapCacheFactoryBean bean2 = new ConcurrentMapCacheFactoryBean();
		
		SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
		Set<? extends Cache> set = new HashSet();
		simpleCacheManager.setCaches(set);
	}
}
