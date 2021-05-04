package org.ocean.ape.tomato;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "hhhhhhh")
@FXMLView("/fxml/app.fxml")
public class AppView extends AbstractFxmlView
{

    @Override
    protected void initFirstView()
    {
        log.info("aaaaaAbstractFxmlView", this);
        super.initFirstView();
    }
}
