package Server;
import jakarta.xml.ws.Endpoint;
import WS.BanqueService;


public class ServeurJWS {
    public static void main(String[] args) {
        String url="http://127.0.0.1:8080/";
        Endpoint.publish(url,new BanqueService());
         System.out.println("Web service déployé");

    }
}
