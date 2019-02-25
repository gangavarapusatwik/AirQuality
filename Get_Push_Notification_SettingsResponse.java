/**
 * Get_Push_Notification_SettingsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Get_Push_Notification_SettingsResponse  implements java.io.Serializable {
    private java.lang.String get_Push_Notification_SettingsResult;

    public Get_Push_Notification_SettingsResponse() {
    }

    public Get_Push_Notification_SettingsResponse(
           java.lang.String get_Push_Notification_SettingsResult) {
           this.get_Push_Notification_SettingsResult = get_Push_Notification_SettingsResult;
    }


    /**
     * Gets the get_Push_Notification_SettingsResult value for this Get_Push_Notification_SettingsResponse.
     * 
     * @return get_Push_Notification_SettingsResult
     */
    public java.lang.String getGet_Push_Notification_SettingsResult() {
        return get_Push_Notification_SettingsResult;
    }


    /**
     * Sets the get_Push_Notification_SettingsResult value for this Get_Push_Notification_SettingsResponse.
     * 
     * @param get_Push_Notification_SettingsResult
     */
    public void setGet_Push_Notification_SettingsResult(java.lang.String get_Push_Notification_SettingsResult) {
        this.get_Push_Notification_SettingsResult = get_Push_Notification_SettingsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Push_Notification_SettingsResponse)) return false;
        Get_Push_Notification_SettingsResponse other = (Get_Push_Notification_SettingsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Push_Notification_SettingsResult==null && other.getGet_Push_Notification_SettingsResult()==null) || 
             (this.get_Push_Notification_SettingsResult!=null &&
              this.get_Push_Notification_SettingsResult.equals(other.getGet_Push_Notification_SettingsResult())));
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
        if (getGet_Push_Notification_SettingsResult() != null) {
            _hashCode += getGet_Push_Notification_SettingsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Push_Notification_SettingsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Push_Notification_SettingsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Push_Notification_SettingsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Push_Notification_SettingsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
