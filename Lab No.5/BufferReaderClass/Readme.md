### Java BufferedReader Class
Java BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method. It makes the performance fast. It inherits Reader class.

### Java BufferedReader class declaration
Let's see the declaration for Java.io.BufferedReader class:
public class BufferedReader extends Reader

### Java BufferedReader class constructors
Constructor |	Description
---------- | ----------
BufferedReader(Reader rd) |	It is used to create a buffered character input stream that uses the default size for an input buffer.
BufferedReader(Reader rd, int size) |	It is used to create a buffered character input stream that uses the specified size for an input buffer.

### Java BufferedReader class methods
Method | Description
---------- | ----------
int read() | It is used for reading a single character.
int read(char[] cbuf, int off, int len) | It is used for reading characters into a portion of an array.
boolean markSupported() | It is used to test the input stream support for the mark and reset method.
String readLine() | It is used for reading a line of text.
boolean ready() |It is used to test whether the input stream is ready to be read.
long skip(long n) | It is used for skipping the characters.
void reset() | It repositions the stream at a position the mark method was last called on this input stream.
void mark(int readAheadLimit) | It is used for marking the present position in a stream.
void close() | It closes the input stream and releases any of the system resources associated with the stream.

 






