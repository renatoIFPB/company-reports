package br.edu.ifpb.report.controller;
import br.edu.ifpb.report.database.DataBaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends GeneralReport{

    private DataBaseConnector connector = new PostgreSQLDatabaseConnector();

    //Existe aqui uma duplicação de código do metodo "generate", que está sendo usado aqui e na classe TaxReport.
    //public void generate() {
    //    createDatabaseConnection();
    //    executePostgresQuery();
    //    convertToXLS();
    //}

    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    //public void executePostgresQuery() {
    public void executeDataBase() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.runQuery(query);
    }

    //public void convertToXLS() {
    public void convertToTypeFile() {
        System.out.println("Converting To XLS...");
    }

}
