<!DOCTYPE html>
<html>
<head>
    <title>PLAYER</title>
</head>
<body>
<h1>PLAYER</h1>
<hr>
<h4>Player details</h4>
<b>Name of Player: </b>${player.name}<br>
<b>Surname of Player: </b>${player.surname}<br>
<b>Position of Player: </b>${player.position}<br>
<b>Number of Player: </b>${player.number}<br>
<b>Rating of Player: </b>${player.rating}<br>
<hr>
<div>
    <p>
<form action="/player/delete/${player.id}" method="post">
    <input type="submit" value="DELETE PLAYER"/>
</form>
<br>
<form action="/player/update/${player.id}" method="get">
    <input type="submit" value="EDIT PLAYER"/>
</form>
<br>
<a href="/"> <button>ALL PLAYERS</button> </a>
    </p>
</div>
</body>
</html>