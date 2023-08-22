---
toc: true
comments: true
layout: post
title: VSCode, GitHub Pages Setup HACKS
description: Vardaan's Hack Answers.
---

**INSTALLATION HACKS**:

1. In the Development process, developers use Version control. Annotate in notes what you have learned about Version Control while doing this setup process.

  - Version control is the practice of tracking all the changes to a particular repository

  - I have maintained my stance on the fact that version control is incredibly important, especially during the setup process

  - It is necessary that we are keeping track of all the different software we need installed for different purposes and keeping track of their versions, compatibility with other software, etc.


2. Where are the files from GitHub placed on your local machine. How do you navigate to those files.

   - On my local machine, GitHub files are placed in a separate "Linux" subsystem folder on my system

   - I can navigate to those files through File Explorer, going to Ubuntu > home > vardaan > vscode and seeing all my repositories and files in each of these repositories.

   - I can also view these files by opening a WSL shell and cd'ing to the home directory


3. Where are the files placed in the GitHub Cloud, how do you navigate to those files?

   - I can navigate to GitHub Desktop and clone a repository to access all the files from a certain repository

   - I can also use the web version of GH to access my account, repositories, and search for my files


4. How would you update your Template or Fork of student repository if teacher wanted you to pick up an update?

   - To update my fork, I'd run the git fetch upstream command inside of my repository through terminal, which gets all the changes from the parent repository (original student repo in this case)

   - Then, I'd run the git merge upstream/main command which merges all the changes from the main branch (likely the sole branch in a student environment) into my forked repo


5. Put into words the difference between viewing GitHub Pages running on localhost machine versus running on a deployed server.

   - Running on a localhost machine is a lot easier in terms of looking for errors and changes instantly during development. Your updates can be seen simultaneously and is super easy to quickly deduce errors instead of waiting for a deployment update after saving a file and whatnot. Running on a deployed server is more professional and should be done more for when a product is closer to being finished or is in its final state so that other peers can view the project.


6. What is the localhost URL for your distribution? Can anyone else see it?
  
     - localhost:4200/student
     - No, others cannot see it since it is running locally on MY machine. 


7. What is the GitHub Pages URL for your distribution? Can anyone else see it?

      - https://vardaansinha.github.io/vsstudent/
      - Yes, others can see it, since it is a publicly accessible domain.


8. DNS is the address manager for the internet. Put into your own words how you changed the domain name of your student repository. Did you change the address?

- N/A, not supposed to go into this domain changing yet (AWS setup delay)
