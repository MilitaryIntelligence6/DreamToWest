package cn.misection.dreamwest.scene;

import cn.misection.dreamwest.ui.activity.MainActivity;

import org.loon.framework.android.game.core.LTransition;
import org.loon.framework.android.game.core.graphics.Screen;
import org.loon.framework.android.game.core.graphics.device.LGraphics;
import org.loon.framework.android.game.core.timer.LTimerContext;

/**
 * 游戏世界地图
 * User: gongdewei
 * Date: 12-3-18
 * Time: 下午7:12
 */
public class WorldScreen extends Screen {

    private MainActivity activity;

    public WorldScreen(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public void draw(LGraphics g) {

    }

    @Override
    public void alter(LTimerContext timer) {

    }

    @Override
    public void onTouchDown(LTouch e) {

    }

    @Override
    public void onTouchUp(LTouch e) {

    }

    @Override
    public void onTouchMove(LTouch e) {

    }

    @Override
    public LTransition onTransition() {
        //return LTransition.newFadeIn();
        return LTransition.newCrossRandom();
    }

}
