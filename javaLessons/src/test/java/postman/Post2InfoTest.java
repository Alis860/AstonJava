package postman;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import postman.post2.Root;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Post2InfoTest {
    private static RequestSpecification specification;

    @BeforeAll
    static void setUp() {

        specification = RequestSpecificationCreator
                .getReqSpec("post");
    }

    @Test
    public void post2Method() {
        Root.Data postRequest = new Root.Data("bar1", "bar2");
        Root roots = given()
                .spec(specification).body(postRequest)
                .when().log().all()
                .post()
                .then().statusCode(HTTP_OK).log().all()
                .extract().body().as(Root.class);

        assertAll(
                () -> assertEquals("bar1", roots.getData().getFoo1(), "foo1 не соответствует ожидаемому"),
                () -> assertEquals("bar2", roots.getData().getFoo2(), "foo2 не соответствует ожидаемому"),
                () -> assertEquals("https", roots.getHeaders().getXForwardedProto(), "XForwardedProto не соответствует ожидаемому"),
                () -> assertEquals("443", roots.getHeaders().getXForwardedPort(), "XForwardedPort не соответствует ожидаемому"),
                () -> assertEquals("postman-echo.com", roots.getHeaders().getHost(), "Host не соответствует ожидаемому"),
                () -> assertNotNull(roots.getHeaders().getXAmznTraceId(), "XAmznTraceId не должен быть null"),
                () -> assertNotNull(roots.getHeaders().getContentLength(), "ContentLength не должен быть null"),
                () -> assertEquals("Apache-HttpClient/4.5.13 (Java/17.0.9)", roots.getHeaders().getUserAgent(), "UserAgent не соответствует ожидаемому"),
                () -> assertEquals("*/*", roots.getHeaders().getAccept(), "Accept не соответствует ожидаемому"),
                () -> assertNotNull(roots.getHeaders().getAcceptEncoding(), "AcceptEncoding не должен быть null"),
                () -> assertNotNull(roots.getHeaders().getContentType(), "ContentType не должен быть null"),
                () -> assertEquals("https://postman-echo.com/post", roots.getUrl(), "url не соответствует ожидаемому"),
                () -> assertEquals("bar1", roots.getJson().getFoo1(), "foo1 не соответствует ожидаемому"),
                () -> assertEquals("bar2", roots.getJson().getFoo2(), "foo2 не соответствует ожидаемому")
        );

    }
}
