package de.tu_dortmund.validation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Enum of all possible types with some each types' properties
 */
public enum Type {
	GAME(false, false, "x", "y", "width", "height", "w", "h", "speed"), //
	INTEGER(false, false), //
	INTEGER_ARRAY(true, false), //
	RECTANGLE(false, true, "x", "y", "width", "height", "w", "h", "visible", "animation_block"), //
	TRIANGLE(false, true, "x", "y", "width", "height", "w", "h", "visible", "animation_block"), //
	CIRCLE(false, true, "x", "y", "radius", "r", "visible", "animation_block"), //
	RECTANGLE_ARRAY(true, false), //
	TRIANGLE_ARRAY(true, false), //
	CIRCLE_ARRAY(true, false), //
	ANIMATION_HANDLER(false, false);

	private boolean indexable;
	private boolean touchable;
	private Set<String> attrs;

	private Type(boolean indexable, boolean touchable, String... attrs) {
		this.indexable = indexable;
		this.touchable = touchable;
		this.attrs = new HashSet<>(Arrays.asList(attrs));
	}

	public boolean isIndexable() {
		return indexable;
	}

	public boolean isTouchable() {
		return touchable;
	}

	public boolean hasAttr(String attr) {
		return attrs.contains(attr);
	}
}
