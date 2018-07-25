/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.hrdb.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class EmployeeListOfDeptId4Response implements Serializable {


    @JsonProperty("STATE")
    @ColumnAlias("STATE")
    private String state;

    @JsonProperty("NAME")
    @ColumnAlias("NAME")
    private String name;

    @JsonProperty("BIRTHDATE")
    @ColumnAlias("BIRTHDATE")
    private Date birthdate;

    @JsonProperty("TENANTID")
    @ColumnAlias("TENANTID")
    private Integer tenantid;

    @JsonProperty("EID")
    @ColumnAlias("EID")
    private Integer eid;

    @JsonProperty("STREET")
    @ColumnAlias("STREET")
    private String street;

    @JsonProperty("MANAGERID")
    @ColumnAlias("MANAGERID")
    private Integer managerid;

    @JsonProperty("PICURL")
    @ColumnAlias("PICURL")
    private String picurl;

    @JsonProperty("FIRSTNAME")
    @ColumnAlias("FIRSTNAME")
    private String firstname;

    @JsonProperty("ZIP")
    @ColumnAlias("ZIP")
    private String zip;

    @JsonProperty("CITY")
    @ColumnAlias("CITY")
    private String city;

    @JsonProperty("DEPTID")
    @ColumnAlias("DEPTID")
    private Integer deptid;

    @JsonProperty("JOBTITLE")
    @ColumnAlias("JOBTITLE")
    private String jobtitle;

    @JsonProperty("LASTNAME")
    @ColumnAlias("LASTNAME")
    private String lastname;

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getTenantid() {
        return this.tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public Integer getEid() {
        return this.eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getManagerid() {
        return this.managerid;
    }

    public void setManagerid(Integer managerid) {
        this.managerid = managerid;
    }

    public String getPicurl() {
        return this.picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getDeptid() {
        return this.deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getJobtitle() {
        return this.jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeListOfDeptId4Response)) return false;
        final EmployeeListOfDeptId4Response employeeListOfDeptId4response = (EmployeeListOfDeptId4Response) o;
        return Objects.equals(getState(), employeeListOfDeptId4response.getState()) &&
                Objects.equals(getName(), employeeListOfDeptId4response.getName()) &&
                Objects.equals(getBirthdate(), employeeListOfDeptId4response.getBirthdate()) &&
                Objects.equals(getTenantid(), employeeListOfDeptId4response.getTenantid()) &&
                Objects.equals(getEid(), employeeListOfDeptId4response.getEid()) &&
                Objects.equals(getStreet(), employeeListOfDeptId4response.getStreet()) &&
                Objects.equals(getManagerid(), employeeListOfDeptId4response.getManagerid()) &&
                Objects.equals(getPicurl(), employeeListOfDeptId4response.getPicurl()) &&
                Objects.equals(getFirstname(), employeeListOfDeptId4response.getFirstname()) &&
                Objects.equals(getZip(), employeeListOfDeptId4response.getZip()) &&
                Objects.equals(getCity(), employeeListOfDeptId4response.getCity()) &&
                Objects.equals(getDeptid(), employeeListOfDeptId4response.getDeptid()) &&
                Objects.equals(getJobtitle(), employeeListOfDeptId4response.getJobtitle()) &&
                Objects.equals(getLastname(), employeeListOfDeptId4response.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getState(),
                getName(),
                getBirthdate(),
                getTenantid(),
                getEid(),
                getStreet(),
                getManagerid(),
                getPicurl(),
                getFirstname(),
                getZip(),
                getCity(),
                getDeptid(),
                getJobtitle(),
                getLastname());
    }
}