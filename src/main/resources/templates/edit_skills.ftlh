<!DOCTYPE html>
<html>
<head>
    <title>SKILLS</title>
</head>
<body>
<h1>SET SKILLS</h1>
<hr>
<h4>Player skills</h4>
<form action="/player/skills/set" method="post">
    <input type="hidden" name="id" value="${skills.id}"/>
    DRIBBLING: <input type="number" name="dribbling" value="${skills.dribbling}"><br><br>
    HEADING: <input type="number" name="heading" value="${skills.heading}"><br><br>
    INTERCEPTIONS: <input type="number" name="interceptions" value="${skills.interceptions}"><br><br>
    PACE: <input type="number" name="pace" value="${skills.pace}"><br><br>
    PASSING: <input type="number" name="passing" value="${skills.passing}"><br><br>
    STRENGTH: <input type="number" name="strength" value="${skills.strength}"><br><br>
    TECHNIQUE: <input type="number" name="technique" value="${skills.technique}"><br><br>
    <input type="submit" value="SAVE"/>
</form>
<hr>
</body>
</html>