# Analyzing Weather Data
Use the October Seattle weather data above. Iterate through all of the data to find the min and max values. 
Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp 
to the max temp and create a String containing any temperature not seen during the month. Return that String.

Method:
- findMinVal takes in an array of integers and returns the smallest value
- findMaxVal takes in an array of integers and returns the largest value
- displayHighLow takes in a two dimensional array of integers and returns a String depicting, the highest and lowest
temperatures as well as any temperatures not accounted for


# Tallying Election
Write a function called tally that accepts a List of Strings representing votes and returns one string to show 
what got the most votes.

- tally takes in a List of strings and returns the value with the most instances

# JavaScript Linter
Write a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a 
line that doesn’t end in a semi-colon. Read through the file line by line. Create a string that contains a 
message such as "Line 3: Missing semicolon." if a line is missing a semicolon.

Don’t show an error if the line is empty.
Don’t show an error if the line ends with an opening curly brace {
Don’t show an error if the line ends with an closing curly brace }
Don’t show an error if the line contains if or else

- readJSFile takes in the String representation of a file path and returns a list of lines missing semi-colons.
The method also prints each respective line number.
