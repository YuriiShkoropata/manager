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
    Position:
    <select name="position">
            <option value="${player.position}">${player.position}</option>
        <optgroup label="GOALKEEPER">
            <option value="GK">GK</option>
        </optgroup>
        <optgroup label="DEFENDER">
            <option value="RB">RB</option>
            <option value="RWB">RWB</option>
            <option value="CB">CB</option>
            <option value="LB">LB</option>
            <option value="LWB">LWB</option>
        </optgroup>
        <optgroup label="MIDFIELDER">
            <option value="CDM">CDM</option>
            <option value="CM">CM</option>
            <option value="CAM">CAM</option>
            <option value="RM">RM</option>
            <option value="RW">RW</option>
            <option value="LM">LM</option>
            <option value="LW">LW</option>
        </optgroup>
        <optgroup label="FORWARD">
            <option value="RF">RF</option>
            <option value="LF">LF</option>
            <option value="CF">CF</option>
            <option value="ST">ST</option>
        </optgroup>
    </select><br><br>
    Number: <input type="number" name="number" value="${player.number}"><br><br>
    Rating: <input type="number" name="rating" value="${player.rating}"><br><br>
    <input type="submit" value="SAVE"/>
</form>
</body>
</html>