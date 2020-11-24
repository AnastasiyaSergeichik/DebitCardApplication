import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class DebitCardApplication {
        @Test
        void shouldSubmitRequest() {
                open("http://localhost:9999");
                SelenideElement form = $(".form");
                form.$("[data-test-id=name] input").setValue("Василий");
                form.$("[data-test-id=phone] input").setValue("+79270000000");
                form.$("[data-test-id=agreement]").click();
                form.$(".button").click();
                $(".alert-success").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
        }
     //   @Test
      //  void shouldValidated() {
        //        open("http://localhost:9999");
          //      SelenideElement form = $(".form");
          //      form.$("[data-test-id=name] input").setValue("hjgfghfjghj377");
           //     form.$("[data-test-id=agreement]").click();
            //    form.$(".button").click();
            //    $(".input_invalid .input__sub").shouldHave(exactText("Имя и фамилия указаны неверно. Допустимы только русские буквы, пробелы и дефисы."));
    //    }

}


