# Challenge Write-up: CryptoHack - ASCII

## 🛠️ Phase 1: Building the Foundation
Before attempting the challenge, I realized I needed to understand how Python handles data. I spent time documenting the core fundamentals (Variables, Loops, and Functions) to ensure I could write my own scripts instead of relying on online converters.

**My Reference:** [Python Fundamentals & Cheatsheet]([./PYTHON_CHEAT_SHEET.md](https://github.com/qaeley/CYBERSECURITY/blob/e32b1bb1f09f8ae155d7e41c5e6f902dc74c511b/CRYPTOGRAPHY-FORENSICS/Python-Cheatsheet.md))

---

## 🔍 Phase 2: Solving the Challenge
The challenge provided a list of integers: `[99, 114, 121, 112, 116, 111, 123, ... 125]`.

### 🧠 My Logic
1. I recognized that these numbers represent **ASCII values**.
2. I needed a way to transform these integers back into human-readable characters.
3. Using my cheatsheet, I identified that the `chr()` function is designed for this exact task.

### 💻 The Script
I wrote a Python script using a `for` loop to automate the conversion for every number in the list:

```python
number_list = [99, 114, 121, 112, 116, 111, 123, 65, 83, 67, 73, 73, 95, 112, 114, 49, 110, 116, 52, 98, 108, 51, 125]

flag = ""
for n in number_list:
    flag += chr(n)

print(flag)
