package com.company;

import java.time.Month;
import java.util.List;
import java.util.Locale;

public interface BankTransactionProcessor {
    double calculateTotalAmount();
    double calculateTotalInMonth(Month month);
    double calculateTotalInJanuary();
    double calculateAverageAmount();
    double calculateAverageAmountForCategory(Category category);
    List<BankTransaction> findTransactions(BankTransactionFilter bankTransactionFilter);

    @FunctionalInterface
    public interface BankTransactionSummarizer {
        double summarize(double accumulator, BankTransaction bankTransaction);
    }
    @FunctionalInterface
    public interface BankTransactionFilter {
        boolean test(BankTransaction bankTransaction);
    }

    public double summarizeTransactions(final BankTransactionSummarizer bankTransactionSummarizer) {
        double result = 0;
        for(final BankTransaction bankTransaction : bankTransactions) {
            result = bankTransactionSummarizer.summarize(result, bankTransaction);
        }
        return result;
    }
}
