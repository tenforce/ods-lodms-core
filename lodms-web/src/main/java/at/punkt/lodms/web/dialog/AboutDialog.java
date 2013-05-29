/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package at.punkt.lodms.web.dialog;

import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Alex Kreiser (akreiser@gmail.com)
 */
@Component
@Scope("session")
public class AboutDialog extends Window {

    public AboutDialog() {
        super("About Open Data Interoperability Platform");
        Label aboutText = new Label("<div class=\"lodms_about\" style=\"width:705px;white-space: normal;\">" +
                "<p>The Open Data Interoperability Platform (ODIP) is developed <a href=\"http://tenforce.com\">Tenforce</a> in the context of <a href=\"http://www.opendatasupport.eu\">Open Data Support</a>, a project funded by <a href=\"http://ec.europa.eu/dgs/connect/\">DG CONNECT</a> of the European Commission under SMART 2012/0107 ‘Lot 2: Provision of services for the Publication, Access and Reuse of Open Public Data across the European Union, through existing open data portals’(Contract No. 30-CE-0530965/00-17).</p>" +
                "<p><a href=\"http://www.opendatasupport.eu\">Open Data Support</a> is run by <a href=\"http://www.pwc.com/gx/en/eu-institutions-services/index.jhtml\">PwC EU Services</a>.</p>" +
                "<p>The Linked (Open) Data Management Suite is developed by the <a href=\"http://www.semantic-web.at\">Semantic Web Company</a> in the course of the <a href=\"http://lod2.eu\">LOD2</a> FP7 project.</p>" +
                "<p>It is a Java based Linked (Open) Data Management Suite to schedule and monitor required ETL: Extract - Transform - Load</br>jobs for smooth and efficient Linked (Open) Data Management for web-based Linked Open Data portals (LOD platforms)</br>as well as for sustainable Data Management and Data Integration usage inside of the enterprise / the organisation.</p>" +
                "<p>Release 1.0, <a href=\"http://www.gnu.org/licenses/gpl-2.0.html\">GPLv2</a></div>",
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
