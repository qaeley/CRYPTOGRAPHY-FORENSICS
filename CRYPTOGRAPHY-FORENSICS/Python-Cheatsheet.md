# 🐍 Python Core Fundamentals

This document contains essential Python concepts, syntax rules, and data structures for cybersecurity and general programming.

---

## 1. Variables and Data Assignment
**Core Idea:** Variables are named storage locations for data used to manipulate information.

* **Assignment:** Use the `=` operator (e.g., `item = "banana"`).
* **Strings:** Text data must be enclosed in single or double quotation marks.
* **Case Sensitivity:** Variable names are distinct; `item` and `Item` are different.
* **Naming Convention:** Use **underscores** for multi-word names (e.g., `item_name`).
* **Output:** Use the `print()` function to display values.
* **Concatenation:** Join strings using the `+` operator (e.g., `"hello " + name`).

---

## 2. Fundamental Data Types
**Core Idea:** Python categorizes data into types with specific properties.

| Type | Name | Example |
| :--- | :--- | :--- |
| **Integer** | `int` | Whole numbers like `10` or `-5` |
| **String** | `str` | Text data like `"apple"` |
| **Boolean** | `bool` | Truth values: `True` or `False` |
| **List** | `list` | Ordered collection `["apple", 10, True]` |

### Type Conversion
Crucial for combining different types:
* **To String:** `str(variable)` — Allows printing numbers with text.
* **To Integer:** `int(variable)` — Useful for converting user input into math-ready numbers.

---

## 3. Basic Math Operations
Python uses intuitive symbols for arithmetic:

* `+` Addition | `-` Subtraction
* `*` Multiplication | `/` Division
* `**` Exponential Power (e.g., `2 ** 3` is 8)

---

## 4. Conditional Logic (If/Else)
**Core Idea:** Allows the program to make decisions based on conditions.



```python
if age > 21:
    print("Old")
elif age == 18:
    print("Getting old")
else:
    print("Young")
```

## Loops for Repetition
**Core Idea:** Loops enable the execution of a block of code multiple times, either for a fixed count or until a condition is met.

### 1. For Loop
* **Iterates over a sequence:** Used for lists, strings, or a `range()`.
* **Range function:** `for i in range(n):` loops $n$ times, with $i$ taking values from $0$ to $n-1$.
* **Zero-based indexing:** In programming, counting almost always begins from zero.
* **Direct iteration:** You can iterate directly over list elements: `for name in name_list: print(name)`.

### 2. While Loop
* **Conditional execution:** Continues running as long as a specified condition remains `True`.
* **Infinite Loops:** Occur if the `while` condition never becomes `False` (e.g., `while True:`).
* **Break Statement:** Immediately terminates the current loop, allowing the program to continue with the code following the loop.



---

## Functions for Code Reusability
**Core Idea:** Functions are blocks of organized, reusable code that perform a specific task, promoting efficiency and modularity.

### 1. Defining a Function (`def`)
* **Syntax:** Use the `def` keyword followed by the function name and parentheses for parameters.
* **Reusability:** The primary purpose is to run the same code multiple times without rewriting the logic.
* **Example:** Calling `say_hello("Mario")` and `say_hello("Luigi")` uses the same function to produce different results based on the input.


### 2. The `pass` Keyword 
* **Null Operation:** This is a command that does literally nothing when executed.
* **Placeholder:** It is used in function definitions when you haven't implemented the logic yet.
* **Preventing Errors:** Using `pass` prevents Python from throwing a "Syntax Error" for having an empty function.

```python
# Function Definition Example
def get_internet():
    # Logic not written yet
    pass 

def say_hello(name):
    print("Hello " + name)

# Calling the function
say_hello("Mario")
```
## 🛠️ Data Transformation Functions
**Core Idea:** Essential functions for converting between human-readable text and computer-readable numbers.

