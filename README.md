Problem Statement

You are given a string S consisting of uppercase and lowercase English letters.

Process each character of the string from left to right using 0-based indexing.

If the character is a vowel (a, e, i, o, u, A, E, I, O, U):

Let i be the index of that character.

Compute res = i × 5.

Find the sum of all odd numbers from 1 to res (inclusive).

Compute the digital root of that sum (repeatedly add the digits until a single digit remains).

Replace the vowel with this single-digit number.

If the character is not a vowel, keep the character unchanged.

Print the final transformed string.

Input Format

A single line containing a string S.

Output Format

Print the modified string after applying the above transformation.

Constraints

1 ≤ |S| ≤ 1000

S contains only alphabetic characters (A–Z, a–z)

Indexing starts from 0

Output must be printed without spaces

Example
Input
program
Output
pr7gr7m
Explanation
Index	Character	Action
0	p	Not vowel → print p
1	r	Not vowel → print r
2	o	Vowel → res=10 → odd sum=25 → digital root=7
3	g	Not vowel → print g
4	r	Not vowel → print r
5	a	Vowel → res=25 → odd sum=169 → digital root=7
6	m	Not vowel → print m
