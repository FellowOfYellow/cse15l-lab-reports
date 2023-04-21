# Part 1: StringServer



## StringServer Code

![image](assets/StringServer-Code.png)

### Which methods in your code are called?

I have one method in my code name "handleRequest." This method essentially checks whether the URL path contains "/add-message?s=[user inputted message]." If it does contain this, then it saves it into a string which is then displayed onto the page. Any more strings that are entered through /add-message?s=[iser inputted message] are then added below the first message in new lines. If the URL does not contain "/add-message?s=..." then the page shows "404 Not Found!"

### What are the relevant arguments to those methods, and the values of any relevant fields of the class?

The relevant argument is the string that is the URL. The values of the relevant fields of the class is returnedString, which saves all the inputted user words.

### How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.

The values of the returnedString changes from this specific request because when the request is made, the new word gets concatenated with the previous words. 

## StringServer Test 1

![image](assets/test1.png)



## StringServer Test 2

![image](assets/test2.png)
