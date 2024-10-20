module com.adfgvxcipher.adfgvx_cipher {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.adfgvxcipher.adfgvx_cipher to javafx.fxml;
    exports com.adfgvxcipher.adfgvx_cipher;
}