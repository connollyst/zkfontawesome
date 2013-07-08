package org.zkoss.fontawesome;

import java.io.IOException;

import org.zkoss.zk.ui.sys.ContentRenderer;
import org.zkoss.zul.impl.XulElement;

/**
 * A <a href="http://fortawesome.github.io/Font-Awesome/">Font Awesome</a> icon.
 *
 * @author Sean Connolly
 */
public class Icon extends XulElement {

	private static final String DEFAULT_TYPE = "icon-thumbs-up";
	private static final String DEFAULT_SIZE = "normal";

	private String type = DEFAULT_TYPE;
	private String size = DEFAULT_SIZE;
	private IconPull pull = IconPull.NONE;
	private boolean muted = false;

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

	public boolean getMuted() {
		return muted;
	}

	public void setMuted(boolean muted) {
		if (this.muted != muted) {
			this.muted = muted;
			smartUpdate("muted", this.muted);
		}
	}

	public void setMuted(String muted) {
		setMuted(Boolean.valueOf(muted));
	}

	/**
	 * Get the icon pull: to the left, right, or none.
	 *
	 * @return the icon pull
	 */
	public IconPull getPull() {
		return pull;
	}

	/**
	 * Get the icon pull: to the left, right, or none.
	 *
	 * @param pull
	 *            the icon pull
	 */
	public void setPull(IconPull pull) {
		if (pull == null) {
			pull = IconPull.NONE;
		}
		if (!this.pull.equals(pull)) {
			this.pull = pull;
			smartUpdate("pull", this.pull);
		}
	}

	/**
	 * Get the icon pull: to the left, right, or none.<br/>
	 * Note: this setter is tolerant to leading and trailing whitespace and is
	 * case invariant. However, best practices (and performance) would favor
	 * using {@link #setPull(IconPull)} instead.
	 *
	 * @param pull
	 *            the icon pull
	 * @throws IllegalAccessError
	 *             if the string does not translate
	 */
	public void setPull(String pull) {
		if (pull == null) {
			setPull(IconPull.NONE);
		} else {
			setPull(IconPull.valueOf(pull.trim().toUpperCase()));
		}
	}

	protected void renderProperties(ContentRenderer renderer)
			throws IOException {
		super.renderProperties(renderer);
		render(renderer, "type", type);
		render(renderer, "size", size);
		render(renderer, "muted", muted);
		render(renderer, "pull", pull);
	}

}
