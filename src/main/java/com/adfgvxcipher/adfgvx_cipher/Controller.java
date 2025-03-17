package com.adfgvxcipher.adfgvx_cipher;

import com.adfgvxcipher.adfgvx_cipher.lib.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import java.util.ArrayList;
import java.util.Arrays;

public class Controller {



    @FXML
    private GridPane adfgvx_grid;

    @FXML
    private Label adfgvx_gridLabel0;

    @FXML
    private Label adfgvx_gridLabel1;

    @FXML
    private Label adfgvx_gridLabel10;

    @FXML
    private Label adfgvx_gridLabel11;

    @FXML
    private Label adfgvx_gridLabel12;

    @FXML
    private Label adfgvx_gridLabel13;

    @FXML
    private Label adfgvx_gridLabel14;

    @FXML
    private Label adfgvx_gridLabel15;

    @FXML
    private Label adfgvx_gridLabel16;

    @FXML
    private Label adfgvx_gridLabel17;

    @FXML
    private Label adfgvx_gridLabel18;

    @FXML
    private Label adfgvx_gridLabel19;

    @FXML
    private Label adfgvx_gridLabel2;

    @FXML
    private Label adfgvx_gridLabel20;

    @FXML
    private Label adfgvx_gridLabel21;

    @FXML
    private Label adfgvx_gridLabel22;

    @FXML
    private Label adfgvx_gridLabel23;

    @FXML
    private Label adfgvx_gridLabel24;

    @FXML
    private Label adfgvx_gridLabel25;

    @FXML
    private Label adfgvx_gridLabel26;

    @FXML
    private Label adfgvx_gridLabel27;

    @FXML
    private Label adfgvx_gridLabel28;

    @FXML
    private Label adfgvx_gridLabel29;

    @FXML
    private Label adfgvx_gridLabel3;

    @FXML
    private Label adfgvx_gridLabel30;

    @FXML
    private Label adfgvx_gridLabel31;

    @FXML
    private Label adfgvx_gridLabel32;

    @FXML
    private Label adfgvx_gridLabel33;

    @FXML
    private Label adfgvx_gridLabel34;

    @FXML
    private Label adfgvx_gridLabel35;

    @FXML
    private Label adfgvx_gridLabel4;

    @FXML
    private Label adfgvx_gridLabel5;

    @FXML
    private Label adfgvx_gridLabel6;

    @FXML
    private Label adfgvx_gridLabel7;

    @FXML
    private Label adfgvx_gridLabel8;

    @FXML
    private Label adfgvx_gridLabel9;

    @FXML
    private GridPane adfgx_grid;

    @FXML
    private Label adfgx_gridLabel0;

    @FXML
    private Label adfgx_gridLabel1;

    @FXML
    private Label adfgx_gridLabel10;

    @FXML
    private Label adfgx_gridLabel11;

    @FXML
    private Label adfgx_gridLabel12;

    @FXML
    private Label adfgx_gridLabel13;

    @FXML
    private Label adfgx_gridLabel14;

    @FXML
    private Label adfgx_gridLabel15;

    @FXML
    private Label adfgx_gridLabel16;

    @FXML
    private Label adfgx_gridLabel17;

    @FXML
    private Label adfgx_gridLabel18;

    @FXML
    private Label adfgx_gridLabel19;

    @FXML
    private Label adfgx_gridLabel2;

    @FXML
    private Label adfgx_gridLabel20;

    @FXML
    private Label adfgx_gridLabel21;

    @FXML
    private Label adfgx_gridLabel22;

    @FXML
    private Label adfgx_gridLabel23;

    @FXML
    private Label adfgx_gridLabel24;

    @FXML
    private Label adfgx_gridLabel3;

    @FXML
    private Label adfgx_gridLabel4;

    @FXML
    private Label adfgx_gridLabel5;

    @FXML
    private Label adfgx_gridLabel6;

    @FXML
    private Label adfgx_gridLabel7;

    @FXML
    private Label adfgx_gridLabel8;

    @FXML
    private Label adfgx_gridLabel9;

    @FXML
    private Label adfgx_matrix_data_error;

    @FXML
    private Label adfgvx_matrix_data_error;

    @FXML
    private TextArea area_adfgvx_tran_matrix;

    @FXML
    private TextArea area_adfgx_tran_matrix;

    @FXML
    private TextArea area_adfgx_tran_matrix_ordered;

    @FXML
    private TextArea area_adfgvx_tran_matrix_ordered;

    @FXML
    private TextArea area_adfgx_output;

    @FXML
    private TextArea area_adfgvx_output;

    @FXML
    private Button btn_encrypt;

