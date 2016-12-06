package edu.iss.caps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.iss.caps.model.Hero;


public interface HeroRepository extends JpaRepository<Hero, String> {
	
	@Query("SELECT h from Hero h WHERE h.name = :name AND h.descriptio = :desc")
	ArrayList<Hero> findCoursesByEID(@Param("name") String name, @Param("desc") String desc);
	
	
	
}
