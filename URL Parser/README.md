### Session 4 Day 2 Assignment 1
##### Problem : Parse The URL to get Protocol,Domain,Path
##### Scala 

1. Create a URL parser using the concept of Extractors (unapply method) with pattern matching that takes the input (URL) as string and displays the protocol, domain name, and path from the given URL.
2. Write the unit tests for above mentioned URL parser

Input
“https://www.mywebsite.com/home”

Output
Protocol: https
Domain: www.mywebsite.com
Path: home

##### Solution Explanation : 
The project contains a URLParser class that uses extractors to extract a URL into its three components : PROTOCOL,DOMAIN and PATH.
The driver code is present in another file in main folder.
When we apply comparision in pattern matching on our extractor object, the Unappy method is called spontaneously.
Test class can be found in Test folder.

The code handles the possible edge cases that if the url is not appropriate then it does not parses it.
If the url does not have a protocol as well as domain , it will not parse it,these are the basic fields of a url.

####### The code is written in scala language and can be run through intellij or terminal with sbt installed.
Check prerequisites to run a scala project on your system.You can go through the guide to install and set up sbt via the link 

[How to install and set up sbt??](https://blog.knoldus.com/simple-build-tool-getting-with-sbt-setting-up-running/)


             







