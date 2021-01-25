# <a href="https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup">Repeated String</a>

here is a string, s, of lowercase English letters that is repeated infinitely many times. Given an integer, n, find and print the number of letter a's in the first n letters of the infinite string. <br>

## Example
S = "abcac" <br>
n = 10 <br>
The substring we consider is abcacabcac, the first 10 characters of the infinite string. There are 4 occurrences of 'a' in the substring.<br>

## Function Description

Complete the repeatedString function in the editor below.<br>

repeatedString has the following parameter(s):<br>

s: a string to repeat<br>
n: the number of characters to consider<br>
Returns<br>

int: the frequency of a in the substring<br>

## Input Format

The first line contains a single string, s.<br>
The second line contains an integer, n.<br>

Sample Input 0<br>

aba<br>
10<br>

Sample Output 0<br>

7<br>

Explanation: <br><br>
The first n=10 letters of the infinite string are abaabaabaa. Because there are 7 a's, we return 7.<br>

Sample Input 1<br>

a<br>
1000000000000<br>
Sample Output 1<br>

1000000000000<br><br>

Because all of the first n=1000000000000 letters of the infinite string are a, we return 1000000000000.<br>
