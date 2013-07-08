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
	private boolean border = false;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		type = cleanOrDefault(type, DEFAULT_TYPE);
		if (!this.type.equals(type)) {
			this.type = type;
			smartUpdate("type", this.type);
		}
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		size = cleanOrDefault(size, DEFAULT_SIZE);
		if (!this.size.equals(size)) {
			this.size = size;
			smartUpdate("size", this.size);
		}
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
		pull = cleanOrDefault(pull, IconPull.NONE.name());
		setPull(IconPull.valueOf(pull.toUpperCase()));
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

	public boolean getBorder() {
		return border;
	}

	public void setBorder(boolean border) {
		if (this.border != border) {
			this.border = border;
			smartUpdate("border", this.border);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void renderProperties(ContentRenderer renderer)
			throws IOException {
		super.renderProperties(renderer);
		render(renderer, "type", type);
		render(renderer, "size", size);
		render(renderer, "pull", pull);
		render(renderer, "muted", muted);
		render(renderer, "border", border);
	}

	private String cleanOrDefault(String value, String defaultValue) {
		if (value == null || value.trim().isEmpty()) {
			value = defaultValue;
		}
		return value.trim();
	}
}
