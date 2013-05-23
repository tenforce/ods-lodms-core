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
        Label aboutText = new Label("<div class=\"lodms_about\"><p><a href=\"http://joinup.ec.europa.eu/community/ods/description\">Get support.</a></p></div>",
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