package cn.liusf.gwt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import cn.liusf.gwt.client.rpc.gwtService;

public class gwtServiceImpl extends RemoteServiceServlet implements gwtService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}