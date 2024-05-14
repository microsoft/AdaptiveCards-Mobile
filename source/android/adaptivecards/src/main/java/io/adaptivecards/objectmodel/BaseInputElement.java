/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class BaseInputElement extends BaseCardElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BaseInputElement(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.BaseInputElement_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BaseInputElement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_BaseInputElement(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BaseInputElement() {
    this(AdaptiveCardObjectModelJNI.new_BaseInputElement__SWIG_0(), true);
  }

  public BaseInputElement(CardElementType elementType) {
    this(AdaptiveCardObjectModelJNI.new_BaseInputElement__SWIG_1(elementType.swigValue()), true);
  }

  public BaseInputElement(CardElementType type, Spacing spacing, boolean separator, HeightType height, TargetWidthType targetWidthType) {
    this(AdaptiveCardObjectModelJNI.new_BaseInputElement__SWIG_2(type.swigValue(), spacing.swigValue(), separator, height.swigValue(), targetWidthType.swigValue()), true);
  }

  public String GetLabel() {
    return AdaptiveCardObjectModelJNI.BaseInputElement_GetLabel(swigCPtr, this);
  }

  public void SetLabel(String label) {
    AdaptiveCardObjectModelJNI.BaseInputElement_SetLabel(swigCPtr, this, label);
  }

  public boolean GetIsRequired() {
    return AdaptiveCardObjectModelJNI.BaseInputElement_GetIsRequired(swigCPtr, this);
  }

  public void SetIsRequired(boolean isRequired) {
    AdaptiveCardObjectModelJNI.BaseInputElement_SetIsRequired(swigCPtr, this, isRequired);
  }

  public String GetErrorMessage() {
    return AdaptiveCardObjectModelJNI.BaseInputElement_GetErrorMessage(swigCPtr, this);
  }

  public void SetErrorMessage(String errorMessage) {
    AdaptiveCardObjectModelJNI.BaseInputElement_SetErrorMessage(swigCPtr, this, errorMessage);
  }

  public SWIGTYPE_p_std__shared_ptrT_ValueChangedAction_t GetValueChangedAction() {
    return new SWIGTYPE_p_std__shared_ptrT_ValueChangedAction_t(AdaptiveCardObjectModelJNI.BaseInputElement_GetValueChangedAction(swigCPtr, this), true);
  }

  public void SetValueChangedAction(SWIGTYPE_p_std__shared_ptrT_ValueChangedAction_t value) {
    AdaptiveCardObjectModelJNI.BaseInputElement_SetValueChangedAction(swigCPtr, this, SWIGTYPE_p_std__shared_ptrT_ValueChangedAction_t.getCPtr(value));
  }

  public static BaseInputElement DeserializeBasePropertiesFromString(ParseContext context, String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.BaseInputElement_DeserializeBasePropertiesFromString(ParseContext.getCPtr(context), context, jsonString);
    return (cPtr == 0) ? null : new BaseInputElement(cPtr, true);
  }

  public static BaseInputElement DeserializeBaseProperties(ParseContext context, JsonValue json) {
    long cPtr = AdaptiveCardObjectModelJNI.BaseInputElement_DeserializeBaseProperties(ParseContext.getCPtr(context), context, JsonValue.getCPtr(json), json);
    return (cPtr == 0) ? null : new BaseInputElement(cPtr, true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.BaseInputElement_SerializeToJsonValue(swigCPtr, this), true);
  }

  public static BaseInputElement dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.BaseInputElement_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new BaseInputElement(cPtr, true);
  }

}
