package com.link.entity;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.id
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.name
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.class
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    private String class;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.gender
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.major
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    private String major;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.score
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    private Integer score;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.id
     *
     * @return the value of student.id
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.id
     *
     * @param id the value for student.id
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.name
     *
     * @return the value of student.name
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.name
     *
     * @param name the value for student.name
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.class
     *
     * @return the value of student.class
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    public String getClass() {
        return class;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.class
     *
     * @param class the value for student.class
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    public void setClass(String class) {
        this.class = class == null ? null : class.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.gender
     *
     * @return the value of student.gender
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.gender
     *
     * @param gender the value for student.gender
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.major
     *
     * @return the value of student.major
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    public String getMajor() {
        return major;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.major
     *
     * @param major the value for student.major
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.score
     *
     * @return the value of student.score
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.score
     *
     * @param score the value for student.score
     *
     * @mbg.generated Fri Jul 22 10:09:21 CST 2022
     */
    public void setScore(Integer score) {
        this.score = score;
    }
}