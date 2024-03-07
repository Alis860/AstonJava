package postman;

import postman.get.Root;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;
import static org.junit.jupiter.api.Assertions.*;

public class GetInfoTest {
    private static RequestSpecification specification;

    @BeforeAll
    static void setUp() {

        specification = RequestSpecificationCreator
                .getReqSpec("get");
    }

    @Test
    public void getMethod() {
        Root roots = given()
                .params(Map.of("foo1", "bar1", "foo2", "bar2"))
                .spec(specification)
                .when()
                .get()
                .then().log().all().statusCode(HTTP_OK)
                .extract().body().as(Root.class);

        assertAll(
                () -> assertEquals("bar1", roots.getArgs().getFoo1(), "foo1 не соответствует ожидаемому"),
                () -> assertEquals("bar2", roots.getArgs().getFoo2(), "foo2 не соответствует ожидаемому"),
                () -> assertEquals("https", roots.getHeaders().getXForwardedProto(), "XForwardedProto не соответствует ожидаемому"),
                () -> assertEquals("443", roots.getHeaders().getXForwardedPort(), "XForwardedPort не соответствует ожидаемому"),
                () -> assertEquals("postman-echo.com", roots.getHeaders().getHost(), "Host не соответствует ожидаемому"),
                () -> assertNotNull(roots.getHeaders().getXAmznTraceId(), "x-amzn-trace-id не должен быть null"),
                () -> assertEquals("Apache-HttpClient/4.5.13 (Java/17.0.9)", roots.getHeaders().getUserAgent(), "UserAgent не соответствует ожидаемому"),
                () -> assertEquals("*/*", roots.getHeaders().getAccept(), "Accept не соответствует ожидаемому"),
                () -> assertEquals("https://postman-echo.com/get?foo1=bar1&foo2=bar2", roots.getUrl(), "url не соответствует ожидаемому")
        );
    }
}