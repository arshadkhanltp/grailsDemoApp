<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>

<body>
Hello ${userName}
This is your Team Member:::
<g:render template="showTeamMember" model="[listOfEmployee:listOfEmployee]"/>
</body>
</html>
