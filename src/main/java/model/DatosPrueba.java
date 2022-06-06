package model;

import java.util.Map;

public class DatosPrueba {
    private static Map<String, Object> datosMap;

    private DatosPrueba() {
        throw new IllegalStateException("Entity Class");
    }

    public static Map<String, Object> getDatosPrueba() {
        return datosMap;
    }

    public static void conDatosPrueba(Map<String, Object> datosPrueba) {
        datosMap = datosPrueba;
    }
}
