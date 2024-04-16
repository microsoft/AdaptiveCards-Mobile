/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class TextStylesConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TextStylesConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TextStylesConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(TextStylesConfig obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_TextStylesConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHeading(TextStyleConfig value) {
    AdaptiveCardObjectModelJNI.TextStylesConfig_heading_set(swigCPtr, this, TextStyleConfig.getCPtr(value), value);
  }

  public TextStyleConfig getHeading() {
    long cPtr = AdaptiveCardObjectModelJNI.TextStylesConfig_heading_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TextStyleConfig(cPtr, false);
  }

  public void setColumnHeader(TextStyleConfig value) {
    AdaptiveCardObjectModelJNI.TextStylesConfig_columnHeader_set(swigCPtr, this, TextStyleConfig.getCPtr(value), value);
  }

  public TextStyleConfig getColumnHeader() {
    long cPtr = AdaptiveCardObjectModelJNI.TextStylesConfig_columnHeader_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TextStyleConfig(cPtr, false);
  }

  public static TextStylesConfig Deserialize(JsonValue json, TextStylesConfig defaultValue) {
    return new TextStylesConfig(AdaptiveCardObjectModelJNI.TextStylesConfig_Deserialize(JsonValue.getCPtr(json), json, TextStylesConfig.getCPtr(defaultValue), defaultValue), true);
  }

  public TextStylesConfig() {
    this(AdaptiveCardObjectModelJNI.new_TextStylesConfig(), true);
  }

}
