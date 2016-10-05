Pawel and Shaka recently became friends. They believe their friendship will last forever if they merge their favorite strings.

The lengths of their favorite strings are the same, n. Mingling two strings, P=p1p2...pn and Q=q1q2...qn, both of length n, will result in the creation of a new string R of length 2×n. It will have the following structure:

R=p1q1p2q2...pnqn
You are given two strings P (Pawel's favorite) and Q (Shaka's favorite), determine the mingled string R.

Input Format

The first line of input contains the string P. 
The second line contains Q.

Output Format

Print the mingled string, R.

Constraints

1=n=10^5 
The string only consists of lowercase English characters (a-z). 
length(P) = length(Q) =n
Sample Input #00

abcde
pqrst
Sample Output #00

apbqcrdset
Sample Input #01

hacker
ranker
Sample Output #01

hraacnkkeerr
Explanation

Sample Case #00:

P=a   b   c   d   e
Q=p   q   r   s   t
R=ap bq cr ds et 


Sample Case #01:

P=h   a   c   k   e   r 
Q=r   a   n   k   e   r 
R=hr aa cn kk ee rr