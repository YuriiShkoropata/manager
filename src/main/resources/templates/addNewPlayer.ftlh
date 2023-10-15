<!DOCTYPE html>
<html>
<head>
    <title>ADD NEW PLAYER</title>
</head>
<body>
<h1>ADD NEW PLAYER</h1>
<hr>
<h3>Add new Player</h3>
<form action="/player/create" method="post">
    Name of player: <input type="text" name="name"><br><br>
    Surname of player: <input type="text" name="surname"><br><br>
    Position: <input type="text" name="position"><br><br>
    Number: <input type="number" name="number"><br><br>
    Rating: <input type="number" name="rating"><br><br>
    <input type="submit" value="Add Player"/>
</form>
</body>
</html>