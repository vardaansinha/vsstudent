<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Blog</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        h1, .main-title {
            font-size: 35px;
            font-weight: bold;
            font-family: Arial, sans-serif;
        }
        p {
            font-size: 18px;
            font-weight: normal;
        }
        .small-image {
            max-width: 400px; 
        }
        .quote {
            font-size: 22px;
            font-weight: bold;
        }
        .life {
            font-size: 21px;
            font-weight: bold;
            font-family: Arial, sans-serif;
        }
        .life2 {
            font-size: 27px;
            font-weight: bold;
            font-family: Arial, sans-serif;
            color: #d91860
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
            font-family: Arial, sans-serif;
        }
        th {
            background-color: #000000;
            color: #ffffff;
        }
        /* Additional styles for the new table */
        .weekly-table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        .weekly-table th, .weekly-table td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
            font-family: Arial, sans-serif;
        }
        .weekly-table th {
            background-color: #000000;
            color: #ffffff;
        }
    </style>
</head>
<body>
    <center><h1 class="main-title">Welcome to Vardaan's CSA Homepage.</h1></center>

    <!-- Weekly Plans, Hacks, and Review Tickets Table -->
    <table class="weekly-table">
        <tr>
            <th>Week</th>
            <th>Plans</th>
            <th>Hacks</th>
            <th>Review Tickets</th>
        </tr>
        <!-- Add your weekly data rows here -->
        <tr>
            <td>0</td>
            <td>Your plans for week 0</td>
            <td>Your hacks for week 0</td>
            <td>Your review tickets for week 0</td>
        </tr>
        <tr>
            <td>1</td>
            <td>Your plans for week 1</td>
            <td>Your hacks for week 1</td>
            <td>Your review tickets for week 1</td>
        </tr>
        <tr>
            <td>2</td>
            <td>Your plans for week 2</td>
            <td>Your hacks for week 2</td>
            <td>Your review tickets for week 2</td>
        </tr>
        <tr>
            <td>3</td>
            <td>Your plans for week 3</td>
            <td>Your hacks for week 3</td>
            <td>Your review tickets for week 3</td>
        </tr>
    </table>

    <div style="display: flex; align-items: center; justify-content: center;">
        <div style="flex: 1; text-align: right; padding-right: 20px;">
            <p class="quote">"I think sometimes in life the biggest challenges end up being the best things that happen in your life." - Tom Brady</p>
        </div>
        <div style="flex: 0;">
            <img src="{{ site.baseurl }}/images/image0.png" alt="Vardaan's freeform drawing" class="small-image">
            <p style="font-style: italic;">Vardaan's freeform drawing</p>
        </div>
        <div style="flex: 1; text-align: left; padding-left: 20px;">
            <p class="quote">"If it's flipping hamburgers at McDonald's, be the best hamburger flipper in the world. Whatever it is you do you have to master your craft." - Snoop Dogg</p>
        </div>
    </div>

    <div style="text-align: center;">
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1837598.7317306253!2d84.48485166001444!3d25.90039726883523!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x39ed5844f0bb6903%3A0x57ad3fed1bbae325!2sBihar%2C%20India!5e0!3m2!1sen!2sus!4v1692762821472!5m2!1sen!2sus" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
    </div>

    <center><p style="font-size: 20px; font-weight: bold;">I am from Bihar, India. Click on the above embedded map to view the areas around where I'm from in the massive country of India.</p></center>

    <br>
    <br>
    <br>
    <br>

    <h2 style="text-align: center;">My Life in Categories</h2>
    <table>
        <tr>
            <th>Family & Friends</th>
            <th>School</th>
            <th>Relationships</th>
        </tr>
        <tr>
            <td>I believe that family and friends are the most important people ever. I spend a majority of my time with them and it brings me a lot of happiness. I am grateful for these people.</td>
            <td>Coming to school everyday is very important to me. I feel that learning is an experience that is best done in an optimistic manner and without the goal of bringing home grades, but rather to actually enjoy learning. I try to take classes that interest me rather than classes to bore me, and I value the education that I get everyday.</td>
            <td>I believe that relationships are the most important thing in the world. I look to maintain strong relationships, make new ones in the places that I go everyday (like school), and cherish them forever.</td>
        </tr>
    </table>

    <br>
    <br>

</body>
</html>
