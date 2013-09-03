package at.punkt.lodms.web.dialog;

import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class SupportDialog extends Window {

    public SupportDialog() {
        super("Get Support");
        Label aboutText = new Label("<p><a href=\"http://joinup.ec.europa.eu/community/ods/description\"><img width=\"600px\" src=\"/lodms/VAADIN/themes/lodms/support.png\" alt=\"get support\" /></a></p>",
                Label.CONTENT_XHTML);
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSpacing(true);
        layout.addComponent(aboutText);
        layout.setSizeUndefined();
        setContent(layout);
        center();
    }
}