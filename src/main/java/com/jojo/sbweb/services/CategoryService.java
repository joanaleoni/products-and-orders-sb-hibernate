package com.jojo.sbweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jojo.sbweb.entities.Category;
import com.jojo.sbweb.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired 
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> category = repository.findById(id);
		return category.get();
	}
}