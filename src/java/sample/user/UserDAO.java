/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sample.utils.DBUtils;

/**
 *
 * @author 84348
 */
public class UserDAO {
    private static final String LOGIN ="SELECT roleID FROM manager WHERE userID=? AND password=?";
    private static final String SEARCH ="SELECT id,name,roleID,hireday,address FROM employee WHERE name like ?";
    public static final String DELETE = "DELETE employee WHERE id=?";
    
    
    public UserDTO checkLogin(String userID,String password) throws SQLException{
        UserDTO user = null;
        Connection con = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try{
            con = DBUtils.getConnection();
            if(con != null){
                ptm = con.prepareStatement(LOGIN);
                ptm.setString(1, userID);
                ptm.setString(2, password);
                rs= ptm.executeQuery();
                if(rs.next()){
                    String roleID= rs.getString("roleID");
                    user = new UserDTO(userID, password, roleID);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(rs != null){
                rs.close();
            }
            if(ptm != null){
                ptm.close();
            }
            if(con != null){
                con.close();
            }
        }
        return user;
    }
    
    public List<UserDTOadmin> getList(String search) throws SQLException{
        List<UserDTOadmin> admin = new ArrayList<>();
        Connection con = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try{
            con = DBUtils.getConnection();
            if(con != null){
                ptm = con.prepareStatement(SEARCH);
                ptm.setString(1,"%" +search + "%");
                rs= ptm.executeQuery();
                while(rs.next()){
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    String roleID = rs.getString("roleID");
                    String hireday = rs.getString("hireday");
                    String address = rs.getString("address");
                    admin.add(new UserDTOadmin(id, name, roleID, hireday, address));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(rs != null){
                rs.close();
            }
            if(ptm != null){
                ptm.close();
            }
            if(con != null){
                con.close();
            }
        }
        return admin;
    }
    
    public boolean delete(String id) throws SQLException{
        boolean check =false;
        Connection con = null;
        PreparedStatement ptm = null;
        try{
            con = DBUtils.getConnection();
            if(con != null){
                ptm = con.prepareStatement(DELETE);
                ptm.setString(1,id);
                check = ptm.executeUpdate()>0?true:false;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            
            if(ptm != null){
                ptm.close();
            }
            if(con != null){
                con.close();
            }
        }
        return check;
    }
    
}
