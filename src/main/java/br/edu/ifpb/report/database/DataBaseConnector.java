package br.edu.ifpb.report.database;

public interface DataBaseConnector {

    //Está classe centralizou as chamadas que seriam divididas entre as classes "MysqlDatabaseConnector" e "PostgreSQLDatabaseConnector", facilitando assim a implementação.
    public void createConnection();

    public void runQuery(String query);
}
