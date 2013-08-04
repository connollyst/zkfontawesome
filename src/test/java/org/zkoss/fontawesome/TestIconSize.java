package org.zkoss.fontawesome;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Test cases for {@link Icon#setSize(String)} and
 * {@link Icon#setSize(IconSize)}.
 *
 * @author Sean Connolly
 */
public class TestIconSize {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testSizeErrorIfInvalid() {
		Icon icon = new Icon();
		String size = "wrong";
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("'wrong' is not a valid icon size.");
		icon.setSize(size);
	}

	@Test
	public void testSizeNormalByNullIconSize() {
		Icon icon = new Icon();
		IconSize size = null;
		icon.setSize(size);
		assertEquals(IconSize.NORMAL, icon.getSize());
	}

	@Test
	public void testSizeNormalByNullString() {
		Icon icon = new Icon();
		String size = null;
		icon.setSize(size);
		assertEquals(IconSize.NORMAL, icon.getSize());
	}

	@Test
	public void testSizeNormal() {
		Icon icon = new Icon();
		IconSize size = IconSize.NORMAL;
		icon.setSize(size);
		assertEquals(size, icon.getSize());
	}

	@Test
	public void testSizeLarge() {
		Icon icon = new Icon();
		IconSize size = IconSize.LARGE;
		icon.setSize(size);
		assertEquals(size, icon.getSize());
	}

	@Test
	public void testSizeTwoX() {
		Icon icon = new Icon();
		IconSize size = IconSize.X2;
		icon.setSize(size);
		assertEquals(size, icon.getSize());
	}

	@Test
	public void testSizeThreeX() {
		Icon icon = new Icon();
		IconSize size = IconSize.X3;
		icon.setSize(size);
		assertEquals(size, icon.getSize());
	}

	@Test
	public void testSizeFourX() {
		Icon icon = new Icon();
		IconSize size = IconSize.X4;
		icon.setSize(size);
		assertEquals(size, icon.getSize());
	}

	/* Test default values */

	@Test
	public void testSizeNormalByEmptyString() {
		assertSizeNormal("");
	}

	@Test
	public void testSizeNormalByWhitespaceString() {
		assertSizeNormal("    \t    \n    ");
	}

	/* Test 'normal */

	@Test
	public void testSizeNormalByTextUpper() {
		assertSizeNormal("NORMAL");
	}

	@Test
	public void testSizeNormalByTextUpperWithPrePadding() {
		assertSizeNormal("  NORMAL");
	}

	@Test
	public void testSizeNormalByTextUpperWithPostPadding() {
		assertSizeNormal("NORMAL  ");
	}

	@Test
	public void testSizeNormalByTextUpperWithPadding() {
		assertSizeNormal("  NORMAL  ");
	}

	@Test
	public void testSizeNormalByTextLower() {
		assertSizeNormal("normal");
	}

	@Test
	public void testSizeNormalByTextLowerWithPrePadding() {
		assertSizeNormal("  normal");
	}

	@Test
	public void testSizeNormalByTextLowerWithPostPadding() {
		assertSizeNormal("normal  ");
	}

	@Test
	public void testSizeNormalByTextLowerWithPadding() {
		assertSizeNormal("  normal  ");
	}

	/* Test 'large' */

	@Test
	public void testSizeLargeByTextUpper() {
		assertSizeLarge("LARGE");
	}

	@Test
	public void testSizeLargeByTextUpperWithPrePadding() {
		assertSizeLarge("  LARGE");
	}

	@Test
	public void testSizeLargeByTextUpperWithPostPadding() {
		assertSizeLarge("LARGE  ");
	}

	@Test
	public void testSizeLargeByTextUpperWithPadding() {
		assertSizeLarge("  LARGE  ");
	}

	@Test
	public void testSizeLargeByTextLower() {
		assertSizeLarge("large");
	}

	@Test
	public void testSizeLargeByTextLowerWithPrePadding() {
		assertSizeLarge("  large");
	}

	@Test
	public void testSizeLargeByTextLowerWithPostPadding() {
		assertSizeLarge("large  ");
	}

	@Test
	public void testSizeLargeByTextLowerWithPadding() {
		assertSizeLarge("  large  ");
	}

	/* Test '2X' */

	@Test
	public void testSize2xByTextUpper() {
		assertSizeTwoX("2X");
	}

	@Test
	public void testSize2xByTextUpperWithPrePadding() {
		assertSizeTwoX("  2X");
	}

	@Test
	public void testSize2xByTextUpperWithPostPadding() {
		assertSizeTwoX("2X  ");
	}

	@Test
	public void testSize2xByTextUpperWithPadding() {
		assertSizeTwoX("  2X  ");
	}

	@Test
	public void testSize2xByTextLower() {
		assertSizeTwoX("2x");
	}

	@Test
	public void testSize2xByTextLowerWithPrePadding() {
		assertSizeTwoX("  2x");
	}

	@Test
	public void testSize2xByTextLowerWithPostPadding() {
		assertSizeTwoX("2x  ");
	}

	@Test
	public void testSize2xByTextLowerWithPadding() {
		assertSizeTwoX("  2x  ");
	}

	@Test
	public void testSizeX2ByTextUpper() {
		assertSizeTwoX("x2");
	}

	@Test
	public void testSizeX2ByTextUpperWithPrePadding() {
		assertSizeTwoX("  x2");
	}

	@Test
	public void testSizeX2ByTextUpperWithPostPadding() {
		assertSizeTwoX("x2  ");
	}

	@Test
	public void testSizeX2ByTextUpperWithPadding() {
		assertSizeTwoX("  x2  ");
	}

	@Test
	public void testSizeX2ByTextLower() {
		assertSizeTwoX("x2");
	}

	@Test
	public void testSizeX2ByTextLowerWithPrePadding() {
		assertSizeTwoX("  x2");
	}

	@Test
	public void testSizeX2ByTextLowerWithPostPadding() {
		assertSizeTwoX("x2  ");
	}

	@Test
	public void testSizeX2ByTextLowerWithPadding() {
		assertSizeTwoX("  x2  ");
	}

	/* Test '3X' */

	@Test
	public void testSize3xByTextUpper() {
		assertSizeThreeX("3X");
	}

	@Test
	public void testSize3xByTextUpperWithPrePadding() {
		assertSizeThreeX("  3X");
	}

	@Test
	public void testSize3xByTextUpperWithPostPadding() {
		assertSizeThreeX("3X  ");
	}

	@Test
	public void testSize3xByTextUpperWithPadding() {
		assertSizeThreeX("  3X  ");
	}

	@Test
	public void testSize3xByTextLower() {
		assertSizeThreeX("3x");
	}

	@Test
	public void testSize3xByTextLowerWithPrePadding() {
		assertSizeThreeX("  3x");
	}

	@Test
	public void testSize3xByTextLowerWithPostPadding() {
		assertSizeThreeX("3x  ");
	}

	@Test
	public void testSize3xByTextLowerWithPadding() {
		assertSizeThreeX("  3x  ");
	}

	@Test
	public void testSizeX3ByTextUpper() {
		assertSizeThreeX("x3");
	}

	@Test
	public void testSizeX3ByTextUpperWithPrePadding() {
		assertSizeThreeX("  x3");
	}

	@Test
	public void testSizeX3ByTextUpperWithPostPadding() {
		assertSizeThreeX("x3  ");
	}

	@Test
	public void testSizeX3ByTextUpperWithPadding() {
		assertSizeThreeX("  x3  ");
	}

	@Test
	public void testSizeX3ByTextLower() {
		assertSizeThreeX("x3");
	}

	@Test
	public void testSizeX3ByTextLowerWithPrePadding() {
		assertSizeThreeX("  x3");
	}

	@Test
	public void testSizeX3ByTextLowerWithPostPadding() {
		assertSizeThreeX("x3  ");
	}

	@Test
	public void testSizeX3ByTextLowerWithPadding() {
		assertSizeThreeX("  x3  ");
	}

	/* Test '4X' */

	@Test
	public void testSize4xByTextUpper() {
		assertSizeFourX("4X");
	}

	@Test
	public void testSize4xByTextUpperWithPrePadding() {
		assertSizeFourX("  4X");
	}

	@Test
	public void testSize4xByTextUpperWithPostPadding() {
		assertSizeFourX("4X  ");
	}

	@Test
	public void testSize4xByTextUpperWithPadding() {
		assertSizeFourX("  4X  ");
	}

	@Test
	public void testSize4xByTextLower() {
		assertSizeFourX("4x");
	}

	@Test
	public void testSize4xByTextLowerWithPrePadding() {
		assertSizeFourX("  4x");
	}

	@Test
	public void testSize4xByTextLowerWithPostPadding() {
		assertSizeFourX("4x  ");
	}

	@Test
	public void testSize4xByTextLowerWithPadding() {
		assertSizeFourX("  4x  ");
	}

	@Test
	public void testSizeX4ByTextUpper() {
		assertSizeFourX("x4");
	}

	@Test
	public void testSizeX4ByTextUpperWithPrePadding() {
		assertSizeFourX("  x4");
	}

	@Test
	public void testSizeX4ByTextUpperWithPostPadding() {
		assertSizeFourX("x4  ");
	}

	@Test
	public void testSizeX4ByTextUpperWithPadding() {
		assertSizeFourX("  x4  ");
	}

	@Test
	public void testSizeX4ByTextLower() {
		assertSizeFourX("x4");
	}

	@Test
	public void testSizeX4ByTextLowerWithPrePadding() {
		assertSizeFourX("  x4");
	}

	@Test
	public void testSizeX4ByTextLowerWithPostPadding() {
		assertSizeFourX("x4  ");
	}

	@Test
	public void testSizeX4ByTextLowerWithPadding() {
		assertSizeFourX("  x4  ");
	}

	private void assertSizeNormal(String givenSize) {
		assertSize(IconSize.NORMAL, givenSize);
	}

	private void assertSizeLarge(String givenSize) {
		assertSize(IconSize.LARGE, givenSize);
	}

	private void assertSizeTwoX(String givenSize) {
		assertSize(IconSize.X2, givenSize);
	}

	private void assertSizeThreeX(String givenSize) {
		assertSize(IconSize.X3, givenSize);
	}

	private void assertSizeFourX(String givenSize) {
		assertSize(IconSize.X4, givenSize);
	}

	private void assertSize(IconSize expectedSize, String givenSize) {
		Icon icon = new Icon();
		icon.setSize(givenSize);
		assertEquals(expectedSize, icon.getSize());
	}

}
