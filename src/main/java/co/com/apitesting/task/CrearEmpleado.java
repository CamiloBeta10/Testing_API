package co.com.apitesting.task;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static co.com.apitesting.util.EndPoint.POST_EMPLEADO;
import static model.DatosPrueba.getDatosPrueba;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearEmpleado implements Task {

    public static CrearEmpleado porElServico() {
        return instrumented(CrearEmpleado.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Post.to(POST_EMPLEADO.getUrl())
                        .with(requestSpecification -> requestSpecification.contentType(ContentType.JSON)
                                .body("{" + " \"name\": \"" + getDatosPrueba().get("nombre").toString() + "\",\n" +
                                        "    \"salary\": \"" + getDatosPrueba().get("salario").toString() + "\"\n" +
                                "    \"age\": \"" + getDatosPrueba().get("edad").toString() + "\"\n" + "}")));
        System.out.println("Body" + SerenityRest.lastResponse().getBody());
    }
}
