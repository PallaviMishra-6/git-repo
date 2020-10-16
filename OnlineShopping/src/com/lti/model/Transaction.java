package com.lti.model;

import java.time.LocalDate;

public class Transaction {
int transactionId;
LocalDate TransactionDate;
double amount;
public int getTransactionId() {
	return transactionId;
}
public void setTransactionId(int transactionId) {
	this.transactionId = transactionId;
}
public LocalDate getTransactionDate() {
	return TransactionDate;
}
public void setTransactionDate(LocalDate transactionDate) {
	TransactionDate = transactionDate;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}


}
