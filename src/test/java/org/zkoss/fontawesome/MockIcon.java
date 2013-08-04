package org.zkoss.fontawesome;

import java.util.List;

/**
 * A mock extension of the {@link Icon} for testing purposes.
 *
 * @author Sean Connolly
 */
public class MockIcon extends Icon {

	private List<String> attributesUpdated;

	public void clearSmartUpdates() {
		attributesUpdated.clear();
	}

	@Override
	protected void smartUpdate(String attr, Object value) {
		super.smartUpdate(attr, value);
	}

	public boolean wasSmartUpdated(String attr) {
		return attributesUpdated.contains(attr);
	}

}
