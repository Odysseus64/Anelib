<!doctype html>
<html lang="en" xmlns:th="http://thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!--    <link rel="stylesheet" href="home-page.css">-->
    <script src="/clock.js"></script>
    <title>Aneon</title>
</head>
<body>
<p></p>
<div id="dashboard">
    <ol>
        <li>
            <h2>
                Aneon
            </h2>
        </li>
        <li>
            <form>
                <input type="search" placeholder="Поиск" id="search-manga">
            </form>
        </li>
        <li>
            <a href="#">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-list"
                     viewBox="0 0 16 16">
                    <path fill-rule="evenodd"
                          d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
                </svg>
            </a>
        </li>
        <li>
            <a href="#">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-gear"
                     viewBox="0 0 16 16">
                    <path d="M8 4.754a3.246 3.246 0 1 0 0 6.492 3.246 3.246 0 0 0 0-6.492zM5.754 8a2.246 2.246 0 1 1 4.492 0 2.246 2.246 0 0 1-4.492 0z"/>
                    <path d="M9.796 1.343c-.527-1.79-3.065-1.79-3.592 0l-.094.319a.873.873 0 0 1-1.255.52l-.292-.16c-1.64-.892-3.433.902-2.54 2.541l.159.292a.873.873 0 0 1-.52 1.255l-.319.094c-1.79.527-1.79 3.065 0 3.592l.319.094a.873.873 0 0 1 .52 1.255l-.16.292c-.892 1.64.901 3.434 2.541 2.54l.292-.159a.873.873 0 0 1 1.255.52l.094.319c.527 1.79 3.065 1.79 3.592 0l.094-.319a.873.873 0 0 1 1.255-.52l.292.16c1.64.893 3.434-.902 2.54-2.541l-.159-.292a.873.873 0 0 1 .52-1.255l.319-.094c1.79-.527 1.79-3.065 0-3.592l-.319-.094a.873.873 0 0 1-.52-1.255l.16-.292c.893-1.64-.902-3.433-2.541-2.54l-.292.159a.873.873 0 0 1-1.255-.52l-.094-.319zm-2.633.283c.246-.835 1.428-.835 1.674 0l.094.319a1.873 1.873 0 0 0 2.693 1.115l.291-.16c.764-.415 1.6.42 1.184 1.185l-.159.292a1.873 1.873 0 0 0 1.116 2.692l.318.094c.835.246.835 1.428 0 1.674l-.319.094a1.873 1.873 0 0 0-1.115 2.693l.16.291c.415.764-.42 1.6-1.185 1.184l-.291-.159a1.873 1.873 0 0 0-2.693 1.116l-.094.318c-.246.835-1.428.835-1.674 0l-.094-.319a1.873 1.873 0 0 0-2.692-1.115l-.292.16c-.764.415-1.6-.42-1.184-1.185l.159-.291A1.873 1.873 0 0 0 1.945 8.93l-.319-.094c-.835-.246-.835-1.428 0-1.674l.319-.094A1.873 1.873 0 0 0 3.06 4.377l-.16-.292c-.415-.764.42-1.6 1.185-1.184l.292.159a1.873 1.873 0 0 0 2.692-1.115l.094-.319z"/>
                </svg>
            </a>
        </li>
        <li>
            <a href="#">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                     class="bi bi-person-circle" viewBox="0 0 16 16">
                    <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
                    <path fill-rule="evenodd"
                          d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
                </svg>
            </a>
        </li>
        <li>
            <div id="clock"></div>
        </li>
        <li>
            <a href="/manga/save"><button>ADD</button></a>
        </li>
    </ol>
</div>
<div>
    <#list page as go>
        <div>
            <div>
                <a href="#"><p>Name: ${go.name}</p></a>
                <a href="#"><p>Type: ${go.type}</p></a>
                <a href="#"><p>Desc: ${go.description}</p></a>
                <a href="#"><p>Genre: ${go.genre}</p></a>
                <a href="#"><p>More</p></a>
            </div>
        </div>
    </#list>
</div>
</body>
</html>
<style>
    body {
        margin: 0;
        padding: 0;
    }

    #dashboard {
        display: flex;
        justify-content: space-between;
        align-items: center;
        height: 60px;
        background-color: #333;
        color: #fff;
        padding: 0 20px;
    }

    #dashboard ol {
        list-style: none;
        margin: 0;
        padding: 0;
        display: flex;
        align-items: center;
    }

    #dashboard li {
        margin: 0 10px;
    }

    #dashboard h2 {
        margin: 0;
        font-size: 24px;
        font-family: Courier;
    }

    #dashboard svg {
        width: 16px;
        height: 16px;
        fill: #fff;
    }

    #clock {
        font-size: 15px;
        font-weight: bold;
        margin-bottom: 20px;
        padding-top: 15px;
        font-family: "Fira Code";
    }

    #search-manga {
        color: rgba(0, 0, 0, 0.47);
        width: 100%;
        max-width: 500px;
    }

    #search-manga input[type="search"] {
        width: calc(100% - 130px);
        box-sizing: border-box;
    }

    #search-manga button[type="submit"] {
        width: 130px;
    }

</style>