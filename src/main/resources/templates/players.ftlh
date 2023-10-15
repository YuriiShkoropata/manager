<!DOCTYPE html>
<html>
<head>
    <title>PLAYER</title>
</head>
<body>
<h1>PLAYERS</h1>
<hr>
<h4>My Players</h4>
<form action="/" method="get">
    Find by surname: <input type="text" name="surname"><br>
    <input type="submit" value="SEARCH"/>
</form>
<#list players as player>
    <div>
        <p><b>${player.surname}</b> ${player.position} <b>${player.rating}</b> | <a href="/player/${player.id}">Details</a></p>
    </div>
</#list>
<hr>
<h3>Add new Player</h3>
<a href="/addPlayer"> <button>Add new Player</button> </a>
</body>
</html>