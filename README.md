# RubineClassifier

## Overview

This project implements **Rubine's algorithm** for gesture classification, developed as part of an algebra practical work. The repository includes an implementation of the **Gauss pivot method**, which is a core component in the gesture classification process.

## Project Description

The **RubineClassifier** is designed to classify gestures based on Rubine's algorithm, a method that leverages geometric and kinematic features of gestures for recognition. The project includes an implementation of **Gaussian elimination with partial pivoting** (Pivot de Gauss) to solve linear systems, which is integral to the algorithm's functionality.

### Key Features
- **Gesture Classification**: Implements Rubine's algorithm to recognize and classify gestures based on extracted features.
- **Gauss Pivot Algorithm**: Solves linear systems using Gaussian elimination with partial pivoting to handle matrix operations efficiently.
- **Algebraic Foundations**: Demonstrates the application of linear algebra concepts in practical gesture recognition tasks.

## Gauss Pivot Algorithm

The repository includes an implementation of the **Gauss pivot algorithm** (Gaussian elimination with partial pivoting), which is summarized as follows:

1. For each column \( k \) from 0 to \( n-1 \):
   - Find the pivot row \( p \) such that \( a_{pk} \) is the maximum in column \( k \) for rows \( m \) from \( k \) to \( n+1 \).
   - Swap row \( p \) with row \( k \).
   - If the pivot element \( a_{kk} \neq 0 \):
     - Normalize row \( k \) by dividing \( a_{kl} \) and \( m_{kl} \) by \( a_{kk} \) for all \( l \) from 0 to \( n-1 \).
     - For each row \( i \neq p \):
       - Compute \( c = a_{ik} \).
       - Update row \( i \): subtract \( c \cdot a_{kj} \) from \( a_{ij} \) and \( c \cdot m_{kj} \) from \( m_{ij} \) for all \( j \).
   - If \( a_{kk} = 0 \), the matrix is singular, and an error message is printed ("Matrice singulière").

This algorithm ensures numerical stability by selecting the largest pivot element in each step, which is critical for solving the linear systems involved in Rubine's algorithm.

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/alderaan11/RubineClassifier.git
