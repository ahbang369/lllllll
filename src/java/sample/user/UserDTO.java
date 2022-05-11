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
public class UserDTO {
    private String userID;
    private String password;
    private String roleID;

    public UserDTO() {
        this.userID = "";
        this.password = "";
        this.roleID = "";
    }

    public UserDTO(String userID, String password, String roleID) {
        this.userID = userID;
        this.password = password;
        this.roleID = roleID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }
    
    
    
    
}
