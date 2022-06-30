package tests;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class StoresFindTests extends TestBase {

    String address = "Партизанская";

    @Test
    @DisplayName("Поиск магазинов по адресу")
    public void storesShouldBeFoundByAddress() {
        step("Открыть список магазинов", () -> open("/stores/irkutsk/"));
        step("Ввести название улицы", () ->
                $("[data-selenium=\"smShopsFiltersSearch\"] input").setValue(address));
        step("Проверить наличие магазинов в списке", () ->
                $$("[data-selenium=\"shopsList\"] li")
                        .should(CollectionCondition.texts("ТЦ «Карамель»")));
    }

}