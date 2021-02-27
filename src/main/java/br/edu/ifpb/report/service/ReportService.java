package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.TaxReport;
import br.edu.ifpb.report.controller.GeneralReport;

public class ReportService {

    //Com a criação da interface não é mas necessario chamar a classe concreta para criar os objetos.[]
    GeneralReport expenseReport = new ExpenseReport();
    GeneralReport taxReport = new TaxReport();

    public void generateReport(String type) {
        if (type.equals("expense")) {
            expenseReport.generate();
        } else {
            taxReport.generate();
        }
    }

}
