package com.test.springtest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.springtest.service.Movie;
import com.test.springtest.service.MovieDao;

@Controller
public class MovieController {
	@Autowired
	private MovieDao  movieDao;
	@RequestMapping(value="/movieList.do")
	public String movieList(Model model) {
		List<Movie> list = movieDao.seletMovieList();
		model.addAttribute("list", list);
		return "movieList";
	}
	
}
