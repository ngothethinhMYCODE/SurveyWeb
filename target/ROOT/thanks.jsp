<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Thank You</title>
    <link rel="stylesheet" href="main.css">
</head>

<body>

    <h1>Thank you for completing the survey!</h1>

    <h2>Your information:</h2>

    <p>
        <strong>First Name:</strong>
        ${user.firstName}
    </p>

    <p>
        <strong>Last Name:</strong>
        ${user.lastName}
    </p>

    <p>
        <strong>Email:</strong>
        ${user.email}
    </p>

    <p>
        <strong>Date of Birth:</strong>
        ${user.dateOfBirth}
    </p>


    <h2>Survey information:</h2>

    <p>
        <strong>How did you hear about us?</strong>
        ${user.heardFrom}
    </p>

    <p>
        <strong>Receive announcements:</strong>
        ${user.announcements}
    </p>

    <p>
        <strong>Receive email announcements:</strong>
        ${user.emailAnnouncements}
    </p>

    <p>
        <strong>Contact method:</strong>
        ${user.contactMethod}
    </p>


    <br>

    <a href="index.jsp">Back to Survey</a>

</body>
</html>