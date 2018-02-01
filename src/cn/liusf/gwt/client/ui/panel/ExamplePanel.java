/**
 * 
 */
package cn.liusf.gwt.client.ui.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;


/**
 * The template example panel, built for UiBinder instance (see Chapter 6)
 * This is just a convenient way to display the frame for our examples; for the 
 * examples code, you should look in the relevant package - in this case
 * 
 * ch03.client.history for the History example
 * ch03.client.layout for the Layout example
 * 
 * (the ch03.client.intro package contains the introduction screen you see when the application loads)
 *
 */
public class ExamplePanel extends Composite
{
	/**
	 * UiBinder template code - see chapter 6.
	 */
    private static ExamplePanelUiBinder uiBinder = GWT.create(ExamplePanelUiBinder.class);
    interface ExamplePanelUiBinder extends UiBinder<Widget, ExamplePanel> {}
    


    /**
     * The EntryPoint.
     * Binds the UiBinder code and creates the widget to be shown.
     * Adds a ResizeHandler to manage and resize events of the browser that are created
     * Sets up the IntroPanel as the first widget shown to the user.
     */
    public ExamplePanel (){
        initWidget(uiBinder.createAndBindUi(this));
        setWidgetToMaxWidthAndHeight();
      /*  Window.addResizeHandler(resizeHandler);*/
        /*introPanel = new IntroPanel();
        setWidgetAsExample(introPanel);*/
    }


    private void setWidgetToMaxWidthAndHeight ()
    {
        setWidth("100%");
        setHeight(Window.getClientHeight() + "px");
    }
}
