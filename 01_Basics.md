# Groovy Basics: A Quick Start Guide

This guide introduces the basic syntax of **Groovy**, starting with a simple Hello World program and exploring essential elements like imports, tokens, comments, semicolons, and identifiers.

---

## 📘 Hello World in Groovy

Your first Groovy program can be as simple as this:

    class Demo {
        static void main(String[] args) {
            println('Greetings from Groovy!')
        }
    }

**Output:**

    Greetings from Groovy!

---

## 📦 Import Statements

Groovy allows importing libraries using the `import` keyword. Here's an example:

    import groovy.xml.MarkupBuilder

    def html = new MarkupBuilder()

Groovy automatically imports several common packages:

    import java.lang.*
    import java.util.*
    import java.io.*
    import java.net.*

    import groovy.lang.*
    import groovy.util.*

    import java.math.BigDecimal
    import java.math.BigInteger

---

## 🧩 Tokens in Groovy

Tokens are the smallest units in a program. These can be:

- Keywords
- Identifiers
- Constants
- String literals
- Symbols

Example:

    println("Welcome to Groovy!")

In this example:
- `println` is a keyword
- `"Welcome to Groovy!"` is a string literal

---

## 💬 Comments

Groovy supports both single-line and multi-line comments.

**Single-line comment:**

    // Print a message to the console
    println('Hello again')

**Multi-line comment:**

    /* This is a sample program
       demonstrating multi-line comments */
    println('Groovy is fun!')

---

## 🔚 Semicolons

Semicolons are optional in Groovy. You may include them, but they are not required.

    def a = 10
    println('No semicolon needed')

This is also valid:

    def a = 10;
    println('Semicolon used');

---

## 🆔 Identifiers

Identifiers are used for naming variables, methods, etc. They must:

- Start with a letter, `_`, or `$`
- Not begin with a number

**Valid examples:**

    def userName
    def score_2025
    def $amount

**Using identifiers in context:**

    class Demo {
        static void main(String[] args) {
            def counter = 3
            println("Counter value: $counter")
        }
    }

---