    @FXML
    private Button btn_decrypt;

    @FXML
    private TextField field_adfgvx_input_filtered;

    @FXML
    private TextField field_adfgvx_output;

    @FXML
    private TextField field_adfgvx_sub_matrix_data;

    @FXML
    private TextField field_adfgx_sub_matrix_result;

    @FXML
    private TextField field_adfgvx_sub_matrix_result;

    @FXML
    private TextField field_adfgx_input_filtered;

    @FXML
    private TextField field_adfgx_output;

    @FXML
    private TextField field_adfgx_sub_matrix_data;

    @FXML
    private TextField field_input;

    @FXML
    private TextField field_key;

    @FXML
    private TextField field_key_filtered;

    @FXML
    private RadioButton radio_czech;

    @FXML
    private RadioButton radio_english;

    @FXML
    private Text text_language_change_char;

    //VARIABLES
    ToggleGroup radioToggle = new ToggleGroup();

    format_key formatKey = new format_key();
    format_encrypt formatEncrypt = new format_encrypt();
    format_decrypt formatDecrypt = new format_decrypt();
//    MatrixFunctions matrixFunctions = new MatrixFunctions();

    String adfgxMatrix = "";
    String adfgvxMatrix = "";

    String adfgxSubMatrixOutput = "";
    String adfgvxSubMatrixOutput = "";

    String formattedKey = "";
    boolean encrypt = false;

    ArrayList<Object[]> adfgxData = new ArrayList<>();
    ArrayList<Object[]> adfgvxData = new ArrayList<>();

    //INIT GUI
    @FXML
    void initialize() {
        //Language
        radio_english.setToggleGroup(radioToggle);
        radio_czech.setToggleGroup(radioToggle);

        radio_english.setSelected(true);
        text_language_change_char.setText("J → I");

        //Random ADFGX Matrix
        adfgxMatrix = MatrixFunctions.adfgxGenerateMatrix("EN");
        field_adfgx_sub_matrix_data.setText(adfgxMatrix);
        fillMatrix(adfgxMatrix, "adfgx", 5);

        //Random ADFGVX Matrix
        adfgvxMatrix = MatrixFunctions.adfgvxGenerateMatrix();
        field_adfgvx_sub_matrix_data.setText(adfgvxMatrix);
        fillMatrix(adfgvxMatrix, "adfgvx", 6);
    }

    @FXML
    void handleEncryptButton(ActionEvent event) {
        adfgxData = new ArrayList<>();
        adfgvxData = new ArrayList<>();

        encrypt = true;

        handleInput(null);
        handleKey(null);

        //Getting positions in matrix of Input Chars
        StringBuilder adfgxPositions = new StringBuilder();
        StringBuilder adfgvxPositions = new StringBuilder();

        for (int i = 0; i < field_adfgx_input_filtered.getLength(); i++) {
            adfgxPositions.append(filterLocation(MatrixFunctions.matrixGetCharLocation(field_adfgx_input_filtered.getText().charAt(i), adfgxMatrix, 5), "ADFGX"));
        }

        for (int i = 0; i < field_adfgvx_input_filtered.getLength(); i++) {
            adfgvxPositions.append(filterLocation(MatrixFunctions.matrixGetCharLocation(field_adfgvx_input_filtered.getText().charAt(i), adfgvxMatrix, 6), "ADFGVX"));
        }

        //Putting positions into global variables
        adfgxSubMatrixOutput = adfgxPositions.toString();
        adfgvxSubMatrixOutput = adfgvxPositions.toString();

        //Calling Transposing Matrix Function
        //If Input is not empty.
        if (!formattedKey.isEmpty()) {
            formatTransposingMatrix();
            field_adfgx_output.setText(format_key.encrypt(adfgxData));
            field_adfgvx_output.setText(format_key.encrypt(adfgvxData));
        }
    }

    // Self-explanatory..
    @FXML
    void handleDecryptButton(ActionEvent event) {
        encrypt = false;

        handleInput(null);
        handleKey(null);

        if (!formattedKey.isEmpty()) {
            formatTransposingMatrix();
        }
    }

    //Handle Input Field
    @FXML
    void handleInput(KeyEvent event) {
        //For ADFGX Getting info which language is chosen
        String language;
        if (radio_english.isSelected()) {
            language = "EN";
        } else {
            language = "CZ";
        }

        //Showing Formatted Inputs
        if (encrypt) {
            field_adfgx_input_filtered.setText(formatEncrypt.format_adfgx(field_input.getText(), language));
            field_adfgvx_input_filtered.setText(formatEncrypt.format_adfgvx(field_input.getText()));
        } else {
            field_adfgx_input_filtered.setText(formatDecrypt.format_adfgx(field_input.getText(), language));
            field_adfgvx_input_filtered.setText(formatDecrypt.format_adfgvx(field_input.getText()));
        }

    }

