package cn.liusf.gwt.client.ui.listBox;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.OpenEvent;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;

/**
 * Created by liusf on 2018/1/30.
 */
public class UiBinderTest extends Composite {
    interface UiBinderTestUiBinder extends UiBinder<HTMLPanel, UiBinderTest> {
    }

    private static UiBinderTestUiBinder ourUiBinder = GWT.create(UiBinderTestUiBinder.class);

    public interface Resources extends ClientBundle {
        @Source("googleapple.jpg")
        ImageResource googleApple();
    }

    public UiBinderTest() {
        initWidget(ourUiBinder.createAndBindUi(this));
        /* 设置输入框右对齐. */
        textBox_0.setTextAlignment(TextBox.ALIGN_RIGHT);
        /** 这个函数不可以放类体里面. */
        textBox_0.addKeyUpHandler(new KeyUpHandler() {
            public void onKeyUp(KeyUpEvent event) {
                // 说明.用changeListener的时候.在光标未移出的时候不会改变.  
                String temp = textBox_0.getText();
                System.out.println(temp);
                label_0.setText(temp);
            }
        });

        listBox_0.setVisibleItemCount(6);// 设置成可选数目是6.  
        listBox_1.setVisibleItemCount(6);// 设置成可选数目是6.  
        listBox_0.addItem("001");
        listBox_0.addItem("002");
        listBox_0.addItem("003");
        listBox_0.addItem("004");

        richTextArea_0.setHTML("<font color='red'>abc</font>");

        Command cmd = new Command() {
            public void execute() {
                Window.alert("点击Menu.");
            }
        };
        MenuBar bar01 = new MenuBar(true);
        // 设置true的时候.显示竖向菜单.  
        bar01.addItem("001", cmd);
        bar01.addItem("002", cmd);
        bar01.addItem("003", (new MenuBar(true).addItem("子菜单.", cmd)
                .getParentMenu()));

        // 主菜单显示.  
        menuBar_0.addItem("File", bar01);
        menuBar_0.addItem("Save", bar01);
        menuBar_0.addItem("Exit", bar01);

        final String[] tabBarLabelText = { "这个是第1个TabBar.", "这个是第2个TabBar.",
                "这个是第3个TabBar.", "这个是新添加的第1个TabBar.", "这个是新添加的第2个TabBar." };
        tabBar_0.addTab("这个是第1个TabBar.");
        tabBar_0.addTab("这个是第2个TabBar.");
        tabBar_0.addTab("这个是第3个TabBar.");
        // 设置一个数组变量存储值.这里不可以是一个int型.这样会改变不了值.  
        tabBar_0.addSelectionHandler(new SelectionHandler<Integer>() {
            public void onSelection(SelectionEvent<Integer> event) {
                System.out.println(tabBar_0.getSelectedTab());
                tabBarLabel_0
                        .setText(tabBarLabelText[tabBar_0.getSelectedTab()]);
            }
        });

        // 设置网格的数量.3X3的网格.  
        grid_0.setWidget(0, 0, new HTML("hello!"));
        grid_0.setWidget(1, 1, new HTML("hello!"));
        grid_0.setWidget(2, 2, new HTML("hello!"));
        grid_0.setWidget(1, 2, new HTML("hello!"));
        // 插入测试数据.数据是从(0,0)开始到(2,2)结束.  
        // Grid测试结束.  

        /** 对flexTable进行数据添加. */
        for (int i = 0; i < 16; i++) {
            flexTable_0.setText(i / 4, i % 4, "id:" + i);
        }

   /*     TreeItem treeItem1 = new TreeItem("01");
        treeItem1.addItem(new TreeItem("sub01"));

        TreeItem treeItem2 = new TreeItem("02");
        treeItem2.addItem(new TreeItem("sub02"));

        TreeItem treeItem3 = new TreeItem("03");
        TreeItem treeItem3_1 = new TreeItem("03_1");
        treeItem3.addItem(treeItem3_1);
        TreeItem treeItem3_2 = new TreeItem("03_2");
        treeItem3_1.addItem(treeItem3_2);
        TreeItem treeItem3_3 = new TreeItem("03_3");
        treeItem3_2.addItem(treeItem3_3);

        tree_0.addItem(treeItem1);
        tree_0.addItem(treeItem2);
        tree_0.addItem(treeItem3);*/

        // Resources res = GWT.create(Resources.class);  
        // image_0.setResource(res.googleApple());  

        String strText = "";
        for (int i = 0; i < 100; i++) {
            strText += "ABCDEFGHI";
        }
        // scrollPanel_0.setSize("100px", "100px");  
        scrollPanel_0.setWidget(new HTML(strText));
        scrollPanel_0.setVisible(true);

        dockPanel_0.add(new HTML("NORTH"), DockPanel.NORTH);
        dockPanel_0.add(new HTML("SOUTH"), DockPanel.SOUTH);
        dockPanel_0.add(new HTML("WEST"), DockPanel.WEST);
        dockPanel_0.add(new HTML("EAST"), DockPanel.EAST);
        dockPanel_0.add(new HTML("CENTER"), DockPanel.CENTER);
        dockPanel_0.setBorderWidth(1);

        stackPanel_0.setStackText(0, "stackPanel 0");
        stackPanel_0.setStackText(1, "stackPanel 1");
        stackPanel_0.setStackText(2, "stackPanel 2");
        stackPanel_0.setStackText(3, "stackPanel 3");

        deckPanel_0.showWidget(0);

        tabPanel_0.add(new HTML("TabPanel001Content"), "001");
        tabPanel_0.add(new HTML("TabPanel002Content"), "002");
        tabPanel_0.add(new HTML("TabPanel003Content"), "003");
        tabPanel_0.selectTab(0);


    }

