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
        <p><b>${player.surname}</b> ${player.position} ${player.rating} | <a href="/player/${player.id}">Details</a></p>
    </div>
</#list>
<hr>
<h3>Add new Player</h3>
<form action="/player/create" method="post" enctype="multipart/form-data">
    Name of player: <input type="text" name="name"><br><br>
    Surname of player: <input type="text" name="surname"><br><br>
    Position: <input type="text" name="position"><br><br>
    Number: <input type="number" name="number"><br><br>
    Rating: <input type="number" name="rating"><br><br>
    Photo: <input type="file" name="file1"><br><br>
    <input type="submit" value="Add Player"/>
</form>
</body>
</html>