    //Transforms coordinates of char into 2 chars based in designated location in Matrix.
    String filterLocation(int[] coordinates, String mainInfo) {
        return String.valueOf(mainInfo.charAt(coordinates[0])) +
                mainInfo.charAt(coordinates[1]);
    }

    //Fills matrix based on input in Matrix Data Field
    @FXML
    void fillMatrix(String input, String matrixType, int matrixLength) {
        for (int i = 0; i < matrixLength*matrixLength; i++) {
            Label currentLabel = null;
            if (matrixType.equals("adfgx")) {
                currentLabel = (Label) adfgx_grid.lookup("#" + matrixType + "_gridLabel" + i);
            } else {
                currentLabel = (Label) adfgvx_grid.lookup("#" + matrixType + "_gridLabel" + i);
            }

            if (currentLabel != null) {
                if (input.length() == matrixLength*matrixLength) {
                    currentLabel.setText(String.valueOf(input.charAt(i)));
                } else {
                    currentLabel.setText("?");
                }
            }
        }
    }

    //Handles Key field
    @FXML
    void handleKey(KeyEvent event) {
        //Fill global variables
        formattedKey = formatKey.format(field_key.getText());

        //Fill data of key into ArrayList (Letter and number of repeating chars)
        adfgxData = format_key.keyToArray(formattedKey);
        adfgvxData = format_key.keyToArray(formattedKey);

        //Show filtered key in gui
        field_key_filtered.setText(formattedKey);
    }

