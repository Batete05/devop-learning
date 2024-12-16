package com.example.Learning.services;

public class FinalMoneyRevision {
        private final int amount;
        private final String currency;

        public FinalMoneyRevision(int amount, String currency){
            this.amount=amount;
            this.currency=currency;
        }
        public int getAmount(){
            return amount;
        }
        public String getCurrency(){
            return currency;
        }
        public boolean equals(Object o){
            if(o instanceof com.example.Learning.example1.Money){
                com.example.Learning.example1.Money money=(com.example.Learning.example1.Money) o;
                return  money.getCurrency().equals(getCurrency())
                        &&  getAmount()==money.getAmount();
            }
            return false;
        }
    }

}
