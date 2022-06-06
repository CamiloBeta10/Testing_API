package co.com.apitesting.stepdefinitions;

import co.com.apitesting.questions.EmpleadoCreado;
import co.com.apitesting.task.CrearEmpleado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static model.DatosPrueba.getDatosPrueba;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.*;


public class CrearEmpleadoStepDefinitions {
    @Cuando("^intento agregar un nuevo empleado$")
    public void intentoAgregarUnNuevoEmpleado() {
        OnStage.theActorInTheSpotlight().attemptsTo(CrearEmpleado.porElServico());
    }


    @Entonces("^deberia ver al nuevo empleados creado$")
    public void deberiaVerAlNuevoEmpleadosCreado() {
       OnStage.theActorInTheSpotlight().should(seeThat(EmpleadoCreado.Exitosamente()));

    }
}