    //Handles logic of Tran.Mat.
    void formatTransposingMatrix() {
        //Clear Tran. Matrixes
        area_adfgx_tran_matrix.setText("");
        area_adfgx_tran_matrix.setText("");
        area_adfgx_tran_matrix_ordered.setText("");
        area_adfgx_tran_matrix_ordered.setText("");

        //Calculates max column length of data
        int adfgxMaxColumnsLength = (adfgxSubMatrixOutput.length() + formattedKey.length() - 1) / formattedKey.length();
        int adfgvxMaxColumnsLength = (adfgvxSubMatrixOutput.length() + formattedKey.length() - 1) / formattedKey.length();

        if (encrypt) {
            //Shows output of Sub. Mat. in GUI
            field_adfgx_sub_matrix_result.setText(adfgxSubMatrixOutput);
            field_adfgvx_sub_matrix_result.setText(adfgvxSubMatrixOutput);

            //Adds Columns from Tran. Matrix into Data ArrayList
            //Output: ArrayList Object = ['X', 0, "ABC"]
            for (int i = 0; i < formattedKey.length(); i++) {
                //Length of objects in ArrayLists Data +1
                Object[] adfgx = Arrays.copyOf(adfgxData.get(i), adfgxData.get(i).length + 1);
                Object[] adfgvx = Arrays.copyOf(adfgvxData.get(i), adfgvxData.get(i).length + 1);

                //Gets data and puts it into ArrayLists
                StringBuilder advgxColumnData = new StringBuilder();
                StringBuilder advgvxColumnData = new StringBuilder();

                for (int j = 0; j < adfgxMaxColumnsLength; j++) {
                    advgxColumnData.append(stringFunctions.stringToCharArray(adfgxSubMatrixOutput, formattedKey.length(), adfgxMaxColumnsLength)[j][i]);
                }
                for (int j = 0; j < adfgvxMaxColumnsLength; j++) {
                    advgvxColumnData.append(stringFunctions.stringToCharArray(adfgvxSubMatrixOutput, formattedKey.length(), adfgvxMaxColumnsLength)[j][i]);
                }

                adfgx[adfgx.length-1] = advgxColumnData.toString();
                adfgvx[adfgvx.length-1] = advgvxColumnData.toString();

                adfgxData.set(i, adfgx);
                adfgvxData.set(i, adfgvx);
            }

            //Sort ArrayLists alphabetically
            adfgxData = format_key.sortArrayList(adfgxData);
            adfgvxData = format_key.sortArrayList(adfgvxData);

            //Shows all Tran. Matrix in GUI
            area_adfgx_tran_matrix.setText(fillTranMatrixUnordered(adfgxSubMatrixOutput).toString());
            area_adfgvx_tran_matrix.setText(fillTranMatrixUnordered(adfgvxSubMatrixOutput).toString());
            area_adfgx_tran_matrix_ordered.setText(fillTranMatrixOrdered(adfgxData, adfgxMaxColumnsLength).toString());
            area_adfgvx_tran_matrix_ordered.setText(fillTranMatrixOrdered(adfgvxData, adfgvxMaxColumnsLength).toString());
        } else {
            //Calculate max Columns length
            adfgxMaxColumnsLength = field_adfgx_output.getLength() / formattedKey.length();
            adfgvxMaxColumnsLength = field_adfgvx_output.getLength() / formattedKey.length();

            adfgxData = format_key.sortArrayList(adfgxData);
            adfgvxData = format_key.sortArrayList(adfgvxData);

            //Maybe Filteted would be better?
            StringBuilder inputTextADFGX = new StringBuilder(field_adfgx_output.getText());
            StringBuilder inputTextADFGVX = new StringBuilder(field_adfgvx_output.getText());

            //Adds Columns from Tran. Matrix into Data ArrayList
            //Output: ArrayList Object = ['X', 0, "ABC"]
            for (int i = 0; i < formattedKey.length(); i++) {
                Object[] adfgx = Arrays.copyOf(adfgxData.get(i), adfgxData.get(i).length + 1);
                Object[] adfgvx = Arrays.copyOf(adfgvxData.get(i), adfgvxData.get(i).length + 1);

                StringBuilder advgxColumnData = new StringBuilder();
                StringBuilder advgvxColumnData = new StringBuilder();

                for (int j = 0; j < adfgxMaxColumnsLength; j++) {
                    advgxColumnData.append(inputTextADFGX.charAt(j));
                }
                for (int j = 0; j < adfgvxMaxColumnsLength; j++) {
                    advgvxColumnData.append(inputTextADFGVX.charAt(j));
                }

                inputTextADFGX.delete(0, adfgxMaxColumnsLength);
                inputTextADFGVX.delete(0, adfgvxMaxColumnsLength);

                adfgx[adfgx.length - 1] = advgxColumnData.toString();
                adfgvx[adfgvx.length - 1] = advgvxColumnData.toString();

                adfgxData.set(i, adfgx);
                adfgvxData.set(i, adfgvx);
            }

            area_adfgx_tran_matrix.setText(fillTranMatrixOrdered(adfgxData, adfgxMaxColumnsLength).toString());
            area_adfgvx_tran_matrix.setText(fillTranMatrixOrdered(adfgvxData, adfgvxMaxColumnsLength).toString());

//            adfgxData = format_key.sortArrayList(adfgxData);
//            adfgvxData = format_key.sortArrayList(adfgvxData);

            adfgxData = format_key.sortArrayListByWord(adfgxData, formattedKey);
            adfgvxData = format_key.sortArrayListByWord(adfgvxData, formattedKey);

            area_adfgx_tran_matrix_ordered.setText(fillTranMatrixOrdered(adfgxData, adfgxMaxColumnsLength).toString());
            area_adfgvx_tran_matrix_ordered.setText(fillTranMatrixOrdered(adfgvxData, adfgvxMaxColumnsLength).toString());

            String stringToSubMatADFGX = format_key.decrypt(adfgxData);
            String stringToSubMatADFGVX = format_key.decrypt(adfgvxData);

            StringBuilder outputADFGX = new StringBuilder();
            StringBuilder outputADFGVX = new StringBuilder();

            field_adfgx_sub_matrix_result.setText(stringToSubMatADFGX);
            field_adfgvx_sub_matrix_result.setText(stringToSubMatADFGVX);

            for (int x = 0; x < stringToSubMatADFGX.length(); x+=2) {
                String adfgxFilter = "ADFGX";
                if (stringToSubMatADFGX.charAt(x) != '_'){
                    int[] location = {adfgxFilter.indexOf(stringToSubMatADFGX.charAt(x)),adfgxFilter.indexOf(stringToSubMatADFGX.charAt(x + 1))};
                    System.out.println(stringToSubMatADFGX.charAt(x));
                    outputADFGX.append(MatrixFunctions.matrixGetCharFromLocation(location, adfgxMatrix, 5));
                }
            }
            for (int x = 0; x < stringToSubMatADFGVX.length(); x+=2) {
                String adfgvxFilter = "ADFGVX";
                if (stringToSubMatADFGVX.charAt(x) != '_') {
                    int[] location = {adfgvxFilter.indexOf(stringToSubMatADFGVX.charAt(x)), adfgvxFilter.indexOf(stringToSubMatADFGVX.charAt(x + 1))};
                    outputADFGVX.append(MatrixFunctions.matrixGetCharFromLocation(location, adfgvxMatrix, 6));
                }
            }

            field_adfgx_output.setText(formatDecrypt.format_adfgx_output(outputADFGX.toString()));
            field_adfgvx_output.setText(formatDecrypt.format_adfgvx_output(outputADFGVX.toString()));
        }
    }

