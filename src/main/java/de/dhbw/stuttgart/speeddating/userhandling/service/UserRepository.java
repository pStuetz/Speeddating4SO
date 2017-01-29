package de.dhbw.stuttgart.speeddating.userhandling.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    public User findByUserName(String userName);
}
