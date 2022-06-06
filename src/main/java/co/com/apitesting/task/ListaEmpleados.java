package co.com.apitesting.task;


import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.apitesting.util.EndPoint.GET_EMPLEADO;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ListaEmpleados implements Task {



    public static ListaEmpleados deLaEmpresa() {
        return instrumented(ListaEmpleados.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(GET_EMPLEADO.getUrl())
                        .with(requestSpecification
                                -> requestSpecification.contentType(ContentType.JSON)
                                .header("header1", "value1")));
        System.out.println("Body" + SerenityRest.lastResponse().getBody());
    }
}
