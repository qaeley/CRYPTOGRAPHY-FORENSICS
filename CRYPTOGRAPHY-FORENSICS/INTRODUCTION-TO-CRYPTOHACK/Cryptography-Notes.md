# 🔠 Encoding Standards & Representations

## 1. ASCII (American Standard Code for Information Interchange)
**Core Idea:** A 7-bit encoding standard that represents text using integers from `0` to `127`.

* **The Problem:** When encrypting data, the resulting "ciphertext" often contains bytes that are not printable ASCII characters (they look like gibberish or don't show up at all).
* **The Solution:** To share this data safely across different systems, we encode it into portable formats like Hexadecimal or Base64.

---

## 2. Hexadecimal (Base-16)
**Core Idea:** A way to represent ASCII strings as a long string of numbers ($0$-$9$) and letters ($A$-$F$).



### How it works:
1. **Ordinal Conversion:** Each letter is converted to its decimal number (e.g., `a` → `97`).
2. **Base-16 Conversion:** Those decimal numbers are converted into hexadecimal (e.g., `97` → `61`).
3. **Combination:** These hex values are joined into one continuous string (e.g., `616263...`).

---

## 3. Base64 Encoding
**Core Idea:** An encoding scheme that represents binary data using an alphabet of 64 printable ASCII characters.



### Technical Breakdown:
* **The Math:** One Base64 character encodes **6 binary digits (bits)**. 
* **The Ratio:** Therefore, **4 characters** of Base64 are used to represent **three 8-bit bytes**.
* **Common Use Case:** Base64 is the standard for the web. It allows binary data, like images, to be embedded directly into HTML or CSS files without breaking the code.

---

## 🛠️ Implementation Summary
To move between these in Python, refer to the functions in my [Python Cheat Sheet](CRYPTOGRAPHY-FORENSICS/Python-Cheatsheet.md):
* `ord()` / `chr()` for ASCII.
* `bytes.fromhex()` for Hexadecimal.
* `base64` library for Base64 conversions.

# 🧮 Mathematical Representation of Messages

## Converting Text to Numbers
Cryptosystems like **RSA** operate on mathematical numbers, but messages consist of characters. To apply mathematical operations, messages must be converted into numeric form.

### The Conversion Process:
1. **Ordinal Bytes:** Take the ordinal (ASCII/Byte) value of each character in the message.
2. **Hexadecimal Conversion:** Convert these ordinal values into hexadecimal.
3. **Concatenation:** Combine these hex values into one long string.

### Interpretation:
* The resulting string is interpreted as a **Base-16 (Hexadecimal)** number.
* This number can also be represented in **Base-10 (Decimal)** for use in cryptographic formulas.

---
**Example:**
* Message: `HELLO`
* Bytes: `72 69 76 76 79`
* Hex: `48 45 4c 4c 4f`
* Large Number: `0x48454c4c4f` (Hex) or `310400273487` (Decimal)


