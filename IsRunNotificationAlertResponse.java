/**
 * IsRunNotificationAlertResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class IsRunNotificationAlertResponse  implements java.io.Serializable {
    private java.lang.String isRunNotificationAlertResult;

    public IsRunNotificationAlertResponse() {
    }

    public IsRunNotificationAlertResponse(
           java.lang.String isRunNotificationAlertResult) {
           this.isRunNotificationAlertResult = isRunNotificationAlertResult;
    }


    /**
     * Gets the isRunNotificationAlertResult value for this IsRunNotificationAlertResponse.
     * 
     * @return isRunNotificationAlertResult
     */
    public java.lang.String getIsRunNotificationAlertResult() {
        return isRunNotificationAlertResult;
    }


    /**
     * Sets the isRunNotificationAlertResult value for this IsRunNotificationAlertResponse.
     * 
     * @param isRunNotificationAlertResult
     */
    public void setIsRunNotificationAlertResult(java.lang.String isRunNotificationAlertResult) {
        this.isRunNotificationAlertResult = isRunNotificationAlertResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsRunNotificationAlertResponse)) return false;
        IsRunNotificationAlertResponse other = (IsRunNotificationAlertResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isRunNotificationAlertResult==null && other.getIsRunNotificationAlertResult()==null) || 
             (this.isRunNotificationAlertResult!=null &&
              this.isRunNotificationAlertResult.equals(other.getIsRunNotificationAlertResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIsRunNotificationAlertResult() != null) {
            _hashCode += getIsRunNotificationAlertResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsRunNotificationAlertResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">IsRunNotificationAlertResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRunNotificationAlertResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IsRunNotificationAlertResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
