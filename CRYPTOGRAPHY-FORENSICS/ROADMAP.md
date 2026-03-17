# 🗺️ The Cybersecurity Learning Path: February 2026

---

### 🧱 Phase 1: The Digital Basics
* **The Concept**: Understanding how computers store information.
* **What I learned**: 
    * **Binary & Bits**: The 0s and 1s that make up everything.
    * **Hexadecimal**: Why computers use Base-16 (0-9, A-F) to represent bytes.
    * **ASCII**: How numbers are mapped to human characters (e.g., 65 = 'A').

### 🐍 Phase 2: Python for Security
* **The Concept**: Using a language to automate the math I don't want to do by hand.
* **What I learned**:
    * **Data Types**: Specifically `bytes` vs. `strings`.
    * **List Comprehensions**: Writing fast, one-line loops like `[b ^ key for b in data]`.
    * **The Standard Library**: Using `open()` to talk to the hard drive and `enumerate()` to track progress.

### ⚡ Phase 3: Introduction to XOR
* **The Concept**: The "Secret Sauce" of cryptography.
* **What I learned**:
    * **Bitwise Logic**: How the XOR gate (`^`) works.
    * **Reversibility**: If `A ^ B = C`, then `C ^ B = A`. This is why the same function encrypts and decrypts!
    * **Fixed XOR**: Performing math between two buffers of equal length.

### 🕵️ Phase 4: XOR Advanced (Cryptanalysis)
* **The Concept**: Breaking codes instead of just making them.
* **What I learned**:
    * **Keyspace Exhaustion**: Brute-forcing a single-byte key (trying all 256 possibilities).
    * **Heuristics**: Automating the "Detection of English" by looking for spaces and common letters.
    * **Bulk Processing**: Scanning entire files for hidden encrypted messages (Cryptopals Challenge 4).

---
