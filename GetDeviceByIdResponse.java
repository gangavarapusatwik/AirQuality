/**
 * GetDeviceByIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDeviceByIdResponse  implements java.io.Serializable {
    private java.lang.String getDeviceByIdResult;

    public GetDeviceByIdResponse() {
    }

    public GetDeviceByIdResponse(
           java.lang.String getDeviceByIdResult) {
           this.getDeviceByIdResult = getDeviceByIdResult;
    }


    /**
     * Gets the getDeviceByIdResult value for this GetDeviceByIdResponse.
     * 
     * @return getDeviceByIdResult
     */
    public java.lang.String getGetDeviceByIdResult() {
        return getDeviceByIdResult;
    }


    /**
     * Sets the getDeviceByIdResult value for this GetDeviceByIdResponse.
     * 
     * @param getDeviceByIdResult
     */
    public void setGetDeviceByIdResult(java.lang.String getDeviceByIdResult) {
        this.getDeviceByIdResult = getDeviceByIdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeviceByIdResponse)) return false;
        GetDeviceByIdResponse other = (GetDeviceByIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDeviceByIdResult==null && other.getGetDeviceByIdResult()==null) || 
             (this.getDeviceByIdResult!=null &&
              this.getDeviceByIdResult.equals(other.getGetDeviceByIdResult())));
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
        if (getGetDeviceByIdResult() != null) {
            _hashCode += getGetDeviceByIdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDeviceByIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDeviceByIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDeviceByIdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDeviceByIdResult"));
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
