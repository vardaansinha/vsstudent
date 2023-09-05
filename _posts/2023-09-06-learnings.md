---
toc: true
comments: true
layout: post
title: Week 3 New Learnings from Stock Predictor
courses: { csa: {week: 3} }
type: tangibles
---


I learned a lot of new things this week from my more experienced pair member. Here are some of the key learnings summarized:


**CANVAS JS**:

This is a tool that I had heard about but not explored, and it is a very effective way to visualize data in a more visually appealing manner.

<h1>1. Styling the Graph</h1>

<br>

**Line Color**: ctx.strokeStyle = *color*;

**Line Width**: ctx.lineWidth = *width*;

<br>

<h1>2. Transforming the Graph</h1>

<br>

**Translation**: ctx.translate(x, y);

This allows for the origin of the graph to be moved (translated).

**Rotation**: ctx.rotate(*angle*);

This lets you rotate any part of the graph.

<br>

<br>


**TROUBLESHOOTING & PROCESS**:

<br>

1. Finding the best timeframe to use for visualization. This was something we changed around to try and see which would provide the best way to view and predict stock prices.

<br>

2. We had an issue where the graph was essentially flipped. This is because we messed up with the index calculation, so the graph was showing the stock prices trending in the opposite direction.