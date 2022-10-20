package com.estudy.apirest.data.vo.v2;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class PersonVOV2 implements Serializable {
    private static final long serialVersionUID = 1L;


    private Long id;
    private String fistName;
    private String lastName;
    private String address;
    private String gender;
    private Date birthday;

    public PersonVOV2() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonVOV2 personVOV2 = (PersonVOV2) o;
        return Objects.equals(id, personVOV2.id) && Objects.equals(fistName, personVOV2.fistName) && Objects.equals(lastName, personVOV2.lastName) && Objects.equals(address, personVOV2.address) && Objects.equals(gender, personVOV2.gender) && Objects.equals(birthday, personVOV2.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fistName, lastName, address, gender, birthday);
    }
}
