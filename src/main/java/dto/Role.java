package dto;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbggenerated Sun Aug 28 19:34:11 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.rolename
     *
     * @mbggenerated Sun Aug 28 19:34:11 CST 2016
     */
    private String rolename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.rolepower
     *
     * @mbggenerated Sun Aug 28 19:34:11 CST 2016
     */
    private Integer rolepower;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbggenerated Sun Aug 28 19:34:11 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     *
     * @mbggenerated Sun Aug 28 19:34:11 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.rolename
     *
     * @return the value of role.rolename
     *
     * @mbggenerated Sun Aug 28 19:34:11 CST 2016
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.rolename
     *
     * @param rolename the value for role.rolename
     *
     * @mbggenerated Sun Aug 28 19:34:11 CST 2016
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.rolepower
     *
     * @return the value of role.rolepower
     *
     * @mbggenerated Sun Aug 28 19:34:11 CST 2016
     */
    public Integer getRolepower() {
        return rolepower;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.rolepower
     *
     * @param rolepower the value for role.rolepower
     *
     * @mbggenerated Sun Aug 28 19:34:11 CST 2016
     */
    public void setRolepower(Integer rolepower) {
        this.rolepower = rolepower;
    }
}