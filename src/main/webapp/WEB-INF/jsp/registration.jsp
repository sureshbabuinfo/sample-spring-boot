<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
</head>
<body>

<form action="/user/create" method="POST">

    <div>
        <label for="name">
            <input type="text" name="name" id="name"/>
        </label>
    </div>

    <div>
        <label for="emailId">
            <input type="text" name="emailId" id="emailId"/>
        </label>
    </div>

    <input type="submit" value="Submit"/>
</form>

</body>

</html>
