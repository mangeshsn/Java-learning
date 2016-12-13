package com.core.overriding;

/**
 * The synchronized modifier has no effect on the rules of overriding. The
 * synchronized modifier relates to the acquiring and releasing of a monitor
 * object in multi-threaded context, therefore it has totally no effect on the
 * rules of overriding. That means a synchronized method can override a
 * non-synchronized one and vice versa.
 * 
 * 
 * The strictfp modifier has no effect on the rules of overriding. That means
 * the presence or absence of the strictfp modifier has absolutely no effect on
 * the rules of overriding: it’s possible that a FP-strict method can override a
 * non-FP-strict one and vice-versa.
 *
 */
public class StrictfpAndSynchronized {

}
