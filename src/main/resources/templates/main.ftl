<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Choose mode</title>
    </head>
    <body>
        <div style=" width: 100%; max-width: 1024px;  height :100%; margin: auto; background: silver">
            <table style=" width: 100%; max-width: 1024px;   height :100%; ">
                <tr>
                    <th style = "width: 80%; vertical-align: top">
                        <table style =" width: 100%; margin: 0;  float:left; ">
                            <tr>
                                <th class="thh" style =" width: 80%; max-width: 600px; "> Description</th>
                                <th class="thh" style=" width: 20%; "> Button</th>
                            </tr>

                            <th class="thh" style =" width: 80%; max-width: 600px; "> Something to show other players</th>
                            <th class="thh" style=" width: 20%; ">
                                <form method="post" action="/startGame">
                                    <p><input type="submit" value="Создать"></p>
                                </form>
                            </th>

                        </table>
                    </th>
                    <th style = "">
                        <div id="inf" style=" height: 100%; ">
                            <form method="post" action="/">
                                <p><b>Надпись:</b></p>
                                <p><input type="text" size="40"></p>
                                <p><input type="submit" value="Создать"></p>
                            </form>
                        </div>
                    </th>
                </tr>
            </table>
        </div>

    </body>
    <style type="text/css">
        .thh{padding: 3px; border: 1px solid black; }
    </style>
</html>
