# String Transformation Using Vowel Index Logic

## 📌 Problem Statement

You are given a **string `S`** consisting of uppercase and lowercase English letters.

Process each character of the string from **left to right** using **0-based indexing**.

### Rules

1. If the character is a **vowel**  
   (`a, e, i, o, u, A, E, I, O, U`):

   - Let `i` be the **index** of that character.
   - Compute:
     
     ```
     res = i × 5
     ```

   - Find the **sum of all odd numbers from 1 to `res` (inclusive)**.

   - Compute the **digital root** of that sum  
     (keep adding digits until a single digit remains).

   - Replace the vowel with the **resulting single digit**.

2. If the character is **not a vowel**, keep it **unchanged**.

Finally, print the **transformed string**.

---

## 📥 Input Format

- A single line containing a **string `S`**.

---

## 📤 Output Format

- Print the **modified string** after applying the transformation rules.

---

## 📊 Constraints

- `1 ≤ |S| ≤ 1000`
- `S` contains only **alphabetic characters** (`A–Z`, `a–z`)
- Indexing is **0-based**
- Output must be printed **without spaces**

---

## 🧠 Example

### Input

program


### Step-by-Step Processing

| Index | Character | Operation |
|------|-----------|-----------|
|0|p|Not vowel → print `p`|
|1|r|Not vowel → print `r`|
|2|o|Vowel → res = 2×5 = 10 → odd sum = 25 → digital root = 7|
|3|g|Not vowel → print `g`|
|4|r|Not vowel → print `r`|
|5|a|Vowel → res = 5×5 = 25 → odd sum = 169 → digital root = 7|
|6|m|Not vowel → print `m`|

### Output

pr7gr7m


---

## ⚙️ Algorithm Overview

1. Read the input string.
2. Iterate through each character using its index.
3. Check if the character is a vowel.
4. If vowel:
   - Multiply index by `5`
   - Sum all odd numbers up to that value
   - Compute the digital root
5. Replace the vowel with the computed digit.
6. Otherwise print the character as it is.
