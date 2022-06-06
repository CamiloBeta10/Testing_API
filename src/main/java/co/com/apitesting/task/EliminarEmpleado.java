package co.com.apitesting.task;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static co.com.apitesting.util.EndPoint.DELETE_EMPLEADO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarEmpleado implements Task {

    private int id;

    public EliminarEmpleado(int id) {
        this.id = id;
    }

    public static EliminarEmpleado deLaLista(int id) {
        return instrumented(EliminarEmpleado.class, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from(String.format(DELETE_EMPLEADO.getUrl(),id))
                        .with(requestSpecification
                                -> requestSpecification.contentType(ContentType.JSON))
        );
    }
}
