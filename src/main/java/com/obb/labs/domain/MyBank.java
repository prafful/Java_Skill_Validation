package com.obb.labs.domain;

public class MyBank {


        private String accountNo;
        private String holderName;
        private String type;      // "SAVINGS" or "CURRENT"
        private double balance;

        // TODO 1: Complete constructor to initialize all fields
        public MyBank(String accountNo, String holderName, String type, double balance) {
            // TODO
        }

        public String getAccountNo() {
            return accountNo;
        }

        public void setAccountNo(String accountNo) {
            this.accountNo = accountNo;
        }

        public String getHolderName() {
            return holderName;
        }

        public void setHolderName(String holderName) {
            this.holderName = holderName;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        // TODO 2: deposit - add amount to balance (ignore if amount <= 0)
        public void deposit(double amount) {
            // TODO
        }

        // TODO 3: withdraw - subtract amount only if amount > 0 AND amount <= balance
        // Return true if successful, else false (do not change balance on failure)
        public boolean withdraw(double amount) {
            // TODO
            return false;
        }

        // Business rule (must be implemented exactly):
        // - If type is "SAVINGS": apply monthly interest at 4% annual => (balance * (0.04/12))
        // - If type is "CURRENT": deduct a fixed monthly fee of 25
        // TODO 4: Implement applyMonthlyUpdate()
        public void applyMonthlyUpdate() {
            // TODO
        }

        // TODO 5: Return true if balance >= threshold
        public boolean isRich(double threshold) {
            // TODO
            return false;
        }
    }


