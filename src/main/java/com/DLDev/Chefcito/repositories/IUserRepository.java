package com.DLDev.Chefcito.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DLDev.Chefcito.entities.User;

@Repository("userRepository")
public interface IUserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String email);
	
}