    //Create String of tran. mat. array to show in GUI
    StringBuilder fillTranMatrixUnordered(String input) {
        StringBuilder content = new StringBuilder();
        StringBuilder row = new StringBuilder();

        content.append(formattedKey).append("\n");
        content.append("-".repeat(formattedKey.length())).append("\n");

        for (int i = 0; i < input.length() ; i++) {
            row.append(input.charAt(i));
            if ((i > 0 && i % formattedKey.length() == formattedKey.length()-1) || i == input.length()-1) {
                content.append(row).append("\n");
                row = new StringBuilder();
            }
        }
        return content;
    }

    //Create String of tran. mat. array to show in GUI
    StringBuilder fillTranMatrixOrdered(ArrayList<Object[]> inputArray, int maxColumnLength) {
        StringBuilder content = new StringBuilder();

        for (Object[] currentLetter : inputArray) {
            content.append(currentLetter[0]);
        }
        content.append("\n").append("-".repeat(formattedKey.length())).append("\n");

        for (int i = 0; i < maxColumnLength; i++) {
            for (int j = 0; j < formattedKey.length(); j++) {
                content.append(String.valueOf(inputArray.get(j)[2]).charAt(i));
            }
            content.append("\n");
        }
        return content;
    }

    //TODO Refactor
    @FXML
    void handleAdfgxMatrixData(KeyEvent event) {
        String input = field_adfgx_sub_matrix_data.getText();

        // toUpper
        input = input.toUpperCase();

        // Normalizer
        input = stringFunctions.normalizer(input);

        // Deletion of special chars
        input = stringFunctions.returnOnlyLetters(input);

        // Language changing chars
        String language = "";
        if (radio_english.isSelected()) {
            language = "EN";
            input = input.replaceAll("J", "I");
            input += "W";
        } else {
            language = "CZ";
            input = input.replaceAll("W", "V");
            input += "J";
        }

        // Remove duplicates
        input = stringFunctions.removeDuplicates(input);

        // Fill Field
        field_adfgx_sub_matrix_data.setText(input);

        adfgxMatrix = input;

        String missingChars = MatrixFunctions.checkMissingLetters(language, adfgxMatrix);

        //Check length
        if (input.length() == 25) {
            //OK
            adfgx_matrix_data_error.setText("");
            fillMatrix(input, "adfgx", 5);
            btn_encrypt.setDisable(false);
            btn_decrypt.setDisable(false);
        } else {
            //BAD
            adfgx_matrix_data_error.setText("MISSING CHARS: " + missingChars);
            fillMatrix("?", "adfgx", 5);
            btn_encrypt.setDisable(true);
            btn_decrypt.setDisable(true);
        }
        handleInput(null);
    }

    //TODO Maybe refactor in future?
    @FXML
    void handleAdfgvxMatrixData(KeyEvent event) {
        String input = field_adfgvx_sub_matrix_data.getText();

        //TODO Move from Controller?

        // toUpper
        input = input.toUpperCase();

        // Normalizer
        input = stringFunctions.normalizer(input);

        // Deletion of special chars
        input = stringFunctions.returnOnlyLettersAndNumbers(input);

        // Remove duplicates
        input = stringFunctions.removeDuplicates(input);

        // Fill Field
        field_adfgvx_sub_matrix_data.setText(input);

        adfgvxMatrix = input;

        String missingChars = MatrixFunctions.checkMissingLetters("ADFGVX", adfgvxMatrix);

        //Check length
        if (input.length() == 36) {
            //OK
            adfgvx_matrix_data_error.setText("");
            fillMatrix(input,"adfgvx", 6);
            btn_encrypt.setDisable(false);
            btn_decrypt.setDisable(false);
        } else {
            //BAD
            adfgvx_matrix_data_error.setText("MISSING CHARS: " + missingChars);
            fillMatrix("?","adfgvx", 6);
            btn_encrypt.setDisable(true);
            btn_decrypt.setDisable(true);
        }
    }

    @FXML
    void handleRadioCzech(ActionEvent event) {
        text_language_change_char.setText("W → V");

        handleInput(null);
        handleAdfgxMatrixData(null);
    }

    @FXML
    void handleRadioEnglish(ActionEvent event) {
        text_language_change_char.setText("J → I");

        handleInput(null);
        handleAdfgxMatrixData(null);
    }
}
