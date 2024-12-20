package keepstate;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import javax.servlet.annotation.WebServlet;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@Widgetset("keepstate.MyAppWidgetset")
// @@@ KEEP INFO AFTER REFRESH
@PreserveOnRefresh
public class KeepstateUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		TextField tf = new TextField(
				"Type, press ENTER, and refresh the browser");
		tf.setImmediate(true);

		tf.addValueChangeListener(
				event ->
						Notification.show("Value: " + event.getProperty().getValue())
		);

		layout.addComponent(tf);
    }

    @WebServlet(urlPatterns = "/*", name = "KeepstateUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = KeepstateUI.class, productionMode = false)
    public static class KeepstateUIServlet extends VaadinServlet {
    }
}
