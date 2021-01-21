# <a href="https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup">SalesByMatch<a/>
Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are n = 7 socks with colors ar = [1,2,1,2,1,3,2]. There is one pair of color 1 and one of color 2 . There are three odd socks left, one of each color. The number of pairs is 2.

### Function Description <br>

Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available. <br>

sockMerchant has the following parameter(s):

-> n: the number of socks in the pile <br>
-> ar: the colors of each sock <br>


### Input Format: <br>

The first line contains an integer n, the number of socks represented in ar. <br>
The second line contains n space-separated integers describing the colors ar[i] of the socks in the pile.

### Constraints
-> 1 <= 0 n <= 100 <br>
-> 1 <= ar[i] <= 100 where 0 <= i < n <br>

### Output Format

Return the total number of matching pairs of socks that Alex can sell. <br>

### Sample Input

9 <br>
10 20 20 10 10 30 50 10 20 <br>


### Sample Output

3 <br>

### Explanation:

<img src="https://s3.amazonaws.com/hr-challenge-images/25168/1474122392-c7b9097430-sock.png"/>
