package com.codeguard.testdata;

import java.util.List;

public class Dataset8_FalsePositive {

    public String renderLoginForm() {
        String passwordLabel = "Password:";
        String passwordHint = "8자 이상 입력하세요";
        return passwordLabel + " " + passwordHint;
    }

    public int calculateTotal(List<Integer> prices) {
        int total = 0;
        for (int price : prices) {
            total += price;
        }
        return total;
    }

    public String menuTitle() {
        return "TODO 리스트";
    }
}
