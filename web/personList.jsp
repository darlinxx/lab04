<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab4 tabelka</title>
    </head>
    <body>
        <h1>Spis osob</h1>
        <table style="width:100%" border="solid red">
            <tr>
                <th>Imię</th>
                <th>Nazwisko</th>
                <th>Email</th>
            </tr>
            
            <c:forEach items="${spis}" var="dane_osobowe">
                <tr>
                    <td>
                        ${dane_osobowe.firstName}
                    </td>
                    <td>
                        ${dane_osobowe.lastName}
                    </td>
                    <td>
                        ${dane_osobowe.email}
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>