    @UiField
    PushButton button_0;

    @UiHandler("button_0")
    void onClick_0(ClickEvent e) {
        Window.alert("Push It !");
    }

    @UiField
    CheckBox checkBox_0;

    @UiHandler( { "checkBox_0", "checkBox_0" })
    void onClick_00(ClickEvent e) {
        Window.alert("Checked It 1!");
        if (checkBox_0.getValue()) {
            checkBox_1.setValue(false);
        } else {
            checkBox_1.setValue(true);
        }
        if (checkBox_1.getValue()) {
            checkBox_0.setValue(false);
        } else {
            checkBox_0.setValue(true);
        }
    }

    @UiField
    CheckBox checkBox_1;

    /** 测试多重绑定. */
    @UiHandler("checkBox_1")
    void onClick_11(ClickEvent e) {
        Window.alert("CheckBox It 2!");
    }

    @UiField
    CheckBox radioButton_0;
    @UiField
    CheckBox radioButton_1;
    @UiField
    CheckBox radioButton_2;

    /** 测试一个函数绑两个组件. */
    @UiHandler( { "radioButton_0", "radioButton_1", "radioButton_2" })
    void onClick_2(ClickEvent e) {
        Window.alert("CheckBox It 2!");
    }

    @UiField
    TextBox textBox_0;
    @UiField
    Label label_0;

    @UiField
    ListBox listBox_0;
    @UiField
    ListBox listBox_1;

    @UiHandler("listBox_0")
    void listBoxOnClick(ClickEvent event) {
        int id = listBox_0.getSelectedIndex();
        listBox_1.clear();// 清除所有选项.  
        for (int i = 0; i < 4; i++) {
            listBox_1.addItem(id + "city:\t" + i);
        }
    }

    @UiField
    Frame frame_0;

    @UiField
    RichTextArea richTextArea_0;

    @UiField
    MenuBar menuBar_0;

    @UiField
    TabBar tabBar_0;

    @UiField
    Label tabBarLabel_0;

    @UiField
    Grid grid_0;

    @UiFactory
    public Grid initGrid() {
        return new Grid(3, 3);
    }

    @UiHandler("grid_0")
    void onClick_3(ClickEvent e) {
        // 获得行.// 获得列.  
        String temp = "点击了:[" + grid_0.getCellForEvent(e).getRowIndex() + ","
                + grid_0.getCellForEvent(e).getCellIndex() + "]";
        System.out.println(temp);
    }

    @UiField
    FlexTable flexTable_0;

    @UiHandler("flexTable_0")
    void onClick_4(ClickEvent e) {
        // 获得行.// 获得列.  
        String temp = "点击了:[" + flexTable_0.getCellForEvent(e).getRowIndex()
                + "," + flexTable_0.getCellForEvent(e).getCellIndex() + "]";
        System.out.println(temp);
        Window.alert(temp);
    }

    @UiField
    Tree tree_0;

    @UiHandler("tree_0")
    void treeOnOpen(OpenEvent<TreeItem> event) {
        System.out.println("tree onOpen:\t" + event.getTarget().getHTML());
    }

    @UiHandler("tree_0")
    public void treeOnClose(CloseEvent<TreeItem> event) {
        System.out.println("tree onClose:\t" + event.getTarget().getHTML());
    }

    @UiHandler("tree_0")
    public void treeOnSelection(SelectionEvent<TreeItem> event) {
        System.out.println("tree onSelection:\t"
                + tree_0.getSelectedItem().getHTML());
    }

    @UiField
    ScrollPanel scrollPanel_0;

    @UiField
    Button popupPanelButton;

    @UiHandler("popupPanelButton")
    public void popupPanelButtonOnClick(ClickEvent e) {

        final PopupPanel popupPanel = new PopupPanel();
        Button closeButton = new Button("close");
        closeButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                popupPanel.hide();
            }
        });
        VerticalPanel verticalPanel = new VerticalPanel();
        verticalPanel.add(new HTML("test Popup."));
        verticalPanel.add(closeButton);
        popupPanel.add(verticalPanel);
        popupPanel.center();
    }

    @UiField
    Button dialogBoxButton;

 /*   @UiHandler("dialogBoxButton")
    public void dialogBoxButtonOnClick(ClickEvent e) {
        TestDialogBox_01 testDialogBox_01 = new TestDialogBox_01();
        testDialogBox_01.center();
        testDialogBox_01.show();
    }*/

    @UiField
    DockPanel dockPanel_0;

    @UiField
    StackPanel stackPanel_0;

    @UiField
    DeckPanel deckPanel_0;

    @UiField
    Button deckPanelButton_0;

    @UiHandler("deckPanelButton_0")
    public void onClick_5(ClickEvent event) {
        int showId = (deckPanel_0.getVisibleWidget() +1 ) % 4;
        deckPanel_0.showWidget(showId);
    }

    @UiField
    TabPanel tabPanel_0;

    @UiField
    SuggestBox suggestBox_0;

    @UiFactory
    public SuggestBox initSuggestBox() {
        MultiWordSuggestOracle multiWordSuggestOracle = new MultiWordSuggestOracle();
        for (int i = 0; i < 100; i++) {
            // com.google.gwt.user.client.Random静态方法.  
            multiWordSuggestOracle.add(Random.nextInt() + "");
        }
        return new SuggestBox(multiWordSuggestOracle);
    }

}  