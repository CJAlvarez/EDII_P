/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Record_Manager;

/**
 *
 * @author Dennis
 */
public class File_Reader {

    void close() {
    }
    //Closes the stream and releases any system resources associated with it.

    void mark(int readAheadLimit) {
    }
    //Marks the present position in the stream.

    boolean markSupported() {
        return true;
    }
    //Tells whether this stream supports the mark() operation, which it does.

    int read() {
        return 0;
    }
    //Reads a single character.

    int read(char[] cbuf, int off, int len) {
        return 0;
    }
    //Reads characters into a portion of an array.

    String readLine() {
        return "test";
    }
    //Reads a line of text.

    boolean ready() {
        return true;
    }
    //Tells whether this stream is ready to be read.

    void reset() {
    }
    //Resets the stream to the most recent mark.

    long skip(long n) {
        return 10000;
    }

    //Skips characters
}
