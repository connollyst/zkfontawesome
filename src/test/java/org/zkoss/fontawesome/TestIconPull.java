package org.zkoss.fontawesome;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Test cases for {@link Icon#setPull(IconPull)}.
 *
 * @author Sean Connolly
 */
public class TestIconPull {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testSizeErrorIfInvalid() {
		Icon icon = new Icon();
		String pull = "wrong";
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("'wrong' is not a valid icon pull.");
		icon.setPull(pull);
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
	public void testPullNone() {
		Icon icon = new Icon();
		IconPull pull = IconPull.NONE;
		icon.setPull(pull);
		assertEquals(pull, icon.getPull());
	}

	@Test
	public void testPullLeft() {
		Icon icon = new Icon();
		IconPull pull = IconPull.LEFT;
		icon.setPull(pull);
		assertEquals(pull, icon.getPull());
	}

	@Test
	public void testPullRight() {
		Icon icon = new Icon();
		IconPull pull = IconPull.RIGHT;
		icon.setPull(pull);
		assertEquals(pull, icon.getPull());
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

	/* Test smart update */

	@Test
	public void testNoSmartUpdateOnConstruction() {
		MockIcon icon = new MockIcon();
		assertFalse(icon.wasSmartUpdated("pull"));
	}

	@Test
	public void testNoSmartUpdateOnChangeToNoneFromDefault() {
		MockIcon icon = new MockIcon();
		icon.setPull(IconPull.NONE);
		// The default should be NONE, so no update needed
		assertFalse(icon.wasSmartUpdated("pull"));
	}

	@Test
	public void testSmartUpdateOnChangeToLeftFromDefault() {
		MockIcon icon = new MockIcon();
		icon.setPull(IconPull.LEFT);
		assertTrue(icon.wasSmartUpdated("pull"));
	}

	@Test
	public void testSmartUpdateOnChangeToRightFromDefault() {
		MockIcon icon = new MockIcon();
		icon.setPull(IconPull.RIGHT);
		assertTrue(icon.wasSmartUpdated("pull"));
	}

	@Test
	public void testNoSmartUpdateOnChangeToNoneFromNone() {
		MockIcon icon = new MockIcon();
		icon.setPull(IconPull.NONE);
		icon.clearSmartUpdates();
		icon.setPull(IconPull.NONE);
		assertFalse(icon.wasSmartUpdated("pull"));
	}

	@Test
	public void testSmartUpdateOnChangeToNoneFromLeft() {
		MockIcon icon = new MockIcon();
		icon.setPull(IconPull.LEFT);
		icon.clearSmartUpdates();
		icon.setPull(IconPull.NONE);
		assertTrue(icon.wasSmartUpdated("pull"));
	}

	@Test
	public void testSmartUpdateOnChangeToNoneFromRight() {
		MockIcon icon = new MockIcon();
		icon.setPull(IconPull.RIGHT);
		icon.clearSmartUpdates();
		icon.setPull(IconPull.NONE);
		assertTrue(icon.wasSmartUpdated("pull"));
	}

	@Test
	public void testSmartUpdateOnChangeToLeftFromNone() {
		MockIcon icon = new MockIcon();
		icon.setPull(IconPull.NONE);
		icon.clearSmartUpdates();
		icon.setPull(IconPull.LEFT);
		assertTrue(icon.wasSmartUpdated("pull"));
	}

	@Test
	public void testNoSmartUpdateOnChangeToLeftFromLeft() {
		MockIcon icon = new MockIcon();
		icon.setPull(IconPull.LEFT);
		icon.clearSmartUpdates();
		icon.setPull(IconPull.LEFT);
		assertFalse(icon.wasSmartUpdated("pull"));
	}

	@Test
	public void testSmartUpdateOnChangeToLeftFromRight() {
		MockIcon icon = new MockIcon();
		icon.setPull(IconPull.RIGHT);
		icon.clearSmartUpdates();
		icon.setPull(IconPull.LEFT);
		assertTrue(icon.wasSmartUpdated("pull"));
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
