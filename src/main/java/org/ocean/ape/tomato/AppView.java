package org.ocean.ape.tomato;

import de.felixroske.jfxsupport.AbstractFxmlView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppView extends AbstractFxmlView
{
    private static final Logger LOGGER = LoggerFactory.getLogger(AppView.class);

    @Override
    protected void initFirstView()
    {
        LOGGER.info("AbstractFxmlView", this);
        super.initFirstView();
    }
}
