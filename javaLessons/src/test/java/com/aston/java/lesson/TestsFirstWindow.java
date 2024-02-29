package com.aston.java.lesson;

import org.junit.jupiter.api.Test;

//Проверить надписи в незаполненных полях каждого варианта оплаты услуг: услуги связи, домашний интернет, рассрочка,
// задолженность/ Для варианта «Услуги связи» заполнить поля в соответствии с пререквизитами из предыдущей темы,
// нажать кнопку «Продолжить»/

public class TestsFirstWindow extends WebDriverSettings {

    @Test
    public void fullAllTests() {

        Test1 test1 = new Test1();
        test1.testHomeInternetBlock();

        Test2 test2 = new Test2();
        test2.testInstallmentPlanBlock();

        Test3 test3 = new Test3();
        test3.testDebtBlock();

        Test4 test4 = new Test4();
        test4.testFillCommunicationServicesBlock();
    }
}
