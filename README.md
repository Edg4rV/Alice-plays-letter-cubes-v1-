# Alice-plays-letter-cubes-v1-Knuth-Morris-Pratt algorithm in Java
Alice likes playing letter cubes. She has constructed a word from them and some of the cubes remain unused. Now, she chooses a new cube from the unused ones and adds it to the beginning of the current word. The question that wonders her a lot: how many new subwords does the cube add to the current word? Your task here is to write a program that helps Alice answer her question.

Input: the first line contains a string ss. The second line contains an integer kk. The third line contains kk symbols separated by spaces.

Output: for each symbol cc from the input, print the number of distinct substrings in a string cscs that are not presented in a string ss. All numbers should be separated by spaces.

 Report a typo
Sample Input 1:

abacaba
3
a b c
Sample Output 1:

7 6 4
Sample Input 2:

ab
3
a b c
Sample Output 2:

2 2 3
