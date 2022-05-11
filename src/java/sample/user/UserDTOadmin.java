/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.user;

/**
 *
 * @author 84348
 */
public class UserDTOadmin {
    private String id;
    private String name;
    private String roleID;
    private String hireday;
    private String address;

    public UserDTOadmin() {
        this.id = "";
        this.name = "";
        this.roleID = "";
        this.hireday = "";
        this.address = "";
    }

    public UserDTOadmin(String id, String name, String roleID, String hireday, String address) {
        this.id = id;
        this.name = name;
        this.roleID = roleID;
        this.hireday = hireday;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getHireday() {
        return hireday;
    }

    public void setHireday(String hireday) {
        this.hireday = hireday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
