package org.snapscript.android.game;

import android.graphics.Canvas;

public interface Panel {
   void onStart(Frame frame);
   void onPause(Frame frame);
   void onRender(Frame frame, Canvas canvas);
   void onUpdate(Frame frame, Canvas canvas);
   void onChanged(Frame frame, int format, int width, int height);
   void onDestroyed(Frame frame);
   void onRightToLeftSwipe(Frame frame);
   void onLeftToRightSwipe(Frame frame);
   void onTopToBottomSwipe(Frame frame);
   void onBottomToTopSwipe(Frame frame);
   void onClick(Frame frame, int x, int y);
}