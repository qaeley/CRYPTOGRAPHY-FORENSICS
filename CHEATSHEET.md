# Cybersecurity Tool Cheatsheet

## Identity & Access (Web)
### [JWT.io](https://jwt.io/)
* **Purpose:** Inspecting and manipulating JSON Web Tokens (JWT).
* **Usage:** * Paste a session cookie to see its contents (like `role` or `credits`).
    * Manually edit payload details to test for **Privilege Escalation**.
    * Verify if a server is properly checking signatures.

---

## 🍳 Data Manipulation & Forensics
### [CyberChef](https://gchq.github.io/CyberChef/)
* **Purpose:** The "Cyber Swiss Army Knife" for all data tasks.
* **Common Recipes:**
    * **From Hex / To Hex:** Essential for Cryptopals Set 1.
    * **From Base64:** Decodes those long strings found in cookies.
    * **XOR:** Useful for breaking simple ciphers (Challenge 3).
    * **Magic:** A special tool that tries to "guess" what the data is if you're stuck.

---
