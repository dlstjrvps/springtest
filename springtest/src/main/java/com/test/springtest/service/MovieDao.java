package com.test.springtest.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDao {
	@Autowired
	private SqlSessionTemplate sst;
	public List<Movie> seletMovieList(){
		return sst.selectList("com.test.springtest.service.MovieMapper.selectMovieList");
	}
}
