<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<div>
    <#list manga as bun>
        <img src="Sasha.jpg">
        <div>
            <ol>
                <li><h2>${bun.name}</h2></li>
                <li><h4>${bun.alter_name}</h4></li>
                <li><h4>${bun.genre}</h4></li>
                <li><h4>${bun.date_of_appearance}</h4></li>
                <li><h4>${bun.status}</h4></li>
                <li><h4>${bun.author}</h4></li>
                <li><h4>${bun.type}</h4></li>
                <li><h4>${bun.description}</h4></li>
            </ol>
        </div>
        <form method="post" action="/manga/delete/${bun.id}">
            <button type="submit">DELETE</button>
        </form>
    </#list>
</div>
</body>
</html>