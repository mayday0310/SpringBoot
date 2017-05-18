package com.mayday.model;

/**
 * 银行卡模型类
 */
public class BankCardModel {
    private int cardId;  // 银行卡Id
    private String cardNumber;  //银行卡号
    private String realName;  //持卡人真实姓名
    private String bankName;  //银行名称
    private Double balance;  //银行卡余额

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public BankCardModel(int cardId, String cardNumber, String realName, String bankName, Double balance) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.realName = realName;
        this.bankName = bankName;
        this.balance = balance;
    }

    public BankCardModel() {
    }

    @Override
    public String toString() {
        return "BankCardModel{" +
                "cardId=" + cardId +
                ", cardNumber='" + cardNumber + '\'' +
                ", realName='" + realName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
