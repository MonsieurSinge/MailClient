package MailClient.Model;

import java.util.List;

public abstract class ReceiveProtocol {

    public abstract List<Mail> receive(String host, String storeType, String user, String password);

}
