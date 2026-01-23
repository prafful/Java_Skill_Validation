package com.obb.labs.domain;

public abstract class InheritAccount {

    /**
     * Abstract bank account.
     * Domain rule: NO main(), NO printing in domain.
     */

        private double balance;
        private String name;

        public InheritAccount(String name, double balance) {
            // TODO 1: assign fields
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            // TODO 2: set the balance
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            // TODO 3: set the name
        }

        /**
         * Each account type applies interest differently.
         */
        public abstract void addInterest();

        /**
         * Returns one formatted line used by the application output.
         * Format must match contract EXACTLY.
         */
        public String getDetails() {
            // TODO 4:
            // Return a String in this format:
            // "<TYPE>  | Name: <NAME_PADDED> | Balance: <BALANCE_2DP>"
            //
            // Where:
            // TYPE is either "SAVINGS" or "CURRENT"
            // NAME_PADDED is the name right-padded to 5 characters (e.g., "Bob  ")
            // BALANCE_2DP is the balance with 2 decimals (e.g., 6.60)
            //
            // Hint: use getClass().getSimpleName() to detect subclass name.
            return null;
        }

        // Optional helper allowed in domain (still no printing).
        protected String padRight(String text, int width) {
            if (text == null) text = "";
            if (text.length() >= width) return text.substring(0, width);
            StringBuilder sb = new StringBuilder(text);
            while (sb.length() < width) sb.append(' ');
            return sb.toString();
        }
    }



