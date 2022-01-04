package services;

import Data.Nif;
import Excepciones.NotAffiliatedException;

import java.net.ConnectException;

public interface SS {
    LaboralLifeDoc getLaboralLife(Nif nif) throws NotAffiliatedException, ConnectException;
    MemberAccreditationDoc getMemberAccred(Nif nif) throws NotAffiliatedException, ConnectException;
}
