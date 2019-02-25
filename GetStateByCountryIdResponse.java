/**
 * GetStateByCountryIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetStateByCountryIdResponse  implements java.io.Serializable {
    private java.lang.String getStateByCountryIdResult;

    public GetStateByCountryIdResponse() {
    }

    public GetStateByCountryIdResponse(
           java.lang.String getStateByCountryIdResult) {
           this.getStateByCountryIdResult = getStateByCountryIdResult;
    }


    /**
     * Gets the getStateByCountryIdResult value for this GetStateByCountryIdResponse.
     * 
     * @return getStateByCountryIdResult
     */
    public java.lang.String getGetStateByCountryIdResult() {
        return getStateByCountryIdResult;
    }


    /**
     * Sets the getStateByCountryIdResult value for this GetStateByCountryIdResponse.
     * 
     * @param getStateByCountryIdResult
     */
    public void setGetStateByCountryIdResult(java.lang.String getStateByCountryIdResult) {
        this.getStateByCountryIdResult = getStateByCountryIdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStateByCountryIdResponse)) return false;
        GetStateByCountryIdResponse other = (GetStateByCountryIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStateByCountryIdResult==null && other.getGetStateByCountryIdResult()==null) || 
             (this.getStateByCountryIdResult!=null &&
              this.getStateByCountryIdResult.equals(other.getGetStateByCountryIdResult())));
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
        if (getGetStateByCountryIdResult() != null) {
            _hashCode += getGetStateByCountryIdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStateByCountryIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetStateByCountryIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStateByCountryIdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStateByCountryIdResult"));
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
