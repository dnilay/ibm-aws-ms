<%--
  Created by IntelliJ IDEA.
  User: nilay
  Date: 08/09/20
  Time: 10:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add League Page</title>
</head>
<body>
<form action="add_league.do" method="post">
    <h2>ADD LEAGUE PAGE</h2>
    <table>
        <tr>
            <td> <label>League Name</label></td>
            <td><input type="text" name="league_name"></td>
        </tr>
        <tr>
            <td> <label>League Year</label></td>
            <td><input type="text" name="league_year"></td>
        </tr>
        <tr>
            <td> <label>League Season</label></td>
            <td>  <select name="league_season">
                <option value="Unknown">Select...</option>
                <option value="Summer">Summer</option>
                <option value="Winter">Winter</option>
                <option value="Autumn">Autumn</option>
            </select></td>
        </tr>
        <tr>
            <td><input type="submit" value="Add League"></td>
            <td> <input type="reset" value="Reset Fields"></td>
        </tr>
    </table>
</form><br/>
<a href="/index.jsp"> go back to index page</a>
</body>
</html>
