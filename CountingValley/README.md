# <a href="https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen">Counting Valley</a>
An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly "steps" steps, for every step it was noted if it was an uphill, "U", or a downhill, "D" step. Hikes always start and end at sea level, and each step up or down represents a 1 unit change in altitude. We define the following terms: <br>

-> A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level. <br>
-> A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level. <br>

Given the sequence of up and down steps during a hike, find and print the number of <b>valleys walked through. </b>

Example

steps = 8 paths = [DDUUUUDD]
 

The hiker first enters a valley 2 units deep. Then they climb out and up onto a mountain 2 units high. Finally, the hiker returns to sea level and ends the hike.

## Function Description

Complete the countingValleys function in the editor below. <br>

countingValleys has the following parameter(s): <br>

-> int steps: the number of steps on the hike <br>
-> string path: a string describing the path <br>

Returns <br>
-> int: the number of valleys traversed <br>

## Input Format

The first line contains an integer "steps", the number of steps in the hike. <br>
The second line contains a single string "path", of "steps"  characters that describe the path.

Constraints

2 <= steps <= 10^6
path[i] is an element of {UD}

### Sample Input
8 <br>
UDDDUDUU <br>

### Sample Output
1 <br>

