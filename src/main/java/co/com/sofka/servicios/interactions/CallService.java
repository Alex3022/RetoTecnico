package co.com.sofka.servicios.interactions;

import co.com.sofka.model.ListaUser;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CallService {


    private CallService() {
    }

    /**
     * @param resource ruta del recurso a consumir
     * @param body
     * @param header
     */
    public static Interaction restGet(String resource) {
        return Tasks.instrumented(Get.class, resource);
    }

    /**
     * @param resource ruta del recurso a consumir
     * @param header   Map con las cabeceras del recurso a consumir
     */
    public static Interaction restGet(String resource, Map<String, String> header) {
        return instrumented(GetWithHeader.class, resource, header);
    }

    /**
     * @param resource ruta del recurso a consumir
     */
    public static Interaction restGetVerification(String resource) {
        return Tasks.instrumented(GetStatusVerification.class, resource);
    }

    /**
     * @param resource ruta del recurso a consumir
     * @param header   Map con las cabeceras del recurso a consumir
     */
    public static Interaction restGetVerification(String resource, Map<String, String> header) {
        return instrumented(GetWHStatusVerification.class, resource, header);
    }

    /**
     * @param resource ruta del recurso a consumir
     * @param body     String con el body del servicio a consumir
     */
    public static Interaction restPost(String resource, Object body) {
        return instrumented(Post.class, resource, body);
    }

    /**
     * @param resource ruta del recurso a consumir
     * @param body     String con el body del servicio a consumir
     */
    public static Interaction restPostVerification(String resource, String body) {
        return instrumented(PostStatusVerification.class, resource, body);
    }

    /**
     * @param resource ruta del recurso a consumir
     * @param body     String con el body del servicio a consumir
     * @param header   Map con las cabeceras del recurso a consumir
     */
    public static Interaction restPost(String resource, Object body, Map<String, String> header) {
        return instrumented(PostWithHeader.class, resource, body, header);
    }

    /**
     * @param resource ruta del recurso a consumir
     * @param formdata List String con los parametros de tipo form Data del servicio a consumir
     * @param header   Map con las cabeceras del recurso a consumir
     */
    public static Interaction restPost(String resource, List<String> formdata, Map<String, String> header) {
        return instrumented(PostWithHeaderAndFormData.class, resource, formdata, header);
    }

    /**
     * @param resource    ruta del recurso a consumir
     * @param bodyRequest String con el body del servicio a consumir
     * @param headers     headers para la consulta.
     */
    public static Interaction soap(String resource, String bodyRequest, Map<String, String> headers) {
        return instrumented(Soap.class, resource, bodyRequest, headers);
    }

    /**
     * @param resource ruta del recurso a consumir
     * @param body     String con el body del servicio a consumir
     */
    public static Interaction restPut(String resource, Object body) {
        return instrumented(Put.class, resource, body);
    }

    /**
     * @param resource ruta del recurso a consumir
     */
    public static Interaction restDelete(String resource) {
        return instrumented(Delete.class, resource);
    }


    public static Performable restPut(String resource) {
        return Put.to(resource);
    }
}
