/**
 * GetAllCountryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllCountryResponse  implements java.io.Serializable {
    private java.lang.String getAllCountryResult;

    public GetAllCountryResponse() {
    }

    public GetAllCountryResponse(
           java.lang.String getAllCountryResult) {
           this.getAllCountryResult = getAllCountryResult;
    }


    /**
     * Gets the getAllCountryResult value for this GetAllCountryResponse.
     * 
     * @return getAllCountryResult
     */
    public java.lang.String getGetAllCountryResult() {
        return getAllCountryResult;
    }


    /**
     * Sets the getAllCountryResult value for this GetAllCountryResponse.
     * 
     * @param getAllCountryResult
     */
    public void setGetAllCountryResult(java.lang.String getAllCountryResult) {
        this.getAllCountryResult = getAllCountryResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllCountryResponse)) return false;
        GetAllCountryResponse other = (GetAllCountryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllCountryResult==null && other.getGetAllCountryResult()==null) || 
             (this.getAllCountryResult!=null &&
              this.getAllCountryResult.equals(other.getGetAllCountryResult())));
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
        if (getGetAllCountryResult() != null) {
            _hashCode += getGetAllCountryResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllCountryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllCountryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllCountryResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllCountryResult"));
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
