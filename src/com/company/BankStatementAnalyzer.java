package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankStatementAnalyzer {
    private static final String RESOURCES = "src/resources";
    public void analyze(final String fileName, final BankStatementParser bankStatementParser)
         throws IOException {
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);
        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);
        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);

        collectSummary(bankStatementProcessor);
    }
    private static void collectSummary(final BankStatementProcessor bankStatementProcessor) {
        System.out.println("The total for all Transaction is " + bankStatementProcessor.calculateTotalAmount());
        System.out.println("The total amount for Transaction in JANUARY is "+ bankStatementProcessor.calculateTotalInMonth(Month.JANUARY));
        System.out.println("tHE TOTAL amount of Transaction in Febuary is "+ bankStatementProcessor.calculateTotalInMonth(Month.FEBRUARY));
        System.out.println("The total Salary received is " + bankStatementProcessor.calculateForTotalCategory("Salary"));
    }
}
