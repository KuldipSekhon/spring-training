/**
 * 
 */
package com.sivalabs.springtraining;

import java.util.List;

/**
 * @author Siva
 *
 */
public interface UserDao {

	public List<User> findAll();
	
	public User create(User user);
	
	public User findUserById(int id);
	
}
