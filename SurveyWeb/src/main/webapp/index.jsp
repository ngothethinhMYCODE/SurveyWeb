<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Survey</title>
    <link rel="stylesheet" href="main.css">
</head>

<body>

    <img src="images/murachlogo.jpg" alt="Murach Logo" width="300" >

    <h1>Survey</h1>

    <p>
        If you have a moment, we'd appreciate it if you would fill out this survey.
    </p>

    <form action="emailList" method="post">

        <h2>Your information:</h2>

        <label>First Name</label>
        <input type="text" name="firstName" required>
        <br><br>

        <label>Last Name</label>
        <input type="text" name="lastName" required>
        <br><br>

        <label>Email</label>
        <input type="email" name="email" required>
        <br><br>

        <label>Date of Birth</label>
        <input type="date" name="dateOfBirth">
        <br><br>


        <h2>How did you hear about us?</h2>

        <input type="radio" name="heardFrom" value="Search Engine" checked>
        Search Engine

        <input type="radio" name="heardFrom" value="Word of Mouth">
        Word of Mouth

        <input type="radio" name="heardFrom" value="Social Media">
        Social Media

        <input type="radio" name="heardFrom" value="Other">
        Other


        <h2>Would you like to receive announcements?</h2>

        <input type="checkbox" name="announcements" value="Yes">
        YES, I'd like that.
        <br><br>

        <input type="checkbox" name="emailAnnouncements" value="Yes">
        YES, please send me email announcements.
        <br><br>


        <label>Please contact me by:</label>

        <select name="contactMethod">
            <option value="Email">Email</option>
            <option value="Postal Mail">Postal Mail</option>
        </select>

        <br><br>

        <input type="submit" value="Submit">

    </form>

</body>
</html>