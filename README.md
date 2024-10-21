# ADFGVX Cipher
![](https://github.com/unknownMarko/Adfgvx_Cipher/blob/master/screenshots/screenshot.png)

The ADFGVX cipher is a World War I-era encryption method used by the German military in 1918.
It combines a Polybius square with a columnar transposition.
The cipher uses a 6x6 grid containing letters and digits (0-9), which are encrypted using the
letters A, D, F, G, V, and X, corresponding to the grid's rows and columns.
After substituting the plaintext letters with these pairs of letters, a transposition phase
is applied using a keyword.
This double-layered encryption made it particularly secure for its time.

### Linux Project Setup
    sudo apt update
    sudo apt install openjdk-23-jdk
    sudo apt install maven
    mvn clean install

### Widnows Project Setup
    Install OpenJDK (ver. 23) (https://www.oracle.com/java/technologies/downloads/)
    Install Maven (https://maven.apache.org/download.cgi)
    In project folder terminal: mvn clean install

## License

This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details.