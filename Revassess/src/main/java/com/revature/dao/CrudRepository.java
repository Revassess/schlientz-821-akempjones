package com.revature.dao;

import java.util.Set;

public interface CrudRepository {
	
	public <T> T save(T t);
	public <T> Set<T>  findAll();
	public <T> T findById(int id);
	public <T> boolean update(T t);
	public boolean deleteById(int id);
	
	

}