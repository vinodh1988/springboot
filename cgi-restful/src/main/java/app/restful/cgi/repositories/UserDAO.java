package app.restful.cgi.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserDAO extends CrudRepository<User, Long>{
  @Query("from User where user=:user")
	public User findByName(@Param("user") String name);
}
