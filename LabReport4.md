# Lab Report 4 - Vim, GitHub, and the Chamber of Secrets


### Step 1
Prompt: Log into ieng6

`ssh cs15lsp23nr@ieng6.ucsd.edu`

[image](sheesh this is rad)

**Runnin' The Code pt.1**

Note: password would usually be needed, but it was set up in the lab where it automatically enters it

### Step 2
Prompt: Clone your fork of the repository from your Github account

`git clone git@github.com:FellowOfYellow/lab7.git`

Lil fun thing, delete fork in terminal via rm -rf <name of file>

**Runnin' The Code pt.2**


### Step 3
Prompt: Run the tests, demonstrating that they fail

`cd lab7`
`javac ListExamples.java`
`java ListExamples`

**The Big Bad Error**


### Step 4
Prompt: Edit the code file to fix the failing test

`vim ListExamples.java`
`j` x3
`i`
`public static void main(String[] args){`
`[enter]`
`[delete]`
`}`
`[control^]c`
`:wq`
  
**Runnin' The Code - the Sequel**

### Step 5
Prompt: Run the tests, demonstrating that they now succeed

`javac ListExamples.java`
`java ListExamples`

**All Fixed :D**

### Step 6
Prompt: Commit and push the resulting change to your Github account (you can pick any commit message!)

`git commit -m "Sheesh we be updating"`
`git push origin main`

**Committin'**
  

  
### Extra - How to make goofy funny public keys
1. ssh-keygen
