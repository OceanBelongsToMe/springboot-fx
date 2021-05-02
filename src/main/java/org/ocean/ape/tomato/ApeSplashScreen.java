package org.ocean.ape.tomato;

import de.felixroske.jfxsupport.SplashScreen;
import org.springframework.stereotype.Controller;

/**
 * @author ocean
 * @date 2021/1/9 12:38 下午
 */
@Controller
public class ApeSplashScreen extends SplashScreen
{
    @Override
    public boolean visible()
    {
        return false;
    }
}
