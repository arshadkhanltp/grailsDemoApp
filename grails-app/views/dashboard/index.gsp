<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>

<body>
Hello ${userDataDTO.name}, age: ${userDataDTO.age}, type: ${userDataDTO.type}
<br>This is your Team Member:::
<g:render template="/admin/showTeamMember" model="[listOfEmployee: listOfEmployee]"/>
</body>
</html>
