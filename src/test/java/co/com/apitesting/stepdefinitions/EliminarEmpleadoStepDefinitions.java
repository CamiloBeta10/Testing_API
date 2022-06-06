package co.com.apitesting.stepdefinitions;

import co.com.apitesting.questions.EmpleadoEliminado;
import co.com.apitesting.task.EliminarEmpleado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class EliminarEmpleadoStepDefinitions {
    @Cuando("^Camilo intento eliminar a un empleado con id (\\d+)$")
    public void camilo_intento_eliminar_a_un_empleado_con_id(int id) {
        OnStage.theActorInTheSpotlight().attemptsTo(EliminarEmpleado.deLaLista(id));
    }

    @Entonces("^deberia ver al  empleados eliminado$")
    public void deberia_ver_al_empleados_eliminado() {
        OnStage.theActorInTheSpotlight().should(seeThat(EmpleadoEliminado.conExito()));

    }

}
