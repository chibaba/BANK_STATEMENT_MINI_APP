package com.company;

import java.util.List;

public interface BankStatementParser {
    BankTransaction parseFrom(String line);
   List <BankTransaction> parseLinesFrom(List<String>lines);
}

public class BankStatementCSVParser implements BankStatementParser {
    //...
}

