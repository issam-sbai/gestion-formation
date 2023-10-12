package com.codingtech.gestionformation.security.dao2;




import com.codingtech.gestionformation.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;





public interface IUserDao extends JpaRepository<User, Integer> {
	
	
	public User findByUsername(String username);

}
