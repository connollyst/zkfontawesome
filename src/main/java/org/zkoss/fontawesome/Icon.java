package org.zkoss.fontawesome;

import java.io.IOException;

import org.zkoss.zk.ui.sys.ContentRenderer;
import org.zkoss.zul.impl.XulElement;

/**
 * @author Sean Connolly
 */
public class Icon extends XulElement {

	private String type = "";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (!this.type.equals(type)) {
			this.type = type;
			smartUpdate("type", this.type);
		}
	}

	protected void renderProperties(ContentRenderer renderer)
			throws IOException {
		super.renderProperties(renderer);
		render(renderer, "type", type);
	}

}
