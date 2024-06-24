Q1. Crazy Zak has designed the steps below, which can be applied to any given string (sentence) to produce a number.
STEP1. In each word, find the Sum of the Difference between the first letter and the last letter, the second letter and the penultimate letter, and so on till the centre of the word.
STEP2. Concatenate the sums of each word to form the result.
For example-
If the given string is "WORLD WIDE WEB
STEP1. In each word find the Sum of the Difference between the first letter and the last letter, the second letter and the penultimate letter, and so on till the center of the word
WORLD (W-DJ-IO-L+IRI [23-4]+[15-12]+[18] [19]+[3]+[18] = [40]
WIDE [W-E][TD][23-5]+[94][18]+[5] = [23] WER [WB]+[E]=123-2]+[5]=[21]+[5] [26]
STEP2. Concatenate the sums of each word to form the result
(40) (23) (26)
The answer (output) should be the number 402326
NOTE1:The value of each letter is its position in the English alphabet system Le a-Ast b-5-2 C and so on till z=Z-26
So the result will be the same for WORLD WIDE WEB or "World Wide Web or "worldwide wedo arty other combination of uppercase and lowercase letters 
Note: In Step 1, we should use the absolute values to calculate the sum after subtracting the alphabet. For instance, in the below example, both [H-O) and (E-L] result in the negative number -7, but the positive number 7 (absolute value of -7) is used for calculating the sum of the differences. Hello [H-O)+[E-L]+[L]=[8-15]+[5-12]+[12]=[7]+[7]+[12] = [26]
Assumptions: The given string (sentence) will contain only alphabet characters and there will be only one space character between any two consecutive words.
You'll need to help Zak, by writing a function that takes a string (sentence) as input, performs the above-mentioned processing on the sentence and returns the result (number).

Example 1:
Input1 "World Wide Web 
output1 402326
Example2:
input "Hello World"
output1 2640 
