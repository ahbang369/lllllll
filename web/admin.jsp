<%-- 
    Document   : admin
    Created on : Mar 18, 2022, 8:17:08 PM
    Author     : 84348
--%>

<%@page import="java.util.List"%>
<%@page import="sample.user.UserDTOadmin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <form action="MainController">
            Search<input type="text" name="search" required="">
            <input type="submit" name="action" value="Search">
        </form>
        
        <%
            List<UserDTOadmin> admin = (List<UserDTOadmin>) session.getAttribute("LIST");
            if(admin!=null){
                if(admin.size()>0){
                    %>
                    <table border="1">
                        <thead>
                            <tr>
                                <th>id</th>
                                <th>name</th>
                                <th>roleID</th>
                                <th>hireday</th>
                                <th>address</th>
                                <th>Delete</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            for (UserDTOadmin e : admin) {
                                    %>
                            
                            <tr>
                                <td><%= e.getId() %></td>
                                <td><%= e.getName()%></td>
                                <td><%= e.getRoleID()%></td>
                                <td><%= e.getHireday()%></td>
                                <td><%= e.getAddress()%></td>
                                <td><a href="MainController?action=Delete&id=<%= e.getId()%>">Delete</a></td>
                            </tr>
                            
                            <%
                                }
                            %>
                        </tbody>
                    </table>

        <%
                }
            }
        %>
    </body>
</html>
