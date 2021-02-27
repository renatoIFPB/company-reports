package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DataBaseConnector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends GeneralReport {

    private DataBaseConnector connector = new MysqlDatabaseConnector();

    //public void generate() {
    //    createDatabaseConnection();
    //    executeMySQLQuery();
    //    convertToPDF();
    //}

    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    //public void executeMySQLQuery() {
    public void executeDataBase() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.runQuery(query);
    }

    //public void convertToPDF() {
    public void convertToTypeFile() {
        System.out.println("Converting To PDF...");
    }
}
