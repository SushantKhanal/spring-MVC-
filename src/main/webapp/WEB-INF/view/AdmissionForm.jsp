<html>
<body>
<h1>Student admission form</h1>

<form action="/submitAdmissionForm.html" method="post">
    <table>
    <tr>
        <td>Student's name:</td> <td><input type="text" name="studentName"/></td>
    </tr>

    <tr>
        <td>Student's hobby:</td> <td><input type="text" name="studentHobby"/></td>
    </tr>

        <tr>
            <td>Student's mobile:</td> <td><input type="text" name="studentMobile"/></td>
        </tr>

        <tr>
            <td>Student's DOB:</td> <td><input type="text" name="studentDOB"/></td>
        </tr>

        <tr>
            <td>Student's skill set:</td> <td><select name="studentSkills" multiple>
                                                <option value="java core">Java Core</option>
                                                <option value="spring core">Spring Core</option>
                                                <option value="Spring MVC">Spring MVC</option>
                                              </select></td>
        </tr>

    <tr><td><input type="submit" value="Submit this form by clicking here"/></td></tr>
    </table>
</form>

</body>
</html>