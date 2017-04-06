import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceClient;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by andev on 06.04.2017.
 */
@WebServiceClient
public class FiasClient {
    public String getBaseFiasURL() {
        return "http://fias.nalog.ru/";
    }

    public String getServiceFiasBaseURL() {
        return "http://fias.nalog.ru/WebServices/Public/DownloadService.asmx";
    }

    public String getServiceFiasWSDL() {
        return getServiceFiasBaseURL() + "?wsdl";
    }

    public String getTest1() throws MalformedURLException {
        URL url = new URL(getServiceFiasWSDL());
        QName qName = new QName("http://fias.nalog.ru/WebServices/Public/DownloadService.asmx");
        Service s = Service.create(url, qName);
        return s.toString();
    }
}
