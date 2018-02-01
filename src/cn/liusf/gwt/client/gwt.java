package cn.liusf.gwt.client;



import cn.liusf.gwt.client.ui.Index;
import cn.liusf.gwt.client.ui.animate.AnimateTest;
import cn.liusf.gwt.client.ui.panel.*;
import cn.liusf.gwt.client.ui.split.SplitLayoutPanelExample;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;


/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class gwt implements EntryPoint {

    public void onModuleLoad() {
   /*     // Create a three-pane layout with splitters.
        SplitLayoutPanel p = new SplitLayoutPanel();
        p.addWest(new HTML("navigation"), 128);
        p.addNorth(new HTML("list"), 384);
        p.add(new HTML("details"));

        // Attach the LayoutPanel to the RootLayoutPanel. The latter will listen for
        // resize events on the window to ensure that its children are informed of
        // possible size changes.*/
        SplitLayoutPanelExample eee =new SplitLayoutPanelExample();
        AnimateTest animateTest =new AnimateTest();
        RootLayoutPanel rp = RootLayoutPanel.get();
        rp.add(animateTest);


    }


}
