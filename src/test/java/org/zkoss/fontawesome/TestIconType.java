package org.zkoss.fontawesome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test cases for {@link Icon#setType(String)} and the advanced constructor
 * {@link Icon(String)}.
 *
 * @author Sean Connolly
 */
public class TestIconType {

	private String FAKE_TYPE = "fake-type";
	private String DEFAULT_TYPE = "icon-thumbs-up";

	@Test
	public void testType() {
		Icon icon = new Icon();
		icon.setType(FAKE_TYPE);
		assertEquals(FAKE_TYPE, icon.getType());
	}

	@Test
	public void testTypeDefaultWithNullString() {
		Icon icon = new Icon();
		icon.setType(null);
		assertEquals(DEFAULT_TYPE, icon.getType());
	}

	@Test
	public void testTypeDefaultWithEmptyString() {
		Icon icon = new Icon();
		icon.setType(" ");
		assertEquals(DEFAULT_TYPE, icon.getType());
	}

	@Test
	public void testTypeDefaultWithWhitespaceString() {
		Icon icon = new Icon();
		icon.setType("    \t    \n    ");
		assertEquals(DEFAULT_TYPE, icon.getType());
	}

	@Test
	public void testTypeWithLeadingWhitespace() {
		Icon icon = new Icon();
		icon.setType("  " + FAKE_TYPE);
		assertEquals(FAKE_TYPE, icon.getType());
	}

	@Test
	public void testTypeWithTrailingWhitespace() {
		Icon icon = new Icon();
		icon.setType(FAKE_TYPE + "  ");
		assertEquals(FAKE_TYPE, icon.getType());
	}

	@Test
	public void testTypeWithSurroundingWhitespace() {
		Icon icon = new Icon();
		icon.setType("  " + FAKE_TYPE + "  ");
		assertEquals(FAKE_TYPE, icon.getType());
	}

}
