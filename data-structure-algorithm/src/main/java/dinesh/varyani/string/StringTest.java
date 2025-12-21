package dinesh.varyani.string;

public class StringTest {
    public static void main(String[] args) {


        String s1="abc123";
        String s2="abc"+123;
        int i=123;
        String s3="abc"+i;

        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s2==s3);//false


        /**
         * Great Java interview question! Let’s analyze your code:
         *
         * ```java
         * String s1 = "abc123";
         * String s2 = "abc" + 123;
         * int i = 123;
         * String s3 = "abc" + i;
         * System.out.println(s2 == s3); // false
         * ```
         *
         * ### **Step-by-step Explanation**
         *
         * #### 1. **Compile-time constants**
         * - `String s2 = "abc" + 123;`
         *   - Here both `"abc"` and `123` are compile-time constants.
         *   - The compiler evaluates `"abc" + 123` to `"abc123"` **at compile time**.
         *   - So, `s2 = "abc123";` (It's interned, i.e., the literal from the string pool).
         *
         * #### 2. **Runtime concatenation**
         * - `int i = 123;`
         * - `String s3 = "abc" + i;`
         *   - Here, although `i` is 123, the compiler does NOT see `"abc"+i` as a constant expression because `i` is a _variable_ (even if its value is constant).
         *   - **At runtime**, `"abc"` and `i` are concatenated using `StringBuilder`.
         *   - Result: a new String object is created in heap (not from the interned string pool).
         *
         * #### 3. **The `==` operator**
         * - Compares object references, not content.
         * - `s2 == s3` is **false** because `s2` points to the interned string `"abc123"` in the string pool, but `s3` is a new object on the heap with the same content.
         *
         * ***
         *
         * ### **How to compare contents?**
         * Use `.equals()`:
         * ```java
         * System.out.println(s2.equals(s3)); // true
         * ```
         *
         * ***
         *
         * ### **Summary Table**
         *
         * | Variable | Value     | How created            | Memory location      |
         * |----------|-----------|------------------------|----------------------|
         * | s1       | "abc123"  | literal/interned       | String pool          |
         * | s2       | "abc123"  | compile-time constant  | String pool          |
         * | s3       | "abc123"  | runtime concatenation  | Heap (not interned)  |
         *
         * ***
         *
         * ### **Key takeaway**
         * - `==` checks for reference equality.
         * - `.equals()` checks for content equality.
         * - **Compile-time** constants using only literals are interned and reference-equal.
         * - Concatenation with variables results in a new runtime object, not reference-equal to a string constant.
         *
         * That’s why `System.out.println(s2 == s3); // false`!
         */
    }
}
