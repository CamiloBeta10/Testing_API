package co.com.apitesting.stepdefinitions;

import co.com.apitesting.task.CargarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;
import java.util.Map;

import static co.com.apitesting.util.EndPoint.BASE_ENDPOINT;

public class ComunStrpDefinitions {

    private Actor camilo = Actor.named("Camilo");

    @Before
    public void PrepararEscenario(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(camilo.getName()).can(CallAnApi.at(BASE_ENDPOINT.getUrl()));
    }

    @Dado("^(.*) sube los datos para el servicio$")
    public void camiloSubeLosDatosParaElServicio(String actor, List<Map<String,Object>> data) {
        OnStage.theActorInTheSpotlight().wasAbleTo(CargarDatos.with(data));
    }

}
