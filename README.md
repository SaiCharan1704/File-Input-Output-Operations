# File Input/Output Operations in Java

This project implements a character stream manipulation pipeline that reads text data from a source file, alters its state to uppercase, and writes the output to a target destination file.

## 🔄 Data Pipeline Architecture

* **Buffered Streams:** Utilizing `BufferedReader` and `BufferedWriter` wraps lower-level character streams (`FileReader`/`FileWriter`). This reduces expensive OS-level disk access actions by caching blocks of data inside memory buffers before performing sequential read/write operations.
* **Dual Resource Lifecycle Management:** The `try-with-resources` block is configured with multiple declarations separated by semicolons. Java guarantees that both stream channels close successfully in reverse order of initialization, preventing memory leaks or locked file handles.
