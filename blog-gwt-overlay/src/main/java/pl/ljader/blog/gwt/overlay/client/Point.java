package pl.ljader.blog.gwt.overlay.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Point extends JavaScriptObject {
	protected Point() {
	}

	public static native Point create(JavaScriptObject jso)/*-{
		return new $wnd.Proj4js.Point(jso.x, jso.y);
	}-*/;

	public native final double getX()/*-{
		return this.x;
	}-*/;

	public native final double getY()/*-{
		return this.y;
	}-*/;

}
