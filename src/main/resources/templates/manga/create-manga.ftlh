<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>New Manga</title>
</head>
<body>
    <form method="post" action="/manga/save">
        <input type="text" placeholder="Name" name="name">
        <input type="text" placeholder="Description" name="description">
        <input type="text" placeholder="Alter name" name="alter_name">
        <input type="text" placeholder="Genre" name="genre">
        <input type="text" placeholder="Date" name="date_of_appearance">
        <input type="text" placeholder="Status" name="status">
        <input type="text" placeholder="Author" name="author">
        <input type="text" placeholder="Type" name="type">
        <input type="submit">
    </form>
</body>
</html>