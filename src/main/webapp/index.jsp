<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%--<form action="/home" method="get">--%>
<%--    <label>--%>
<%--        Name :--%>
<%--    </label>--%>
<%--    <input type="text" name="user_name">--%>
<%--    <label>--%>
<%--        Surname :--%>
<%--    </label>--%>
<%--    <input type="text" name="user_surname">--%>
<%--    <label>--%>
<%--        Age :--%>
<%--    </label>--%>
<%--    <select name="user_age">--%>
<%--        <option>15</option>--%>
<%--        <option>16</option>--%>
<%--        <option>17</option>--%>
<%--        <option>18</option>--%>
<%--        <option>19</option>--%>
<%--        <option>20</option>--%>
<%--        <option>21</option>--%>
<%--        <option>22</option>--%>
<%--    </select>--%>
<%--    <button>ADD STUDENT</button>--%>
<%--</form>--%>
<%--<br>--%>
<%--<form action="/home" method="post">--%>
<%--    <label>--%>
<%--        TEAM :--%>
<%--    </label>--%>
<%--    <input type="text" name="team_name">--%>
<%--    <label>--%>
<%--        POINTS :--%>
<%--    </label>--%>
<%--    <input type="number" max="120" min="0" name="team_points">--%>
<%--    <button>CREATE TEAM</button>--%>
<%--</form>--%>

<form action="/add" method="post">
    <label>
        Name :
    </label>
    <input type="text" name="item_name">
    <label>
        Price :
    </label>
    <input type="text" name="item_price">
    <label>
        Amount :
    </label>
    <input type="text" name="item_amount">
    <button>ADD ITEM</button>
</form>
</body>
</html>