| Function | Input | Output | Purpose |
| :--- | :--- | :--- | :--- |
| `len(x)` | List / String | Integer | Returns the total count of items/characters. |
| `ord("a")` | Character | Integer | Converts a character to its **ASCII number** (97). |
| `chr(97)` | Integer | Character | Converts an **ASCII number** back to a character ("a"). |

---
* **For Loop:** Automatically iterates through a list. No need to define the variable first.
  ```python
  for n in number_list:
      print(chr(n)) # Converts each number in the list
  ```

## Hex & Bytes Conversion
**Core Idea:** Essential for moving between Hexadecimal strings (common in CTFs) and raw bytes (needed for XOR and crypto math).

* **Hex to Bytes:** Use `bytes.fromhex("string")`.
* **Bytes to Hex:** Use the `.hex()` method on a byte object.

```python
# From Hex String to Bytes
raw_bytes = bytes.fromhex("68656c6c6f") 
# Result: b'hello'

# From Bytes back to Hex String
hex_string = raw_bytes.hex()
# Result: "68656c6c6f"
```
## 📦 Base64 Encoding
**Core Idea:** Converting binary data into a 64-character alphabet string for web-safe transmission.

* **Requirement:** Must include `import base64` at the top of `.py` file.
* **The Workflow:** Most challenges gives a **Hex string** that must be converted to **Bytes** before you can encode it to **Base64**.



### Example Implementation:
```python
import base64

# 1. Start with a hex string
hex_data = "726f743133"

# 2. Convert Hex to Bytes (Crucial Step!)
binary_data = bytes.fromhex(hex_data)

# 3. Encode to Base64
b64_data = base64.b64encode(binary_data)

print(b64_data) # Output: b'cm90MTM='
```
### 🔄 Base64 Decoding
**Core Idea:** Converting a Base64 encoded string back into its original raw bytes.

* **Usage:** Use `base64.b64decode()` when given a Base64 string and need to retrieve the original data.
* **The Workflow:** Base64 String -> `base64.b64decode()` -> Raw Bytes -> `.hex()` or `chr()` (depending on target format).

#### Example Implementation:
```python
import base64

# 1. Start with a Base64 string
b64_string = "cm90MTM="

# 2. Decode back to bytes
decoded_bytes = base64.b64decode(b64_string)

print(decoded_bytes) # Output: b'rot13'

# 3. Optional: Convert to a regular string
readable_text = decoded_bytes.decode()
print(readable_text) # Output: rot13
```

## 🔢 Large Number Conversion (PyCryptodome)
**Core Idea:** Converting between raw bytes and large integers for mathematical operations.

* **Requirement:** Install library via `pip install pycryptodome` (cmd prompt or terminal) and import:
  `from Crypto.Util.number import *`

```python
from Crypto.Util.number import bytes_to_long, long_to_bytes

# Convert Bytes to Large Integer (Base-10)
data = b'hello'
long_val = bytes_to_long(data) 
# Result: 448378203247

# Convert Large Integer back to Bytes
original_bytes = long_to_bytes(long_val)
# Result: b'hello'
```
## 🔧 Library Management (Pip)
**Core Idea:** Installing and managing external packages like `PyCryptodome`.


| Task | macOS / Linux (ZSH/Bash) | Windows (PowerShell/CMD) |
| :--- | :--- | :--- |
| **Install Library** | `pip3 install pycryptodome` | `pip install pycryptodome` |
| **Safe Install** | `python3 -m pip install pycryptodome` | `python -m pip install pycryptodome` |
| **List Packages** | `pip3 list` | `pip list` |
| **Search Package** | `pip3 list | grep Crypto` | `pip list | findstr Crypto` |

### ⚠️ Critical Rules
1. **Terminal Only:** Commands must be run in the VS Code terminal, not inside the `.py` script.
2. **Naming Difference:** * Package name (to install): `pycryptodome`
   * Module name (to import): `Crypto`
3. **Interpreter Mismatch:** If `ModuleNotFoundError` persists after install, check the **Python Interpreter** in the bottom-right corner of VS Code to ensure it matches the version where you ran `pip3`.
