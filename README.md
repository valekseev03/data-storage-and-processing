# data-storage-and-processing

## How-To-Run:
1. Install Java (uses libraries from java.util)
2. Move InMemoryDB.java file into same package as main file
3. In main file instantiate class using, <code>InMemoryDB inmemoryDB = new InMemoryDB();</code> 
4. Call appropriate functions <code>inmemoryDB.put("A", 1)</code>
5. For .get() the output is an java.util.Optional (use .isEmpty() to determine if null and .get() to get the integer value if the value isn't null) <code>inmemoryDB.get("keyValue").get()</code>

## Assignment-Modification: 
To grade this assignment a test file with testcases should be generated that runs the code and compares the outputs to the expected values. 
These test cases need to be all inclusive so that all possible cases are covered. 
Instructions could include possible restrictions on what classes are not allowed, example of what to do if begin_transaction() is called in the middle of a transaction, and a requirement to summarize the user's code in a couple of sentences. 
A possible method that could be included could be to return a list (array in java) of all of the keys in the database (and possibly their values).
