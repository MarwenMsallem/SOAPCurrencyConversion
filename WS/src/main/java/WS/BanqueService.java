package WS;

import java.util.Date;
import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte ;


@WebService(serviceName="BanqueWS")
public class BanqueService {

    public static void main(String[] args) {

    }
    @WebMethod(operationName="ConvEUToDinar")
    public double conversionEUroD (@WebParam(name="montant1")double mt){return mt/3.5; }
    @WebMethod(operationName="ConvDinarToEuro")
    public double conversionDinarEu (@WebParam(name="montant2")double mt){return mt*3.5; }

    @WebMethod
    public Compte getCompte(int code){
        return new Compte(code,Math.random()*97000,new Date());
    }
    @WebMethod (operationName="ListeComptes")
    public List<Compte> listcomptes()
    {return List.of(
            new Compte(1,Math.random()*97000, new Date()),
            new Compte(2,Math.random()*97000, new Date()),
            new Compte(2,Math.random()*97000, new Date())
    );
    }

}