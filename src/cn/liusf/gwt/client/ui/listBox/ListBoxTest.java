package cn.liusf.gwt.client.ui.listBox;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by liusf on 2018/1/29.
 */
public class ListBoxTest extends Composite {
    interface ListboxUiBinder extends UiBinder<Widget, ListBoxTest> {
    }

    private static ListboxUiBinder ourUiBinder = GWT.create(ListboxUiBinder.class);


    public ListBoxTest() {

        initWidget(ourUiBinder.createAndBindUi(this));
        for (int i = 0; i < 10; i++) {
            xx.addItem(i + "");

        }
    }

    @UiField
    ListBox xx;
}