import Data.DocPath;
import Data.Nif;
import Data.PINcode;
import Data.Password;
import Excepciones.*;
import services.CertificationAuthority;
import services.SS;

import java.util.Date;
import java.util.List;

public class UnifiedPlatform {

   private CertificationAuthority certificationAuthority;
   private SS ss;
   private List<PINcode> listPinCode;
   private PINcode piNcode;
   private Nif nif;


    public UnifiedPlatform() throws NifException {
        nif = new Nif("12345");
    }

    public void processSearcher () {
        // buscar palabara test
        //get value;
    };

    public void enterKeyWords (String keyWord)  throws AnyKeyWordProcedureException {
        if(keyWord == null){
            throw new AnyKeyWordProcedureException("no existe el keyword");
        }
        // enter key word en el buscador de tramite


    };

    public void selectSS () {
        // select tramite que hace falta
    };

    public void selectCitizens () {
        // clicar en enlace ciudadano
    };

    public void selectReports () {

    };

    public void selectCertificationReport (byte opc) {

    };
    public void selectAuthMethod (byte opc) {

    };

    public void enterNIF_PINobt (Nif nif, Date valDate) throws NifNotRegisteredException, IncorrectValDateException,
            AnyMobileRegisteredException, ConnectException, NifException {
       //send ping a la autoridad de certificacion

       /* Nif nif1 = new Nif("12345");
        Date date = new Date("12/13/2023");
        Boolean certificationAuthoritys =  certificationAuthority.sendPIN(nif1,date);*/

        if(this.nif != nif){
            throw new NifNotRegisteredException("este nif no esta registrado");
        }

    }

    public void enterPIN (PINcode pin) throws NotValidPINException, NotAffiliatedException, ConnectException, PinException {
        pin = new PINcode("pin");
        if(pin != piNcode){
            throw new NotValidPINException("este pin no esta valido");
        }
        if(pin == null){
            throw new NotAffiliatedException("este pin no esta afiliado a la ss");
        }
        this.listPinCode.add(pin);
    } ;

    public void enterCred (Nif nif, Password passw) throws NifNotRegisteredException, NotValidCredException,
    AnyMobileRegisteredException, ConnectException{

    } ;

    private void printDocument () throws BadPathException, PrintingException {

    };

    private void downloadDocument () {

    };

    private void selectPath (DocPath path) throws BadPathException {

    };

    private String searchKeyWords (String keyWord) throws AnyKeyWordProcedureException {
        return "";
    } ;

    private void OpenDocument (DocPath path) throws BadPathException  {

    };

    private void printDocument (DocPath path)  throws BadPathException,
    PrintingException {

    };

    private void downloadDocument (DocPath path)  throws BadPathException{

    };
}
