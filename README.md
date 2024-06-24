Q1. Crazy Zak has designed the below steps which can be applied on any given string (sentence) to produce a number.

STEP1. In each word, find the Sum of the Difference between the first letter and the last letter, second letter and the penultimate letter, and so on till the center of the word.

STEP2. Concatenate the sums of each word to form the result.

For example-

If the given string is "WORLD WIDE WEB

STEP1. In each word find the Sum of the Difference between the first letter and the last letter, second letter and the penultimate letter, and soon till the center of the word

WORLD (W-DJ-IO-L+IRI [23-4]+[15-12]+[18] [19]+[3]+[18] = [40]

WIDE [W-E][TD][23-5]+[94][18]+[5] = [23] WER [WB]+[E]=123-2]+[5]=[21]+[5] [26]

STEP2. Concatenate the surms of each word to form the result

(40) (23) (26)

1402379)

The answer (output) should be the number 402326

NOTE1:The value of each letter is its position in the English alphabet system Le a-Ast b-5-2 C and so on till z=Z-26

So the result will be the same for WORLD WIDE WEB or "World Wide Web or "world wide wedo arty other combination of uppercase and lowercase lettersIMPORTANT Note: In Step1, after subtracting the alphabets, we should use the absolute values for calculating the sum. For instance, in the below example, both [H-O) and (E-L] result in negative number -7, but the positive number 7 (absolute value of -7) is used for calculating the sum of the differences. Hello [H-O)+[E-L]+[L]=[8-15]+[5-12]+[12]=[7]+[7]+[12] = [26]

Assumptions: The given string (sentence) will contain only alphabet characters and there will be only one space character between any two consecutive words.

You are expected to help Zak, by writing a function that takes a string (sentence) as input, performs the above mentioned processing on the sentence and returns the result (number).

Example 1:

Input1 "World Wide Web output1 402326

Example2:

inputt "Hello World"

output1 2640 Exalacations

HH-E-L1+1]=[8-15]+[5-12)+[1277)+(12) [26] Wold [W-01-10-11+123-4+115-12]+[18][19]+[3]+[18]=[40] Samut Number formed by concatenating [26] and [40] 2640
