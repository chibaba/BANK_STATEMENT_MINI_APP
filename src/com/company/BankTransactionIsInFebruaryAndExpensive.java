package com.company;

import java.time.Month;
import java.util.List;

class BankTransactionIsInFebruaryAndExpensive implements BankTransactionFilter {
    @Override
    public boolean test(final BankTransaction bankTransaction) {
        return (bankTransaction.getDate().getMonth() == Month.FEBRUARY
                && bankTransaction.getAmount() >= 1_000);
    }

    final List<BankTransaction> transactions
            = bankStatementProcessor.findTransactions(bankTransaction ->
            bankTransaction.getDate().getMonth() == Month.FEBRUARY
              && bankTransaction.getAmount() >= 1_000);
}