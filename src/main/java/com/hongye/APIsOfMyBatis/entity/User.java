package com.hongye.APIsOfMyBatis.entity;

/**
 * The type User.
 *
 * @author 竑也
 */
public class User {
    private String username;
    private String password;
    private String id;
    private String registration_time;

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets registration time.
     *
     * @return the registration time
     */
    public String getRegistration_time() {
        return registration_time;
    }

    /**
     * Sets registration time.
     *
     * @param registration_time the registration time
     */
    public void setRegistration_time(String registration_time) {
        this.registration_time = registration_time;
    }

    @Override
    public String toString() {
        return "User{"+"id="+id+
                "，username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", registration_time="+registration_time+'}';
    }
}
