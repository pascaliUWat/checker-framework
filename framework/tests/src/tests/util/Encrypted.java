package tests.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.checkerframework.framework.qual.*;

import com.sun.source.tree.Tree.Kind;

/**
 * Denotes an object with a representation that has been encrypted.
 */
@SubtypeOf(Unqualified.class)
@ImplicitFor(trees = { Kind.NULL_LITERAL })
@DefaultFor({ TypeUseLocation.LOWER_BOUND })
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Encrypted {}
