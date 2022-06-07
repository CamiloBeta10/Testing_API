package co.com.apitesting.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/eliminar_Empleado.feature",
        glue = "co/com/apitesting/stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class EliminarEmpleadoRunner {
}
