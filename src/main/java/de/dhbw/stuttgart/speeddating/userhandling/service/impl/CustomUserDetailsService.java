package de.dhbw.stuttgart.speeddating.userhandling.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import de.dhbw.stuttgart.speeddating.userhandling.service.User;
import de.dhbw.stuttgart.speeddating.userhandling.service.UserRepository;
import de.dhbw.stuttgart.speeddating.userhandling.service.UserRolesRepository;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    private final UserRolesRepository userRolesRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository,
            UserRolesRepository userRolesRepository) {

        this.userRepository = userRepository;
        this.userRolesRepository = userRolesRepository;

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUserName(username);

        if (user == null) {
            throw new UsernameNotFoundException("No user present with username " + username);
        }
        else {
            List<String> userRoles = userRolesRepository.findRoleByUserName(username);
            return new CustomUserDetails(user, userRoles);
        }

    }

}
