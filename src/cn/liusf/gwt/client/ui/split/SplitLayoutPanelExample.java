package cn.liusf.gwt.client.ui.split;

import cn.liusf.gwt.client.share.MyImageBundle;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;

public class SplitLayoutPanelExample extends Composite {

    private static final MyImageBundle imgBundle = GWT.create(MyImageBundle.class);

    private static Image image = new Image(imgBundle.downicon());

    private static SplitLayoutPanelExampleUiBinder uiBinder = GWT
            .create(SplitLayoutPanelExampleUiBinder.class);

    interface SplitLayoutPanelExampleUiBinder
            extends UiBinder<Widget, SplitLayoutPanelExample> {
    }


    @UiField
    HTMLPanel top;

    public SplitLayoutPanelExample() {


        initWidget(uiBinder.createAndBindUi(this));
        image.setSize("100%", "100");

        top.add(image);
    }
}
