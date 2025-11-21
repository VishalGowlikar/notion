# Thoughtful Automation Challenge — Package Sorting (Java)

## Objective
Implement a function `sort(width, height, length, mass)` that classifies packages into 3 stacks:
- STANDARD
- SPECIAL
- REJECTED

## Rules

### Bulky
A package is **bulky** if:
- volume ≥ 1,000,000 cm³  
  OR
- any dimension ≥ 150 cm

### Heavy
A package is **heavy** if:
- mass ≥ 20 kg

### Stack Rules
- **STANDARD** → not bulky AND not heavy  
- **SPECIAL** → bulky OR heavy  
- **REJECTED** → bulky AND heavy  

## How to Run

Compile:
```bash
javac PackageSorter.java
