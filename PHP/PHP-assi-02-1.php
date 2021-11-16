<!DOCTYPE HTML>
<html>

    <head>
        <title>PHP Assignment 2-1 - AYHAM</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet"> 
        <style>
            * {
                font-family: 'Poppins';
            }
            .box {
                padding: 50px;
                border: 3px solid rgba(0, 0, 0, .1);
                border-radius: 10px;
                margin: 200px auto;
                width: max-content;
                box-shadow: 0 0 20px rgba(0, 0, 0, .15);
                transition: transform .3s;
            }
            .box:hover {
                transform: scale(1.05);
            }

        </style>
    </head>

    <body>

        <div class="box">

            <?php

                echo "<h1 style='color: red; text-align: center;'>Welcome to my PHP website</h1>";

                echo "<div style='text-align: center;'>";
                $chars = str_split("Welcome");
                foreach ($chars as $char) {
                    echo "<p>$char</p>"; // no need for <br> since <p> element will make new lines
                }
                echo "</div>";

                echo "<h4 style='color: lime; text-align: center;'>Made with ❤ by <a href='https://opg4mers.com' target='_blank' style='text-decoration: none; color: orange !important;'>Ayham Al-Ali</a></h4>";

            ?> 
        </div>
    </body>

</html>
