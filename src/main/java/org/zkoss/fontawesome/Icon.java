package org.zkoss.fontawesome;

import java.io.IOException;

import org.zkoss.zk.ui.sys.ContentRenderer;
import org.zkoss.zul.impl.XulElement;

/**
 * A <a href="http://fortawesome.github.io/Font-Awesome/">Font Awesome</a> icon.<br/>
 * The type of icon to render is specified by the {@link #setType(String)}. The
 * comprehensive list of {@code types} can be found on the original project's
 * website <a href="http://fortawesome.github.io/Font-Awesome/icons/">here</a>.
 *
 * @author Sean Connolly
 */
public class Icon extends XulElement {

	private static final String DEFAULT_TYPE = "fa-thumbs-up";

	private String type = DEFAULT_TYPE;
	private IconSize size = IconSize.NORMAL;
	private IconPull pull = IconPull.NONE;
	private boolean muted = false;
	private boolean border = false;

	/**
	 * Construct a Font Awesome icon.
	 */
	public Icon() {
	}

	/**
	 * Construct a Font Awesome icon of the given {@code type}.<br/>
	 * Refer to the original project for <a
	 * href="http://fortawesome.github.io/Font-Awesome/icons/"></a>valid
	 * types</a>.
	 *
	 * @param type
	 *            the type of icon
	 */
	public Icon(String type) {
		this.type = type;
	}

	/**
	 * Get the type of icon being displayed.
	 *
	 * @return the type of icon
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the type of icon to display.<br/>
	 * Refer to the Font Awesome documentation for a list of <a
	 * href="http://fortawesome.github.io/Font-Awesome/icons/">icon types</a>.
	 *
	 * @param type
	 *            the type of icon
	 */
	public void setType(String type) {
		type = cleanOrDefault(type, DEFAULT_TYPE);
		if (!this.type.equals(type)) {
			this.type = type;
			smartUpdate("type", this.type);
		}
	}

	/**
	 * Get the icon size.
	 *
	 * @return the size of the icon
	 */
	public IconSize getSize() {
		return size;
	}

	/**
	 * Set the icon size. Valid values are {@code "normal"}, {@code "large"},
	 * {@code "2x"}, {@code "3x"}, and {@code "4x"}<br/>
	 * Note: this setter is tolerant to leading and trailing whitespace and is
	 * case invariant. However, best practices (and performance) would favor
	 * using {@link #setSize(IconSize)} instead.
	 * <p>
	 * Refer to the Font Awesome documentation on <a href=
	 * "http://fortawesome.github.io/Font-Awesome/examples/#larger-icons"
	 * >larger icons</a> for more.
	 * </p>
	 *
	 * @param size
	 *            the size of the icon
	 */
	public void setSize(String size) {
		String sizeText = cleanOrDefault(size, IconSize.NORMAL.name());
		sizeText = sizeText.toUpperCase();
		IconSize iconSize;
		try {
			// try to infer the enum
			iconSize = IconSize.valueOf(sizeText);
		} catch (IllegalArgumentException iae1) {
			// reverse the text and try again (eg '2x' vs 'x2')
			sizeText = new StringBuffer(sizeText).reverse().toString();
			try {
				iconSize = IconSize.valueOf(sizeText);
			} catch (IllegalArgumentException iae2) {
				throw new IllegalArgumentException("'" + size
						+ "' is not a valid icon size.");
			}
		}
		setSize(iconSize);
	}

	/**
	 * Set the icon size.<br/>
	 * <p>
	 * Refer to the Font Awesome documentation on <a href=
	 * "http://fortawesome.github.io/Font-Awesome/examples/#larger-icons"
	 * >larger icons</a> for more.
	 * </p>
	 *
	 * @param size
	 *            the size of the icon
	 */
	public void setSize(IconSize size) {
		if (size == null) {
			size = IconSize.NORMAL;
		}
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
	 * <p>
	 * Refer to the Font Awesome documentation on <a href=
	 * "http://fortawesome.github.io/Font-Awesome/examples/#bordered-pulled"
	 * >pulled icons</a> for more.
	 * </p>
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
	 * <p>
	 * Refer to the Font Awesome documentation on <a href=
	 * "http://fortawesome.github.io/Font-Awesome/examples/#bordered-pulled"
	 * >pulled icons</a> for more.
	 * </p>
	 *
	 *
	 * @param pull
	 *            the icon pull
	 * @throws IllegalAccessError
	 *             if the string does not translate
	 */
	public void setPull(String pull) {
		pull = cleanOrDefault(pull, IconPull.NONE.name());
		IconPull iconPull;
		try {
			iconPull = IconPull.valueOf(pull.toUpperCase());
		} catch (IllegalArgumentException iae) {
			throw new IllegalArgumentException("'" + pull
					+ "' is not a valid icon pull.");
		}
		setPull(iconPull);
	}

	/**
	 * Get the icon muted state; muted icons are displayed grey to reduce
	 * emphasis.
	 *
	 * @return the icon muted state
	 */
	public boolean getMuted() {
		return muted;
	}

	/**
	 * Set the icon muted state; muted icons are displayed grey to reduce
	 * emphasis.
	 *
	 * @param muted
	 *            the icon muted state
	 */
	public void setMuted(boolean muted) {
		if (this.muted != muted) {
			this.muted = muted;
			smartUpdate("muted", this.muted);
		}
	}

	/**
	 * Get the border state of the icon, on or off.
	 *
	 * @return the border state
	 */
	public boolean getBorder() {
		return border;
	}

	/**
	 * Set the border state of the icon, on or off.<br/>
	 * <p>
	 * Refer to the Font Awesome documentation on <a href=
	 * "http://fortawesome.github.io/Font-Awesome/examples/#bordered-pulled"
	 * >icon borders</a> for more.
	 * </p>
	 *
	 * @param border
	 *            the border state
	 */
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
