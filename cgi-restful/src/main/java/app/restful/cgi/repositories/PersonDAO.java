package app.restful.cgi.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface PersonDAO extends CrudRepository<Person,Long> {
   
	@Query("from Person where sno=:sno")
	public Person getPerson(@Param("sno") int sno);
}
