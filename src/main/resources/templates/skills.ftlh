<!DOCTYPE html>
<html>
<head>
    <title>SKILLS</title>
</head>
<body>
<h1>SKILLS</h1>
<hr>
<h4>Player skills</h4>

<#list allSkills as skills>
    <div>
        <p><b>DRIBBLING:</b><b>${skills.dribbling}</b></p>
        <p><b>HEADING:</b><b>${skills.heading}</b></p>
        <p><b>INTERCEPTIONS:</b><b>${skills.interceptions}</b></p>
        <p><b>PACE:</b><b>${skills.pace}</b></p>
        <p><b>PASSING:</b><b>${skills.passing}</b></p>
        <p><b>STRENGTH:</b><b>${skills.strength}</b></p>
        <p><b>TECHNIQUE:</b><b>${skills.technique}</b></p>
    </div>
</#list>
<hr>
</body>
</html>