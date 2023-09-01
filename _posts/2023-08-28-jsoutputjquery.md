---
toc: true
comments: true
layout: post
title: JS Output with jQuery
courses: { csa: {week: 2} }
---

<html>
<head>
    <title>JS Output with jQuery</title>
    <!-- Load jQuery and DataTables output style and scripts -->
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
    <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        table {
            border-collapse: collapse;
            width: 80%;
            margin: auto;
            margin-top: 20px;
        }
        th, td {
            border: 4px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #000000;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        .table {
            width: 100%;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center;">University Tuition Data</h1>
    <table id="demo" class="table">
        <thead>
            <tr>
                <th>University</th>
                <th>State</th>
                <th>Tuition</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>UCLA</td>
                <td>California</td>
                <td>38517</td>
            </tr>
            <tr>
                <td>Cal Poly SLO</td>
                <td>California</td>
                <td>33024</td>
            </tr>
            <tr>
                <td>Carnegie Mellon</td>
                <td>Pennsylvania</td>
                <td>83697</td>
            </tr>
            <tr>
                <td>MIT</td>
                <td>Massachusetts</td>
                <td>82730</td>
            </tr>
            <tr>
                <td>Purdue</td>
                <td>Indiana</td>
                <td>41614</td>
            </tr>
        </tbody>
    </table>
    <script>
        $("#demo").DataTable();
    </script>
</body>
</html>


Blogging Questions:

**1. Describe a benefit of a markdown table.**

Markdown tables are easy to manage and organize. They are also easily sorted with a minor JS incorporation and can be easily styled.

**2. Describe the difference between HTML and JavaScript.**

HTML is more of the backbone structure of a frontend site. JavaScript is something that can be used to improve certain functionalities of a site and is a scripting language rather than a markup language like HTML.

**3. Describe a benefit of a table that uses JavaScript.**

A table using JavaScript can allow for more user interaction. Users can sort certain categorical/quantitative columns and can reach conclusions about the data presented in the table.


