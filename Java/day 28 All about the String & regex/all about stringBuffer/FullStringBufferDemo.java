/*
🔵 CORE THEORY OF STRINGBUFFER IN JAVA

✅ What is StringBuffer?
- StringBuffer is a class in Java used to create mutable (modifiable) strings.
- Unlike the String class (which is immutable), StringBuffer allows in-place editing without creating new objects.

✅ Key Features:
- Mutable: You can modify the contents (append, insert, delete, etc.).
- Synchronized: Thread-safe (safe to use in multi-threaded environments).
- Part of java.lang package (no import needed).

✅ Syntax:
    StringBuffer sb = new StringBuffer(); // Empty buffer with default capacity 16
    StringBuffer sb = new StringBuffer("Hello"); // Buffer initialized with content
    StringBuffer sb = new StringBuffer(50); // Buffer with specific capacity

✅ Common Use-Cases:
- When strings need to be modified frequently.
- When working in multi-threaded environments where StringBuilder is not safe.

✅ Important Methods:
    • append(...)              → Adds data at end (int, double, char, String, etc.)
    • insert(int, …)          → Inserts content at given position
    • replace(int, int, str)  → Replaces a range with new string
    • delete(int, int)        → Deletes a range
    • deleteCharAt(index)     → Deletes single character
    • reverse()               → Reverses content
    • charAt(index)           → Gets character at position
    • setCharAt(index, ch)    → Sets character at position
    • substring(start, [end]) → Extracts substring
    • indexOf(str)            → Finds first occurrence
    • lastIndexOf(str)        → Finds last occurrence
    • length()                → Returns length of content
    • capacity()              → Returns current buffer capacity
    • ensureCapacity(min)     → Ensures at least min capacity
    • setLength(newLen)       → Sets length (truncates or expands)
    • toString()              → Converts buffer to immutable String

✅ String vs StringBuffer vs StringBuilder:
| Feature         | String        | StringBuffer (this) | StringBuilder |
|----------------|---------------|----------------------|----------------|
| Mutable         | ❌ No         | ✅ Yes               | ✅ Yes         |
| Thread-Safe     | ✅ Yes        | ✅ Yes               | ❌ No          |
| Performance     | ❌ Slow       | ⚠️ Medium            | ✅ Fast        |
| Use-Case        | Constant text | Multi-threaded use   | Single-threaded

*/


public class FullStringBufferDemo {
    public static void main(String[] args) {

        // 1. Creating StringBuffer objects using different constructors
        StringBuffer sb1 = new StringBuffer(); // Empty buffer with default capacity
        StringBuffer sb2 = new StringBuffer("Hello"); // Buffer initialized with "Hello"
        StringBuffer sb3 = new StringBuffer(50); // Buffer with custom capacity

        // 2. append(...) - adds data at the end (method is overloaded for all types)
        sb2.append(" World");         // Appending a String
        sb2.append(123);              // Appending an int
        sb2.append('!');              // Appending a character
        sb2.append(45.67);            // Appending a double
        sb2.append(true);             // Appending a boolean

        // 3. insert(int offset, ...) - insert data at a specific position
        sb2.insert(6, "Java ");       // Inserts "Java " at index 6

        // 4. replace(int start, int end, String str) - replaces characters from start to end-1
        sb2.replace(0, 5, "Hi");      // Replaces "Hello" with "Hi"

        // 5. delete(int start, int end) - deletes characters between start and end-1
        sb2.delete(3, 8);             // Deletes "Java "

        // 6. deleteCharAt(int index) - deletes the character at a specific index
        sb2.deleteCharAt(2);          // Deletes the space after "Hi"

        // 7. reverse() - reverses the entire sequence of characters
        sb2.reverse();                // Reverse content

        // 8. charAt(int index) - returns the character at a specific index
        char ch = sb2.charAt(5);
        System.out.println("Character at index 5: " + ch);

        // 9. setCharAt(int index, char ch) - replaces the character at the specified index
        sb2.setCharAt(0, 'X');

        // 10. substring(int start) - returns substring from start to end
        String sub1 = sb2.substring(5);
        System.out.println("Substring from index 5: " + sub1);

        // 11. substring(int start, int end) - returns substring from start to end-1
        String sub2 = sb2.substring(0, 8);
        System.out.println("Substring from index 0 to 8: " + sub2);

        // 12. indexOf(String str) - first occurrence index
        int idx1 = sb2.indexOf("dlr");
        System.out.println("Index of 'dlr': " + idx1);

        // 13. indexOf(String str, int fromIndex) - from a specific index
        int idx2 = sb2.indexOf("r", 5);
        System.out.println("Index of 'r' from index 5: " + idx2);

        // 14. lastIndexOf(String str) - last occurrence
        int lastIdx = sb2.lastIndexOf("r");
        System.out.println("Last index of 'r': " + lastIdx);

        // 15. lastIndexOf(String str, int fromIndex) - before a given index
        int lastIdxFrom = sb2.lastIndexOf("r", 15);
        System.out.println("LastS index of 'r' before index 15: " + lastIdxFrom);

        // 16. length() - number of characters in the buffer
        int len = sb2.length();
        System.out.println("Length of current content: " + len);

        // 17. capacity() - current buffer size (not length)
        int cap = sb2.capacity();
        System.out.println("Current capacity: " + cap);

        // 18. ensureCapacity(int minCapacity) - ensure buffer is big enough
        sb2.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity(100): " + sb2.capacity());

        // 19. setLength(int newLength) - truncate or expand
        sb2.setLength(10);
        System.out.println("After setLength(10): '" + sb2.toString() + "'");

        // 20. toString() - convert to immutable String
        String finalStr = sb2.toString();
        System.out.println("Final content as String: " + finalStr);
    }
}
