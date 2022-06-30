package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ClubProTests extends TestBase {

    @Test
    @DisplayName("Присоединение к клубной программе")
    public void registrationFormShouldOpen() {
        step("Открыть страницу клубной программы", () -> open("/clubpro/rules/"));
        step("Нажать кнопку присоединения", () -> $(".main_banner__content > a").click());
        step("Проверить, что открылась форма входа или регистрации", () -> $("[data-selenium=\"auth-title\"]")
                .should(Condition.text(" Вход или регистрация "))
                .should(Condition.visible));
    }
}
