package br.edu.ifpb.report.controller;

public class GeneralReport {
    
    //A criação dessa classe genérica deixa mas simples a chamada e criação dos objetos, centralizando tudo isso nesta classe genérica.
    public void generate() {
        createDatabaseConnection();
        executeDataBase();
        convertToTypeFile();
    }

    public void createDatabaseConnection() {}
    public void executeDataBase() {}
    public void convertToTypeFile() {}
    
}
