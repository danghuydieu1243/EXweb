<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="main.css" type="text/css"/>
</head>

<body>
<h1>Thanks for joining our email list</h1>

<p>Here is the information that you entered:</p>

First Name:
<span>${user.firstName}</span><br>
Last Name:
<span>${user.lastName}</span><br>
Email:
<span>${user.email}</span><br>
Hear From:
<span>${user.hearFrom}</span><br>
Receive CDs:
<span>${user.checkYes}</span><br>
Contact By:
<span>${user.contactBy}</span><br>
<p>To enter another email address, click on the Back
    button in your browser or the Return button shown
    below.</p>

<form action="" method="get">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
</form>

</body>
</html>