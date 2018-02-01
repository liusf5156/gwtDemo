package cn.liusf.gwt.client.ui.animate;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * Created by liusf on 2018/1/31.
 */
public class AnimateTest extends Composite {
    interface AnimateTestUiBinder extends UiBinder<HTMLPanel, AnimateTest> {
    }

    private static AnimateTestUiBinder ourUiBinder = GWT.create(AnimateTestUiBinder.class);

    public AnimateTest() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}