---
toc: true
comments: true
layout: post
title: JS Calculator
description: A working JavaScript calculator.
---

<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    body {
      font-family: Arial, sans-serif;
      display: flex;
      justify-content: center;
      align-items: center;
      min-height: 100vh;
      margin: 0;
      background-color: #000000;
    }

    .calculator {
      background-color: #ffffff;
      border-radius: 8px;
      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
      padding: 20px;
      text-align: center;
    }

    .buttons {
      display: grid;
      grid-template-columns: repeat(4, 1fr);
      grid-gap: 10px;
      margin-top: 10px;
    }

    button {
      font-size: 18px;
      padding: 10px;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }


    input {
      width: 100%;
      padding: 10px;
      font-size: 24px;
      text-align: right;
      border: none;
      border-radius: 5px;
    }
  </style>
</head>
<body>
  <div class="calculator">
    <input type="text" id="display" readonly>
    <div class="buttons">
      <button onclick="appendToDisplay('7')">7</button>
      <button onclick="appendToDisplay('8')">8</button>
      <button onclick="appendToDisplay('9')">9</button>
      <button onclick="appendToDisplay('+')">+</button>
      <button onclick="appendToDisplay('4')">4</button>
      <button onclick="appendToDisplay('5')">5</button>
      <button onclick="appendToDisplay('6')">6</button>
      <button onclick="appendToDisplay('-')">-</button>
      <button onclick="appendToDisplay('1')">1</button>
      <button onclick="appendToDisplay('2')">2</button>
      <button onclick="appendToDisplay('3')">3</button>
      <button onclick="appendToDisplay('*')">*</button>
      <button onclick="appendToDisplay('0')">0</button>
      <button onclick="calculate()">=</button>
      <button onclick="clearDisplay()">CLEAR</button>
      <button class="trig-button" onclick="calculateTrig('sin')">sin</button>
      <button class="trig-button" onclick="calculateTrig('cos')">cos</button>
      <button class="trig-button" onclick="calculateTrig('tan')">tan</button>
      <button onclick="appendToDisplay('/')">/</button>
    </div>
  </div>
  <script>
    let displayValue = "";

    function appendToDisplay(value) {
      displayValue += value;
      document.getElementById("display").value = displayValue;
    }

    function calculate() {
      try {
        displayValue = eval(displayValue).toString();
        document.getElementById("display").value = displayValue;
      } catch (error) {
        document.getElementById("display").value = "Error";
      }
    }

    function calculateTrig(operation) {
      const angle = parseFloat(displayValue);
      if (!isNaN(angle)) {
        let result;
        switch (operation) {
          case "sin":
            result = Math.sin(angle * (Math.PI / 180));
            break;
          case "cos":
            result = Math.cos(angle * (Math.PI / 180));
            break;
          case "tan":
            result = Math.tan(angle * (Math.PI / 180));
            break;
        }
        displayValue = result.toString();
        document.getElementById("display").value = displayValue;
      } else {
        document.getElementById("display").value = "Error";
      }
    }

    function clearDisplay() {
      displayValue = "";
      document.getElementById("display").value = "";
    }
  </script>
</body>
</html>
