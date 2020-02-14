# Java FileReader Class
Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.
It is character-oriented class which is used for file handling in java.

### Constructors of FileReader class
Constructor | Description
------------ | -------------
FileReader(String file) | It gets filename in string. It opens the given file in read mode. If file doesn't exist, it throws FileNotFoundException.
FileReader(File file) |	It gets filename in file instance. It opens the given file in read mode. If file doesn't exist, it throws FileNotFoundException.

### Methods of FileReader class
Constructor | Description
------------ | -------------
int read() | It is used to return a character in ASCII form. It returns -1 at the end of file.
void close() | It is used to close the FileReader class.
