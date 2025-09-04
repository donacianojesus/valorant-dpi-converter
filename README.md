# DPI Sensitivity Converter

A simple tool to convert mouse sensitivity when changing DPI settings in VALORANT without doing the math manually.

## What it does

When you change your mouse DPI, you need to adjust your in-game sensitivity to maintain the same "feel" and muscle memory. This tool calculates the exact sensitivity you need so your crosshair movement stays consistent.

## How to use

### Web Version (Recommended)
1. Open `dpi_converter.html` in any web browser
2. Enter your current sensitivity and DPI
3. Enter your new desired DPI
4. Click "Convert Sensitivity" to get your new sensitivity value

### Command Line Version
1. Compile: `javac dpi.java`
2. Run: `java dpi`
3. Follow the prompts to enter your values

## Example

If you're currently playing with:
- **Sensitivity:** 0.5
- **DPI:** 800

And you want to switch to **1600 DPI**, the tool will tell you to use **0.25 sensitivity** to maintain the same effective DPI (eDPI) of 400.

## Why this matters

In VALORANT, consistency is key. By maintaining the same eDPI (effective DPI = sensitivity × DPI), your muscle memory stays intact when you change hardware or optimize your setup.

## Files

- `dpi_converter.html` - Web-based version with modern UI
- `dpi.java` - Original command-line version

---
*Created to make DPI conversions quick and painless for VALORANT players.*
