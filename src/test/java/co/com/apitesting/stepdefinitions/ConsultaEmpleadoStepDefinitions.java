package co.com.apitesting.stepdefinitions;

import co.com.apitesting.questions.EmpleadoEncontrado;
import co.com.apitesting.task.ListaEmpleados;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ConsultaEmpleadoStepDefinitions {



    @Cuando("^intento obtener la informacion de un empleado$")
    public void intentoObtenerLaInformacionDeUnEmpleado() {
        OnStage.theActorInTheSpotlight().attemptsTo(ListaEmpleados.deLaEmpresa());
    }

    @Entonces("^deberia ver al empleados$")
    public void deberiaVerAlEmpleados() {
     OnStage.theActorInTheSpotlight().should(seeThat(EmpleadoEncontrado.Exitosamente()));
    }

}
