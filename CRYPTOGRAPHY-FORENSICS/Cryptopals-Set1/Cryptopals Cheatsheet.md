# 🏴‍☠️ Cryptopals Mastery: File I/O & Data Sanitization

This cheatsheet tracks the specialized Python syntax required to handle large cryptographic datasets and "needle-in-a-haystack" brute-force attacks.

---

### 1. The Context Manager: `with open()`
**Concept:** Opens a file safely and ensures it closes automatically when the code block ends.

**Syntax:**
`with open("file_name", "mode") as alias:`

* **`"file_name"`**: The path to your file (e.g., `"4.txt"`).
* **`"mode"`**: 
    * `"r"`: Read (default).
    * `"w"`: Write (overwrites existing).
    * `"a"`: Append (adds to the end).
* **`as alias`**: Assigns a temporary name (like `f`) to the file so you can refer to it in your code.

---

### 2. The Iterator: `enumerate()`
**Concept:** Wraps an "iterable" (like an open file) to provide a running count alongside the data.

**Syntax:**
`enumerate(iterable, start=0)`

* **`iterable`**: The object you want to count (the file `f`).
* **`start=1`**: Tells Python to begin counting at 1 (useful for matching human line numbers in a text editor).

---

### 3. Variable Unpacking: `line_number, line`
**Concept:** Assigning multiple values returned by a function to separate variables in a single line.

**Syntax:**
`for var1, var2 in enumerate():`

* **`line_number`**: Catches the integer (the count) from `enumerate`.
* **`line`**: Catches the string (the actual content of the line).

---

### 4. String Sanitization: `.strip()`
**Concept:** Removes leading/trailing whitespace and hidden characters.

**Syntax:**
`string_variable.strip()`

* **Why?** Files contain invisible `\n` (newline) characters at the end of every line. These characters are **not** part of the hex data and will cause `bytes.fromhex()` to throw an error if not removed.

---

### 🛠️ The "Challenge 4" Master Template
This is the standard structure for scanning a file line-by-line for a single-byte XOR key.

```python
# 1. Open '4.txt' in Read mode as the variable 'f'
with open("4.txt", "r") as f:
    
    # 2. Loop through every line, starting the count at 1
    for line_number, line in enumerate(f, 1):
        
        # 3. Clean the line and convert the hex string to bytes
        ciphertext = bytes.fromhex(line.strip())
        
        # 4. Nested Loop: Try every possible 1-byte key (0-255)
        for key in range(256):
            plaintext = bytes([b ^ key for b in ciphertext])
            
            # 5. Heuristic: Check if the result looks like English
            if b" " in plaintext:
                print(f"Found on Line {line_number} | Key {key}: {plaintext}")
