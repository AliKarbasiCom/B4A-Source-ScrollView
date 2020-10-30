package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_main{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[main/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="ScrollView1.SetLeftAndRight(0%x,100%x)"[main/General script]
views.get("scrollview1").vw.setLeft((int)((0d / 100 * width)));
views.get("scrollview1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 4;BA.debugLine="ScrollView1.SetTopAndBottom(0%y,50%y)"[main/General script]
views.get("scrollview1").vw.setTop((int)((0d / 100 * height)));
views.get("scrollview1").vw.setHeight((int)((50d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 6;BA.debugLine="HorizontalScrollView1.SetLeftAndRight(0%x,100%x)"[main/General script]
views.get("horizontalscrollview1").vw.setLeft((int)((0d / 100 * width)));
views.get("horizontalscrollview1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 7;BA.debugLine="HorizontalScrollView1.SetTopAndBottom(50%y,100%y)"[main/General script]
views.get("horizontalscrollview1").vw.setTop((int)((50d / 100 * height)));
views.get("horizontalscrollview1").vw.setHeight((int)((100d / 100 * height) - ((50d / 100 * height))));

}
}