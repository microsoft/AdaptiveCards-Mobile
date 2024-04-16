/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum ActionAlignment {
  Left(0),
  Center,
  Right,
  Stretch;

  public final int swigValue() {
    return swigValue;
  }

  public static ActionAlignment swigToEnum(int swigValue) {
    ActionAlignment[] swigValues = ActionAlignment.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ActionAlignment swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ActionAlignment.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ActionAlignment() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ActionAlignment(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ActionAlignment(ActionAlignment swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

