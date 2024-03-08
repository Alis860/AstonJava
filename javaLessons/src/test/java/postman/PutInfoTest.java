package postman;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import postman.post.Root;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PutInfoTest {
    private static RequestSpecification specification;

    @BeforeAll
    static void setUp() {

        specification = RequestSpecificationCreator
                .getReqSpec("put");
    }

    @Test
    public void putMethod() {
               Root roots = given()
                .spec(specification)
                .when().log().all()
                .put()
                .then().statusCode(HTTP_OK).log().all()
                .extract().body().as(Root.class);

        assertAll(
                () -> assertEquals("https", roots.getHeaders().getXForwardedProto(), "XForwardedProto не соответствует ожидаемому"),
                () -> assertEquals("443", roots.getHeaders().getXForwardedPort(), "XForwardedPort не соответствует ожидаемому"),
                () -> assertEquals("postman-echo.com", roots.getHeaders().getHost(), "Host не соответствует ожидаемому"),
                () -> assertNotNull(roots.getHeaders().getXAmznTraceId(), "XAmznTraceId не должен быть null"),
                () -> assertNotNull(roots.getHeaders().getContentLength(), "ContentLength не должен быть null"),
                () -> assertEquals("Apache-HttpClient/4.5.13 (Java/17.0.9)", roots.getHeaders().getUserAgent(), "UserAgent не соответствует ожидаемому"),
                () -> assertEquals("*/*", roots.getHeaders().getAccept(), "Accept не соответствует ожидаемому"),
                () -> assertNotNull(roots.getHeaders().getAcceptEncoding(), "AcceptEncoding не должен быть null"),
                () -> assertEquals("https://postman-echo.com/put", roots.getUrl(), "url не соответствует ожидаемому")
        );
    }
}
