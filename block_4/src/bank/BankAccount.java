package bank;

import java.util.Date;

public class BankAccount {
    private int numberAccount;
    private String valut;
    private double remainder;
    private Date dateOpen;
    private String nameOwner;

    public BankAccount() {
        this.dateOpen = new Date();
    }

    public Date getDateOpen() {
        return dateOpen;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getRemainder() {
        return remainder;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public String getValut() {
        return valut;
    }

    public void setDateOpen(Date dateOpen) {
        this.dateOpen = dateOpen;
    }

    public void setNameOwner(String nameOwner) throws Exception {
        if (nameOwner.length() > 5) {
            this.nameOwner = nameOwner;
        } else {
            throw new Exception("Слишком короткое имя");
        }
    }

    public void setNumberAccount(int numberAccount) throws Exception {
        if (numberAccount > 0) {
            this.numberAccount = numberAccount;
        } else {
            throw new Exception("Отрицательное значение номера счета");
        }
    }

    public void setRemainder(double remainder) {
        this.remainder = remainder;
    }

    public void setValut(String valut) throws Exception {
        if (valut.equals("dollar") || valut.equals("euro") || valut.equals("ruble")) {
            this.valut = valut;
        } else {
            throw new Exception("Валюта не поддерживается");
        }
    }

    public double GetMoney(double sum) {

        if (remainder - sum < 0) {
            try {
                throw new Exception("Введите сумму меньшую или равную остатку на счете");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Попробуйте снова");
            }
        } else {
            this.remainder -= sum;
        }
        return sum;
    }
}
