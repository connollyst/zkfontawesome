package org.zkoss.fontawesome;

/**
 * Available Font Awesome icon sizes.
 * <p>
 * Refere to the Font Awesome documentation on <a
 * href="http://fortawesome.github.io/Font-Awesome/examples/#larger-icons"
 * >sizes</a> for more.
 * </p>
 *
 * @author Sean Connolly
 */
public enum IconSize {

	NORMAL("normal"),

	LARGE("large"),

	X2("2x"),

	X3("3x"),

	X4("4x");

	private final String css;

	private IconSize(String css) {
		this.css = css;
	}

	@Override
	public String toString() {
		return css;
	}

}
