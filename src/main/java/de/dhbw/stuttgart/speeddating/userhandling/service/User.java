package de.dhbw.stuttgart.speeddating.userhandling.service;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    private Long userId;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "enabled")
    private boolean enabled;

    public User() {

    }

    public User(User user) {

        this.userId = user.userId;
        this.userName = user.userName;
        this.password = user.password;
        this.enabled = user.enabled;
        this.email = user.email;
    }

    public Long getUserId() {
    
        return userId;
    }

    public void setUserId(Long userId) {
    
        this.userId = userId;
    }

    public String getUsername() {

        return this.userName;

    }

    public void setUsername(String username) {
    
        this.userName = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
    
        this.password = password;
    }

    public String getEmail() {
    
        return email;
    }

    public void setEmail(String email) {
    
        this.email = email;
    }

    public boolean isEnabled() {

        return enabled;
    }

    
    public void setEnabled(boolean enabled) {
    
        this.enabled = enabled;
    }
}
