package gcfv2;
import java.io.BufferedWriter;
import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.RequestEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
/*
This is the HelloHttpFunction class that implements the HttpFunction
interface.
*/
public class HelloHttpFunction implements HttpFunction {
    public void service(final HttpRequest request, final HttpResponse response) throws Exception {
        final BufferedWriter writer = response.getWriter();
        /*
        Call the callURL method that has the API invocation steps.
        */
        writer.write(callURL());
    }
    /*
    The callURL() method calls the Firestore RunQuery API to execute the
    SELECT statement and returns the JSON string with the result of the
    query.
    */
    public String callURL() {
        try {
            String paramString = "https://firestore.googleapis.com/v1/
            projects / << YOUR_PROJECT_ID >> /databases/ (
                default) / documents: runQuery ";
            String jsonString = "{\"structuredQuery\": {\
                "select\":{\"fields\": [{ \"fieldPath\": \"name\"}, {\
                "fieldPath\": \"breath\"}, { \"fieldPath\": \"posture\" }] },\
                "from\": [{\"collectionId\": \"poses\" } ] } }";
                System.out.println("paramString: " + paramString);
                System.out.println("JSON: " + jsonString);
                HttpHeaders headers = new HttpHeaders();
                headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
                HttpEntity < String > entity = new HttpEntity < > (jsonString,
                    headers);
                RestTemplate restTemplate = new RestTemplate();
                ResponseEntity < String > result = restTemplate.
                exchange(paramString, HttpMethod.POST, entity, String.class);
                System.out.println(result);
                return result.toString();
            } catch (Exception e) {
                System.out.println("EXCEPTION in edit" + e);
                return "errmessage";
            }
        }
    }