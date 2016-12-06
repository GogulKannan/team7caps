package edu.iss.caps.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.iss.caps.trash.Hero;
import edu.iss.caps.trash.HeroRepository;

@Service
public class HeroServiceImpl implements HeroService {
	@Resource
	private HeroRepository heroRepository;
	
	/* (non-Javadoc)
	 * @see edu.iss.caps.service.HeroService#findAllHeros()
	 */
	@Override
	@Transactional
	public ArrayList<Hero> findAllHeros() {
		ArrayList<Hero> hlist = (ArrayList<Hero>) heroRepository.findAll();
		return hlist;
	}
}
