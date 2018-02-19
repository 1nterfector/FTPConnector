package sample;

import sample.logic.FTPConnector;

public class Controller {

    public void initialize() {
        FTPConnector.connect("roman","placki","localhost");
    }
}
