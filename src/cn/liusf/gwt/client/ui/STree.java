package cn.liusf.gwt.client.ui;

import com.google.gwt.user.client.ui.*;

/**
 * Created by liusf on 2018/1/25.
 */
public class STree extends Tree {
    void load()
    {
        HorizontalPanel hp =new HorizontalPanel();
        hp.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        Image img=new Image();
        img.setUrl("https://cdn2.jianshu.io/assets/web/nav-logo-4c7bbafe27adc892f3046e6978459bac.png");
        hp.add(img);
        hp.add(new Label("hello world"));

        this.addItem(new TreeItem(hp));

        this.addTextItem("Root Node");

        this.addTextItem("Root Node");

    }
}
