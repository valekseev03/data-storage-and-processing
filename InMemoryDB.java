package org.example;

import java.util.*;

public class InMemoryDB {
    private boolean isTransactionHappening = false;
    private Map<String, Integer> currentDB = new HashMap<String, Integer>();
    private Map<String, Integer> transactionDB = new HashMap<String, Integer>();
    Optional<Integer> get(String key){
        return Optional.ofNullable(currentDB.get(key));
    }

    void put(String key, int val){
        if (isTransactionHappening) {
           transactionDB.put(key, val);
        }else {
            throw new RuntimeException("No Transactions In Progress");
        }
    }

    public void begin_transaction() {
        if (!isTransactionHappening) {
            isTransactionHappening = true;
        }else {
            throw new RuntimeException("Only 1 Transaction Can Be Active At A Time");
        }
    }

    void commit(){
        if (isTransactionHappening) {
            currentDB.putAll(transactionDB);
            isTransactionHappening = false;
        }else {
            throw new RuntimeException("No In Progress Transactions To Commit");
        }
    }

    void rollback(){
        if(isTransactionHappening) {
            transactionDB.putAll(currentDB);
            isTransactionHappening = false;
        }else {
            throw new RuntimeException("No In Progress Transactions To Rollback");
        }
    }
}
