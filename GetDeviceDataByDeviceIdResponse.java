/**
 * GetDeviceDataByDeviceIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDeviceDataByDeviceIdResponse  implements java.io.Serializable {
    private java.lang.String getDeviceDataByDeviceIdResult;

    public GetDeviceDataByDeviceIdResponse() {
    }

    public GetDeviceDataByDeviceIdResponse(
           java.lang.String getDeviceDataByDeviceIdResult) {
           this.getDeviceDataByDeviceIdResult = getDeviceDataByDeviceIdResult;
    }


    /**
     * Gets the getDeviceDataByDeviceIdResult value for this GetDeviceDataByDeviceIdResponse.
     * 
     * @return getDeviceDataByDeviceIdResult
     */
    public java.lang.String getGetDeviceDataByDeviceIdResult() {
        return getDeviceDataByDeviceIdResult;
    }


    /**
     * Sets the getDeviceDataByDeviceIdResult value for this GetDeviceDataByDeviceIdResponse.
     * 
     * @param getDeviceDataByDeviceIdResult
     */
    public void setGetDeviceDataByDeviceIdResult(java.lang.String getDeviceDataByDeviceIdResult) {
        this.getDeviceDataByDeviceIdResult = getDeviceDataByDeviceIdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeviceDataByDeviceIdResponse)) return false;
        GetDeviceDataByDeviceIdResponse other = (GetDeviceDataByDeviceIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDeviceDataByDeviceIdResult==null && other.getGetDeviceDataByDeviceIdResult()==null) || 
             (this.getDeviceDataByDeviceIdResult!=null &&
              this.getDeviceDataByDeviceIdResult.equals(other.getGetDeviceDataByDeviceIdResult())));
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
        if (getGetDeviceDataByDeviceIdResult() != null) {
            _hashCode += getGetDeviceDataByDeviceIdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDeviceDataByDeviceIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDeviceDataByDeviceIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDeviceDataByDeviceIdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDeviceDataByDeviceIdResult"));
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
