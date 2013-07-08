package org.zkoss.fontawesome;

import java.io.IOException;

import org.zkoss.zk.ui.sys.ContentRenderer;
import org.zkoss.zul.impl.XulElement;

/**
 * @author Sean Connolly
 */
public class Icon extends XulElement {

    private static final String DEFAULT_TYPE = "icon-thumbs-up";
	private static final String DEFAULT_SIZE = "normal";
	private String type = "";
	private String size = DEFAULT_SIZE;

	public String getType() {
		return type;
	}

	public void setType(String type) {
        if (type == null) {
            type = DEFAULT_TYPE;
        }
		if (!this.type.equals(type)) {
			this.type = type;
			smartUpdate("type", this.type);
		}
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		if (size == null) {
			size = DEFAULT_SIZE;
		}
		if (!this.size.equals(size)) {
			this.size = size;
			smartUpdate("size", this.size);
		}
	}

	protected void renderProperties(ContentRenderer renderer)
			throws IOException {
		super.renderProperties(renderer);
		render(renderer, "type", type);
		render(renderer, "size", size);
	}

}
