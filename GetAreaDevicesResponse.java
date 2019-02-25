/**
 * GetAreaDevicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAreaDevicesResponse  implements java.io.Serializable {
    private java.lang.String getAreaDevicesResult;

    public GetAreaDevicesResponse() {
    }

    public GetAreaDevicesResponse(
           java.lang.String getAreaDevicesResult) {
           this.getAreaDevicesResult = getAreaDevicesResult;
    }


    /**
     * Gets the getAreaDevicesResult value for this GetAreaDevicesResponse.
     * 
     * @return getAreaDevicesResult
     */
    public java.lang.String getGetAreaDevicesResult() {
        return getAreaDevicesResult;
    }


    /**
     * Sets the getAreaDevicesResult value for this GetAreaDevicesResponse.
     * 
     * @param getAreaDevicesResult
     */
    public void setGetAreaDevicesResult(java.lang.String getAreaDevicesResult) {
        this.getAreaDevicesResult = getAreaDevicesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAreaDevicesResponse)) return false;
        GetAreaDevicesResponse other = (GetAreaDevicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAreaDevicesResult==null && other.getGetAreaDevicesResult()==null) || 
             (this.getAreaDevicesResult!=null &&
              this.getAreaDevicesResult.equals(other.getGetAreaDevicesResult())));
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
        if (getGetAreaDevicesResult() != null) {
            _hashCode += getGetAreaDevicesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAreaDevicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAreaDevicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAreaDevicesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAreaDevicesResult"));
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
