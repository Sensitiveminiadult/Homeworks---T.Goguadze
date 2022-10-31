import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class homework4 {
    @Test
    public void qwe() {
        open ("https://www.youtube.com");
        $(byName("search_query")).setValue("ტრენინგები").pressEnter();

    }
}