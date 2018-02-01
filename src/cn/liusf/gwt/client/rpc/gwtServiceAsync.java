package cn.liusf.gwt.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface gwtServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
