Here’s a clean, GitHub-formatted version of your README, ready to copy and paste directly into a README.md file:

⸻

🧮 CSC211: Practical 2 — Crèche Contact Tracing

📘 1. Overview and Problem Description

This assignment focuses on algorithm analysis and implementation by solving a contact tracing problem within a crèche environment.

The goal is to determine how many distinct pairs of babies are present at the crèche at the same time, based on their arrival and departure times.
	•	Input: A list of n babies, where each baby i has an arrival time aᵢ and a departure time dᵢ.
	•	Goal: Compute the number of unique pairs (i, j) such that their time intervals [aᵢ, dᵢ] and [aⱼ, dⱼ] overlap.

⸻

⚙️ 2. Algorithmic Solution — O(n²) Time Complexity

As per the assignment requirements, the initial implementation must be a straightforward O(n²) algorithm.

💡 Approach: Brute-Force Pairwise Comparison

The $O(n^2)$ solution uses a brute-force approach, comparing every unique pair of babies to check if their time intervals overlap.

Steps
	1.	Data Storage:
Store all arrival and departure times in a 2D array or similar structure,
e.g. babyTimes[i][0] = aᵢ and babyTimes[i][1] = dᵢ.
	2.	Outer Loop:
Iterate through babies using index i from 0 to n - 2.
	3.	Inner Loop:
For each baby i, iterate through the subsequent babies using index j from i + 1 to n - 1.
This ensures each pair (i, j) is checked only once.
	4.	Overlap Check (Core Logic):
Two intervals [aᵢ, dᵢ] and [aⱼ, dⱼ] overlap if and only if:

(aᵢ < dⱼ) && (aⱼ < dᵢ)


	5.	Tally Pairs:
If the overlap condition holds, record the pair (i, j).
	6.	Output:
Print the total count and list of all overlapping pairs.

🧩 Time Complexity Justification
	•	Outer loop → runs (n - 1) times
	•	Inner loop → runs approximately n times per outer iteration
	•	Total comparisons → n(n - 1) / 2

Hence, the algorithm runs in O(n²) time.

⸻

▶️ 3. Usage Instructions

✅ Prerequisites
	•	Java Development Kit (JDK) installed
	•	Command-line interface or IDE capable of running Java programs

🧠 Running the Program
	1.	Compile the Program

javac contactTracing.java


	2.	Run the Program

java contactTracing


	3.	Example Input

How many pairs of baby: 5
Give the times of arrival (i) and departure (j), e.g.: 2,4
2,4
3,6
8,9
10,11
7,11


	4.	Example Output

The distinct pairs of babies who are at the crèche simultaneously are
(1, 2) (3, 5) (4, 5)



⸻

🌟 4. Bonus Question (Optional Extension)

The assignment includes a bonus question encouraging exploration of improved time complexity.

A faster approach — potentially O(n log n) — can be achieved using a sweep-line algorithm:
	•	Treat all arrival and departure times as “events”.
	•	Sort these events by time.
	•	Traverse them in order, tracking how many babies are currently present.

This eliminates the need for pairwise comparisons while preserving correctness.
A full explanation and implementation details are provided in the accompanying report.

⸻

Author: Kaamiel Isaacs
Course: CSC211
Year: 2023
Assignment: Practical 2
File: contactTracing.java

⸻
