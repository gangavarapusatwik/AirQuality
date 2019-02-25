/**
 * IsDeviceExistOfUserTempDataListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class IsDeviceExistOfUserTempDataListResponse  implements java.io.Serializable {
    private java.lang.String isDeviceExistOfUserTempDataListResult;

    public IsDeviceExistOfUserTempDataListResponse() {
    }

    public IsDeviceExistOfUserTempDataListResponse(
           java.lang.String isDeviceExistOfUserTempDataListResult) {
           this.isDeviceExistOfUserTempDataListResult = isDeviceExistOfUserTempDataListResult;
    }


    /**
     * Gets the isDeviceExistOfUserTempDataListResult value for this IsDeviceExistOfUserTempDataListResponse.
     * 
     * @return isDeviceExistOfUserTempDataListResult
     */
    public java.lang.String getIsDeviceExistOfUserTempDataListResult() {
        return isDeviceExistOfUserTempDataListResult;
    }


    /**
     * Sets the isDeviceExistOfUserTempDataListResult value for this IsDeviceExistOfUserTempDataListResponse.
     * 
     * @param isDeviceExistOfUserTempDataListResult
     */
    public void setIsDeviceExistOfUserTempDataListResult(java.lang.String isDeviceExistOfUserTempDataListResult) {
        this.isDeviceExistOfUserTempDataListResult = isDeviceExistOfUserTempDataListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsDeviceExistOfUserTempDataListResponse)) return false;
        IsDeviceExistOfUserTempDataListResponse other = (IsDeviceExistOfUserTempDataListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isDeviceExistOfUserTempDataListResult==null && other.getIsDeviceExistOfUserTempDataListResult()==null) || 
             (this.isDeviceExistOfUserTempDataListResult!=null &&
              this.isDeviceExistOfUserTempDataListResult.equals(other.getIsDeviceExistOfUserTempDataListResult())));
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
        if (getIsDeviceExistOfUserTempDataListResult() != null) {
            _hashCode += getIsDeviceExistOfUserTempDataListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsDeviceExistOfUserTempDataListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">IsDeviceExistOfUserTempDataListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeviceExistOfUserTempDataListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IsDeviceExistOfUserTempDataListResult"));
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
