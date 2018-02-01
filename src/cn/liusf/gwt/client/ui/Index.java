package cn.liusf.gwt.client.ui;

import cn.liusf.gwt.client.share.MyImageBundle;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by liusf on 2018/1/30.
 */
public class Index extends Composite {


    interface IndexUiBinder extends UiBinder<Widget, Index> {
    }

    private static IndexUiBinder ourUiBinder = GWT.create(IndexUiBinder.class);

    public Index() {


        initWidget(ourUiBinder.createAndBindUi(this));

    }
}