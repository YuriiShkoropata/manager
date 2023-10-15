<!DOCTYPE html>
<html>
<head>
    <title>EDIT PLAYER</title>
</head>
<body>
<h1>EDIT PLAYER</h1>
<hr>
<form action="/player/create" method="post">
    <input type="hidden" name="id" value="${player.id}" />
    Name of player: <input type="text" name="name" value="${player.name}"><br><br>
    Surname of player: <input type="text" name="surname" value="${player.surname}"><br><br>
    Position: <input type="text" name="position" value="${player.position}"><br><br>
    Number: <input type="number" name="number" value="${player.number}"><br><br>
    Rating: <input type="number" name="rating" value="${player.rating}"><br><br>
    <input type="submit" value="SAVE"/>
</form>
</body>
</html>