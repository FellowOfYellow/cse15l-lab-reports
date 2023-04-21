# Part 1: StringServer



## StringServer Code

![image](assets/StringServer-Code.png)

I have one method in my code name "handleRequest." This method essentially checks whether the URL path contains "/add-message?s=[user inputted message]." If it does contain this, then it saves it into a string which is then displayed onto the page. Any more strings that are entered through /add-message?s=[iser inputted message] are then added below the first message in new lines. If the URL does not contain "/add-message?s=..." then the page shows "404 Not Found!."




## StringServer Test 1

![image](assets/test1.png)



## StringServer Test 2

![image](assets/test2.png)
