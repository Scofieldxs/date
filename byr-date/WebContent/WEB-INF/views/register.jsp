<%@ page language="java" pageEncoding="UTF-8"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">    
<html>    
<head>    
<title>注册</title>    
</head>    
<body>    
    <form method="post" action="<c:url value="/user.html"/>">    
        <table>  
            <tr>
                <td>username:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>password:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" name="submit"/></td>
            </tr>
        </table>
    </form>    
</body>
</html>