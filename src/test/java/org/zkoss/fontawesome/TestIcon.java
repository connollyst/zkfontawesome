package org.zkoss.fontawesome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test cases for {@link Icon}.
 *
 * @author Sean Connolly
 */
public class TestIcon {

	@Test
	public void testType() {
		Icon icon = new Icon();
		icon.setType("some-type");
		assertEquals("some-type", icon.getType());
	}

	@Test
	public void testTypeDefaultWithNullString() {
		Icon icon = new Icon();
		icon.setType(null);
		assertEquals("icon-thumbs-up", icon.getType());
	}

	@Test
	public void testTypeDefaultWithEmptyString() {
		Icon icon = new Icon();
		icon.setType(" ");
		assertEquals("icon-thumbs-up", icon.getType());
	}

	@Test
	public void testTypeDefaultWithWhitespaceString() {
		Icon icon = new Icon();
		icon.setType("    \t    \n    ");
		assertEquals("icon-thumbs-up", icon.getType());
	}

	@Test
	public void testTypeWithLeadingWhitespace() {
		Icon icon = new Icon();
		icon.setType("  some-type");
		assertEquals("some-type", icon.getType());
	}

	@Test
	public void testTypeWithTrailingWhitespace() {
		Icon icon = new Icon();
		icon.setType("some-type  ");
		assertEquals("some-type", icon.getType());
	}

	@Test
	public void testTypeWithSurroundingWhitespace() {
		Icon icon = new Icon();
		icon.setType("  some-type  ");
		assertEquals("some-type", icon.getType());
	}

	@Test
	public void testPullNoneByNullIconPull() {
		Icon icon = new Icon();
		IconPull pull = null;
		icon.setPull(pull);
		assertEquals(IconPull.NONE, icon.getPull());
	}

	@Test
	public void testPullNoneByNullString() {
		Icon icon = new Icon();
		String pull = null;
		icon.setPull(pull);
		assertEquals(IconPull.NONE, icon.getPull());
	}

	@Test
	public void testPullNoneByEmptyString() {
		assertPullNone("");
	}

	@Test
	public void testPullNoneByWhitespaceString() {
		assertPullNone("    \t    \n    ");
	}

	@Test
	public void testPullRightByTextUpper() {
		assertPullRight("RIGHT");
	}

	@Test
	public void testPullRightByTextUpperWithPrePadding() {
		assertPullRight("  RIGHT");
	}

	@Test
	public void testPullRightByTextUpperWithPostPadding() {
		assertPullRight("RIGHT  ");
	}

	@Test
	public void testPullRightByTextUpperWithPadding() {
		assertPullRight("  RIGHT  ");
	}

	@Test
	public void testPullRightByTextLower() {
		assertPullRight("right");
	}

	@Test
	public void testPullRightByTextLowerWithPrePadding() {
		assertPullRight("  right");
	}

	@Test
	public void testPullRightByTextLowerWithPostPadding() {
		assertPullRight("right  ");
	}

	@Test
	public void testPullRightByTextLowerWithPadding() {
		assertPullRight("  right  ");
	}

	@Test
	public void testPullLeftByTextUpper() {
		assertPullLeft("LEFT");
	}

	@Test
	public void testPullLeftByTextUpperWithPrePadding() {
		assertPullLeft("  LEFT");
	}

	@Test
	public void testPullLeftByTextUpperWithPostPadding() {
		assertPullLeft("LEFT  ");
	}

	@Test
	public void testPullLeftByTextUpperWithPadding() {
		assertPullLeft("  LEFT  ");
	}

	@Test
	public void testPullLeftByTextLower() {
		assertPullLeft("left");
	}

	@Test
	public void testPullLeftByTextLowerWithPrePadding() {
		assertPullLeft("  left");
	}

	@Test
	public void testPullLeftByTextLowerWithPostPadding() {
		assertPullLeft("left  ");
	}

	@Test
	public void testPullLeftByTextLowerWithPadding() {
		assertPullLeft("  left  ");
	}

	@Test
	public void testPullNoneByTextUpper() {
		assertPullNone("NONE");
	}

	@Test
	public void testPullNoneByTextUpperWithPrePadding() {
		assertPullNone("  NONE");
	}

	@Test
	public void testPullNoneByTextUpperWithPostPadding() {
		assertPullNone("NONE  ");
	}

	@Test
	public void testPullNoneByTextUpperWithPadding() {
		assertPullNone("  NONE  ");
	}

	@Test
	public void testPullNoneByTextLower() {
		assertPullNone("none");
	}

	@Test
	public void testPullNoneByTextLowerWithPrePadding() {
		assertPullNone("  none");
	}

	@Test
	public void testPullNoneByTextLowerWithPostPadding() {
		assertPullNone("none  ");
	}

	@Test
	public void testPullNoneByTextLowerWithPadding() {
		assertPullNone("  none  ");
	}

	private void assertPullRight(String givenPull) {
		assertPull(IconPull.RIGHT, givenPull);
	}

	private void assertPullLeft(String givenPull) {
		assertPull(IconPull.LEFT, givenPull);
	}

	private void assertPullNone(String givenPull) {
		assertPull(IconPull.NONE, givenPull);
	}

	private void assertPull(IconPull expectedPull, String givenPull) {
		Icon icon = new Icon();
		icon.setPull(givenPull);
		assertEquals(expectedPull, icon.getPull());
	}
}
