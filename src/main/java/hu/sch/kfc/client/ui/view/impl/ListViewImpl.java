package hu.sch.kfc.client.ui.view.impl;

import hu.sch.kfc.client.proxy.GroupProxy;
import hu.sch.kfc.client.ui.view.ListView;
import hu.sch.kfc.client.ui.widget.Button;
import java.util.List;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class ListViewImpl extends Composite implements ListView {

    public interface ListViewImplUiBinder extends UiBinder<Widget, ListViewImpl> {
    }

    private Listener listener;

    @UiField
    FlowPanel panel;

    @Inject
    public ListViewImpl(ListViewImplUiBinder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override
    public Widget asWidget() {
        return this;
    }

    @Override
    public void setGroups(List<GroupProxy> groups) {
        panel.clear();
        Button b;
        for (final GroupProxy g : groups) {
            b = new Button(g.getName());
            b.addClickHandler(new ClickHandler() {

                @Override
                public void onClick(ClickEvent event) {
                    listener.groupClicked(g);
                }
            });
            panel.add(b);
        }
    }

}
