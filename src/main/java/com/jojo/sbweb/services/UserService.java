package com.jojo.sbweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jojo.sbweb.entities.User;
import com.jojo.sbweb.repositories.UserRepository;
import com.jojo.sbweb.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired 
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = repository.findById(id);
		return user.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User upadte(Long id, User user) {
		User entity = repository.getReferenceById(id);
	    updateData(entity, user);
	    return repository.save(entity);
	}
	
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}