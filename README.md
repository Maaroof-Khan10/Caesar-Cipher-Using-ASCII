# Caesar Cipher using ASCII in Java

This project implements the **Caesar Cipher** encryption and decryption algorithm in Java. The Caesar Cipher is one of the simplest and oldest encryption techniques, where each character in the plaintext is shifted by a fixed number of positions in the alphabet. In this version, we extend the cipher to work with **ASCII values**, allowing it to handle a wider range of characters, including letters, digits, punctuation, and spaces.

---

## Table of Contents

1. [How It Works](#how-it-works)
2. [Features](#features)
3. [Getting Started](#getting-started)
4. [Usage Instructions](#usage-instructions)
5. [Technical Details](#technical-details)
6. [License](#license)

---

## How It Works

The Caesar Cipher shifts each character in the input text by a user-defined number. Instead of just shifting alphabetic characters, this implementation works with the entire printable ASCII range (from 32 to 126), which includes spaces, punctuation, and other symbols.

### Encryption:
Each character's ASCII value is increased by the shift number (`sNum`), with wrapping around to stay within the printable range:

```java
newChar = ((currChar + sNum - 32) % 94 + 94) % 94 + 32
```

### Decryption:
To decrypt, the process is reversed, subtracting the shift value:

```java
newChar = ((currChar - sNum - 32) % 94 + 94) % 94 + 32
```

This ensures that the encrypted text remains within the printable ASCII character set.

---

## Features

- **Encrypt and Decrypt**: Convert a message into an encrypted string or recover the original message.
- **Shift Control**: You specify the shift number, which can be any value between 0 and 94.
- **ASCII Range**: The cipher supports the full range of printable ASCII characters (32-126), including spaces and punctuation.
- **Input Validation**: The program handles invalid shift values and ensures the shift remains within the acceptable range (0-94).
- **Simple CLI**: A clean command-line interface for easy interaction.

---

## Getting Started

### Prerequisites

To run this program, you’ll need:

- **Java 8 or later** installed on your machine. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
  
To check if Java is installed:

```bash
java -version
```

### Cloning the Repository

1. Clone the repository to your local machine:

```bash
git clone https://github.com/your-username/caesar-cipher-java.git
```

2. Navigate to the project directory:

```bash
cd caesar-cipher-java
```

---

### Compiling and Running the Program

To compile the Java code:

```bash
javac CaesarCipher.java
```

To run the program:

```bash
java CaesarCipher
```

---

## Usage Instructions

When you run the program, it will prompt you for:

- **Your message**: The string of text you want to encrypt or decrypt.
- **Shift number**: A number between 0 and 94 that determines the shift for the cipher.

Once provided, you'll be given a menu with options:

1. **Encrypt a string**: Encrypt the input message with the specified shift number.
2. **Decrypt a string**: Decrypt an encrypted message using the same shift number.
3. **Exit**: Exit the program.

### Example Run:

```
[CaesarCipher in Java using ASCII codes]

Enter your message or String> Hello, World!
Enter shift number (0-94)> 5

Please choose an option:
1. Encrypt a string
2. Decrypt a string
3. Exit

<#> 1

Your encrypted string is> Mjqqt-1%|twqi
```

---

## Technical Details

- **Language**: Java
- **Algorithm**: Caesar Cipher, extended to handle all printable ASCII characters (ASCII codes 32–126).
- **Shift Logic**: The cipher shifts characters based on their ASCII values, ensuring that characters wrap around when the shift moves them outside the valid ASCII range.
- **Error Handling**: The program ensures that the shift number is within a valid range (0–94) and adjusts accordingly if necessary.

### Why ASCII?

By using the full printable ASCII range, the cipher can handle a variety of characters beyond just alphabetic ones. This makes it more flexible and applicable to a wider set of data.

---

Feel free to explore the code and try it out. If you find any issues or have suggestions for improvement, feel free to open an issue or submit a pull request.

---
