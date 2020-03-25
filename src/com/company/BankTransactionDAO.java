package com.company;

import java.time.LocalDate;

public class BankTransactionDAO {
    public BankTransaction create(final LocalDate date, final double amount, final String description) {
        //...
        throw new UnsupportedOperationException();
    }
    public BankTransaction read(final long id) {
        //...
        throw new UnsupportedOperationException();
    }
    public BankTransaction update(final long id) {
        //...
        throw new UnsupportedOperationException();
    }
    public void delete(final BankTransaction BankTransaction) {
        //...
        throw new UnsupportedOperationException();
    }

}

 //   This is a typical pattern that you see often when interfacing with a
//   database that maintains a table for a specific domain object.
//   This pattern is usually called Data Access Object (DAO) and requires some kind of
//   ID to identify the objects. DAOs essentially abstract and encapsulate access to a data source,
//   such as a persistent database or an in-memory database.