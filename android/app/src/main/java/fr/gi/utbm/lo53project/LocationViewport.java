package fr.gi.utbm.lo53project;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

/**
 * Created by celian on 05/05/15 for LO53Project
 */
public class LocationViewport extends AbstractViewport{

    public LocationViewport(Context context, AttributeSet attrs, WorldMap map) {
        super(context, attrs, map);
    }

    @Override
    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);

        for (Position p : mMap.getPositions()) {
            canvas.drawPoint(p.x, p.y, mMap.paints.get(p.type));
        }
    }

}