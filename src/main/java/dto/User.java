package dto;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.roleid
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    private Long roleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.islogin
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    private Boolean islogin;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.roleid
     *
     * @return the value of user.roleid
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    public Long getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.roleid
     *
     * @param roleid the value for user.roleid
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.islogin
     *
     * @return the value of user.islogin
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    public Boolean getIslogin() {
        return islogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.islogin
     *
     * @param islogin the value for user.islogin
     *
     * @mbggenerated Wed Sep 21 20:13:51 CST 2016
     */
    public void setIslogin(Boolean islogin) {
        this.islogin = islogin;
    }
}