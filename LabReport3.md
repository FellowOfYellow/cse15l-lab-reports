# Researching Commands - grep

**Grep Description** - print lines that match patterns



# grep -e

![image](assets/grep_e.png)

![image](assets/grep_e2.png)

**-e Description** - Use PATTERNS as the patterns.  If this option is used
                     multiple times or is combined with the -f (--file) option,
                     search for all patterns given.  This option can be used to
                     protect a pattern beginning with “-”.

**The Significance** - -e signifies patterns. It is useful because without -e, grep might interpret the pattern as an option instead of a search pattern. So in general, its always good to use -e to avoid an error like this



# grep -c

![image](assets/grep_c.png)

![image](assets/grep_c2.png)

**-c Description** - Suppress normal output; instead print a count of matching
                     lines for each input file.  With the -v, --invert-match
                     option (see above), count non-matching lines.

**The Significance** - -e signifies patterns. It is useful because without -e, grep might interpret the pattern as an option instead of a search pattern. So in general, its always good to use -e to avoid an error like this



# grep -v

![image](assets/grep_v.png)

![image](assets/grep_v2.png)

**-v Description** - Invert the sense of matching, to select non-matching
                     lines.

**The Significance** - -c signifies count. It is useful because instead of manually counting how many lines a file has, you can just use -c in grep to automatically count it. This can be useful if you were trying to figure out how many times a specific word was said if you add an argument after grep (such as "and")



# grep -i

![image](assets/grep_i.png)

![image](assets/grep_i2.png)

**-i Description** - Ignore case distinctions in patterns and input data, so
                     that characters that differ only in case match each other.
                     
**The Significance** - -c signifies ignore case. It is useful if you are trying to find how many times a specific word is being said regardless of it is uppercase or lowercase. Perhaps you are checking a doc for how many times it says "the" and you also want to count it when it is at the start of a sentence and is "The" instead of "the".



# Citation

[https://man7.org/linux/man-pages/man1/grep.1.html](https://man7.org/linux/man-pages/man1/grep.1.html)
