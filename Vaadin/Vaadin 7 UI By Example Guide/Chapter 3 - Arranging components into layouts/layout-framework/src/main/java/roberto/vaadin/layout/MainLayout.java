package roberto.vaadin.layout;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MainLayout extends VerticalLayout {

	private VerticalLayout upperSection = new VerticalLayout();
	private HorizontalSplitPanel lowerSection = new HorizontalSplitPanel();
	private VerticalLayout menuLayout = new VerticalLayout();
	private VerticalLayout contentLayout = new VerticalLayout();

	public MainLayout() {
		lowerSection.setSizeFull();
		contentLayout.setSizeFull();
		//menuLayout.setSizeFull();

		upperSection.addComponent(new Label("Header"));
		menuLayout.addComponent(new Label("Menu"));
		contentLayout.addComponent(new Label("Content"));

		lowerSection.setSplitPosition(15);
		lowerSection.addComponent(menuLayout);
		lowerSection.addComponent(contentLayout);

		addComponent(upperSection);
		addComponent(lowerSection);

		setExpandRatio(lowerSection, 1);
		// @@@ EXPANDRATIO pag 70
		// the page is divided 50/50
		// setExpandRatio(upperSection, 3);
		// setExpandRatio(lowerSection, 3);

		// 	TODO roberto_foglia the method doesn't work
		// if it is uncommented then the buttons will not click
		// showBorders();
		setSizeFull();
	}

	@SuppressWarnings("unused")
	private void showBorders() {
		String style = "v-ddwrapper-over";
		setStyleName(style);
		upperSection.setStyleName(style);
		lowerSection.setStyleName(style);
		menuLayout.setStyleName(style);
		contentLayout.setStyleName(style);
	}

	public void addMenuOption(String caption,
			final Component component) {
		Button button = new Button(caption);
		menuLayout.addComponent(button);
		menuLayout.setMargin(true);
		menuLayout.setSpacing(true);

		button.addClickListener(new ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				contentLayout.removeAllComponents();
				contentLayout.addComponent(component);
			}
		});
	}

}
