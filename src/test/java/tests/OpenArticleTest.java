package tests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class OpenArticleTest extends TestBase {

    @Test
    @DisplayName("Открытие статьи: Как научиться бегать")
    public void FoundText() {
        step("Открыть статью: Как научиться бегать", () -> open("/media/articles/28972154/"));
        step("Проверить, что статья про бег открыта ", () -> $("#strong").shouldHave(exactText("Научиться бегать медленно")));

    }
}