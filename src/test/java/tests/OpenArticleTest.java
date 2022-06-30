package tests;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class OpenArticleTest extends TestBase {

    @Test
    @DisplayName("Открытие статьи: Как научиться бегать")
    public void FoundText() {
        step("Открыть главную страницу", () -> open("/"));
        step("Нажать на кнопку Читать", () -> $("#span.yk_slot10-block_text-btn").click());
        step("Проверить, что статья про бег открыта ", () -> $("[data-selenium=\"stk-reset\"]")
                        .should(Condition.text(" Научиться бегать медленно "))
                        .should(Condition.visible));
    }
}