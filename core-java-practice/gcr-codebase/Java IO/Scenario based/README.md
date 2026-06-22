This folder contains small Java programs demonstrating File I/O scenarios:

- SchoolResultPortal.java  -- read `school_results.txt`, compute averages, append report to `report_card.txt`. Run `java SchoolResultPortal` to generate report; `java SchoolResultPortal add` to append a new result interactively.
- FeedbackAnalyzer.java   -- reads 5 feedback lines from console and counts messages containing "good".
- DailyExpenseLogger.java -- append expenses to `expenses.txt`. Enter lines like `Food - 200`, blank line to finish.
- GroceryBillReader.java  -- reads `bill.txt`, prints lines and prints total line count.

Files created are relative to this folder. All writes use append mode so existing data is preserved.
