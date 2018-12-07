package edu.ujcv.progra1.util.edu.ujcv.progra1.util.fileio;


import edu.ujcv.progra1.edu.ujcv.progra1.models.Cliente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorCvsCliente {
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";

    //Student attributes index
    private static final int CLIENT_ID_IDX = 0;
    private static final int CLIENT_FNAME_IDX = 1;
    private static final int CLIENT_LNAME_IDX = 2;
    private static final int CLIENT_CODCLIE_IDX = 3;

    public static ArrayList<Cliente> readCsvFile(String fileName) {

        BufferedReader fileReader = null;
        ArrayList<Cliente> clientes = new ArrayList();

        try {

            String line = "";

            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileName));

            //Read the CSV file header to skip it
            fileReader.readLine();

            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {
                    //Create a new student object and fill his  data
                    Cliente cliente = new Cliente(tokens[CLIENT_ID_IDX], tokens[CLIENT_FNAME_IDX], tokens[CLIENT_LNAME_IDX], tokens[CLIENT_CODCLIE_IDX]);
                    clientes.add(cliente);
                }
            }

        }
        catch (Exception e) {
            System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }
        return clientes;
    }


}
