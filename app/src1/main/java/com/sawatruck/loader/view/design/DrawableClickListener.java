package com.sawatruck.loader.view.design;

/**
 * Created by royalone on 2017-01-06.
 */

public interface DrawableClickListener {

    public static enum DrawablePosition { TOP, BOTTOM, LEFT, RIGHT };
    public void onClick(DrawablePosition target);
}
