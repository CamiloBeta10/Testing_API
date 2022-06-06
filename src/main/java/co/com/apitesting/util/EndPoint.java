package co.com.apitesting.util;

public enum EndPoint {
      BASE_ENDPOINT("http://dummy.restapiexample.com/api"),
      GET_EMPLEADO("/v1/employees"),
      POST_EMPLEADO("/v1/create"),
      DELETE_EMPLEADO("/v1/delete/2");


    private String url;

    private EndPoint(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
