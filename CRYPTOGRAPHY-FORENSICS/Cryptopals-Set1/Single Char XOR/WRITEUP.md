# 🛠️ Cryptopals Set 1: Challenge 4 - Detect Single-Character XOR

## 🏆 Challenge Status
* **Challenge**: One of the 60 hex-encoded strings in a file has been encrypted by single-character XOR. Find it.
* **Status**: Completed ✅
* **Secret Key**: `5` (ASCII: 53)
* **Plaintext**: `Now that the party is jumping\n`
* **Found on Line**: 171

---

## 🧠 Logic & Thought Process
This challenge expanded on Challenge 3 by introducing a larger dataset. Instead of decrypting one known string, I had to scan a file (`4.txt`) containing 60 different hex strings to find the "needle in the haystack."

### ⚙️ Implementation Strategy
1.  **File Handling**: I used the `with open("4.txt", "r") as f:` context manager to safely access the data and `enumerate(f, 1)` to track the line numbers for reporting.
2.  **Code Reuse (Challenge 3 Logic)**: I reused the core XOR brute-force logic from the previous challenge. For every line in the file, I ran a nested loop to test all 256 possible ASCII keys.
3.  **Data Sanitization**: I applied `.strip()` to each line. This was critical to remove the hidden newline characters (`\n`) that would otherwise break the `bytes.fromhex()` conversion.
4.  **Heuristic Filtering**: I used the same "space-check" heuristic (`if b" " in plaintext`) to filter out the gibberish. Since I was scanning 60 lines, I increased the strictness of the filter to look for multiple spaces to ensure I found the correct English sentence.

---
