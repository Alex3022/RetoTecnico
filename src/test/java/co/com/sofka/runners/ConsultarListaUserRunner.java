package co.com.sofka.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/consultarlistaUser.feature"},
        glue = {"co/com/sofka/stepdefinition"}
)
public class ConsultarListaUserRunner {
}
