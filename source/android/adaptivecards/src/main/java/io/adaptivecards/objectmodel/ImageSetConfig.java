/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ImageSetConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ImageSetConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImageSetConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(ImageSetConfig obj) {
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
        AdaptiveCardObjectModelJNI.delete_ImageSetConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setImageSize(ImageSize value) {
    AdaptiveCardObjectModelJNI.ImageSetConfig_imageSize_set(swigCPtr, this, value.swigValue());
  }

  public ImageSize getImageSize() {
    return ImageSize.swigToEnum(AdaptiveCardObjectModelJNI.ImageSetConfig_imageSize_get(swigCPtr, this));
  }

  public void setMaxImageHeight(long value) {
    AdaptiveCardObjectModelJNI.ImageSetConfig_maxImageHeight_set(swigCPtr, this, value);
  }

  public long getMaxImageHeight() {
    return AdaptiveCardObjectModelJNI.ImageSetConfig_maxImageHeight_get(swigCPtr, this);
  }

  public static ImageSetConfig Deserialize(JsonValue json, ImageSetConfig defaultValue) {
    return new ImageSetConfig(AdaptiveCardObjectModelJNI.ImageSetConfig_Deserialize(JsonValue.getCPtr(json), json, ImageSetConfig.getCPtr(defaultValue), defaultValue), true);
  }

  public ImageSetConfig() {
    this(AdaptiveCardObjectModelJNI.new_ImageSetConfig(), true);
  }

}
